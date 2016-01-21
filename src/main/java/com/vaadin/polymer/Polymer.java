package com.vaadin.polymer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jsinterop.annotations.JsType;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Timer;
import com.vaadin.polymer.Polymer.PolymerRoot.Base;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.elemental.HTMLElement;

@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class Polymer {

    private static PolymerRoot Polymer;
    public static Base Base;

    @JsType(isNative=true, name="Polymer")
    public interface PolymerRoot {

        @JsType(isNative=true, namespace="Polymer")
        public interface Base {
            /**
             * Returns the first node in this element’s local DOM that matches selector.
             */
            Element $$(String selector);

            /**
             * Toggles the named boolean class on the node, adding the class if bool is
             * truthy and removing it if bool is falsey.
             */
            void toggleClass(String name, boolean b, Element node);

            /**
             * Toggles the named boolean attribute on the node.
             */
            void toggleAttribute(String name, boolean b, Element node);

            /**
             * Moves a boolean attribute from oldNode to newNode, unsetting the attribute
             * (if set) on oldNode and setting it on newNode
             */
            void attributeFollows(String name, Element newNode, Element oldNode);

            /**
             *  Moves a class from oldNode to newNode, removing the class (if present)
             *  on oldNode and adding it to newNode.
             */
            void classFollows(String name, Element newNode, Element oldNode);


            /**
             * Fires a custom event. The options object can contain the following properties:
             *    node: Node to fire the event on (defaults to this).
             *    bubbles: Whether the event should bubble. Defaults to true.
             *    cancelable: Whether the event can be canceled with preventDefault. Defaults to false.
             */
            void fire(String type, JavaScriptObject detail, JavaScriptObject options);

            /**
             * Calls method asynchronously. If no wait time is specified, runs tasks with microtask
             * timing (after the current method finishes, but before the next event from the event
             * queue is processed). Returns a handle that can be used to cancel the task.
             */
            Object async(Function method, int wait);

            /**
             * Cancels the identified async task.
             */
            void cancelAsync(Object handle);

            /**
             *  Applies a CSS transform to the specified node, or host element if no node is
             *  specified. transform is specified as a string. For example:
             *    transform('rotateX(90deg)', elm);
             */
            void transform(String transform, Element node);

            /**
             * Transforms the specified node, or host element if no node is specified. For example:
             *   translate3d('100px', '100px', '100px', elm);
             */
            void translate3d(String x, String y, String z, Element node);

            /**
             *  Dynamically imports an HTML document.
             */
            void importHref(String href, Function onload, Function onerror);

            /**
             * Takes a URL relative to the <dom-module> of an imported Polymer element, and returns
             * a path relative to the current document. This method can be used, for example,
             * to refer to an asset delivered alongside an HTML import.
             */
            String resolveUrl(String url);
        }

        void updateStyles();
    }


    private static Set<String> urlImported = new HashSet<>();

    /**
     * Inserts the appropriate &lt;import&gt; of a component given by url.
     *
     * @param href either an absolute url or a path relative to bower_components folder.
     */
    public static void importHref(String href) {
        importHref(href, null, null);
    }

    /**
     * Inserts the appropriate &lt;import&gt; of a component given by url.
     *
     * @param href either an absolute url or a path relative to bower_components folder.
     * @param ok callback to run in case of success
     */
    public static void importHref(String href, Function ok) {
        importHref(href, ok, null);
    }

    private static String absoluteHref(String hrefOrTag) {
        if (!hrefOrTag.startsWith("http")) {
            // It's a tag
            if (hrefOrTag.matches("[\\w-]+")) {
                hrefOrTag = hrefOrTag + "/" + hrefOrTag;
            }
            // It's not prefixed with the bower_components convention
            if (!hrefOrTag.startsWith("bower_components")) {
                hrefOrTag = "bower_components/" + hrefOrTag;
            }
            // Not ending with html
            if (!hrefOrTag.matches(".*\\.html$")) {
                hrefOrTag += ".html";
            }
            hrefOrTag = GWT.getModuleBaseForStaticFiles() + hrefOrTag;
        }
        return hrefOrTag;
    }

    private static native void whenPolymerLoaded(Function ok)
    /*-{
        function done() {
          // Set our static reference to Base
          @com.vaadin.polymer.Polymer::Polymer = $wnd.Polymer;
          @com.vaadin.polymer.Polymer::Base = $wnd.Polymer.Base;
          // Polymer dynamic loaded does not remove unresolved
          $doc.body.removeAttribute('unresolved');
          //
          ok.@com.vaadin.polymer.elemental.Function::call(*)();
        }
        if (!$wnd.Polymer) {
            var l = $doc.createElement('link');
            l.rel = 'import';
            l.href = @com.vaadin.polymer.Polymer::absoluteHref(*)('polymer');
            l.onload = done;
            $doc.head.appendChild(l);
        } else {
           done();
        }
    }-*/;

    /**
     * Inserts the appropriate &lt;import&gt; of a component given by url.
     *
     * @param hrefOrTag it can be an absolute url, a relative path or a tag name.
     *                  - if it is a relative path, we prefix it with bower_components
     *                  in case it is not already prefixed.
     *                  - if it is a tag, we compose the relative url:
     *                  bower_components/tagName/tagName.html
     * @param ok callback to run in case of success
     * @param err callback to run in case of failure
     */
    public static void importHref(String hrefOrTag, final Function ok, final Function err) {
        final String href = absoluteHref(hrefOrTag);
        if (!urlImported.contains(href)) {
            if (!isRegistered(href)) {
                whenPolymerLoaded(new Function() {
                    public Object call(Object arg) {
                        Base.importHref(href, ok, err);
                        return null;
                    }
                });
                return;
            }
            urlImported.add(href);
        }
        if (ok != null) {
            Base.importHref(href, ok, err);
        }
    }

    /**
     * Inserts the appropriate &lt;import&gt; of a list of components
     *
     * @param hrefs a list of absolute urls or relative paths to load.
     */
    public static void importHref(final List<String> hrefs) {
        importHref(hrefs, null, null);
    }

    /**
     * Inserts the appropriate &lt;import&gt; of a list of components
     *
     * @param hrefs a list of absolute urls or relative paths to load.
     * @param ok callback to run in case of all import success
     * @param err callback to run in case of failure
     */
    public static void importHref(final List<String> hrefs, final Function ok) {
        importHref(hrefs, ok, null);
    }

    /**
     * Inserts the appropriate &lt;import&gt; of a list of components
     *
     * @param hrefs a list of absolute urls or relative paths to load.
     * @param ok callback to run in case of all import success
     * @param err callback to run in case of failure
     */
    public static void importHref(final List<String> hrefs, final Function ok, Function err) {
        Function allOk = ok == null ? ok : new Function() {
            int count = hrefs.size();
            public Object call(Object arg) {
                if (--count == 0) {
                    ok.call(arg);
                }
                return null;
            }
        };
        for (String href : hrefs) {
            importHref(href, allOk, err);
        }
    }

    /**
     * Returns a new instance of the Element. It loads the web component
     * from the bower_components/src url if it was not loaded yet.
     */
    public static <T> T createElement(final String tagName, final String... imports) {
        final T e = (T)Document.get().createElement(tagName);
        if (imports.length > 0) {
            ensureCustomElement(e, imports);
        } else {
            ensureCustomElement(e, tagName);
        }
        return e;
    }

    public static <T> void ensureCustomElement(final T elem, String... imports) {
        if (isRegisteredElement(elem)) {
            return;
        }
        // Delay this so as the developer gets an early version of the element and
        // can assign properties soon.
        new Timer() {
            public void run() {
                // We need to remove ownProperties from the element when it's not
                // registered because a bug in Polymer 1.0.x
                // https://github.com/Polymer/polymer/issues/1882
                saveProperties((Element)elem);
            }
        }.schedule(0);
        // Import all necessary stuff for this element
        for (String src : imports) {
            importHref(src, null, null);
        }
        // Wait until everything is ready
        whenReady(new Function(){
            public Object call(Object arg) {
                // Restore saved ownProperties
                restoreProperties((Element)elem);
                return null;
            }
        }, (Element)elem);
    }

    /**
     * Returns a new instance of the Element. It loads the web component
     * from the bower_components/tagName/tagName.html url if not loaded yet.
     */
    public static <T> T createElement(String tagName) {
        return createElement(tagName, new String[]{});
    }

    /**
     * Returns the JsInterop instance of Document
     */
    public static com.vaadin.polymer.elemental.Document getDocument() {
        return (com.vaadin.polymer.elemental.Document)Document.get();
    }

    /**
     * Return true if the element is already registered.
     * Useful when components are loaded previously, i.e. when vulcanizing imports.
     */
    private static boolean isRegistered(String hrefOrTag) {
        Element e = Document.get().createElement(hrefOrTag.replaceFirst("^.*/(.+).html$", "$1"));
        return isRegisteredElement(e);
    }

    /**
     * Check whether a certain custom element has been registered.
     */
    private native static boolean isRegisteredElement(Object e)
    /*-{
        return !!e && e.constructor !== $wnd.HTMLElement && e.constructor != $wnd.HTMLUnknownElement;
    }-*/;

    public static void ready(HTMLElement e, Function f) {
        whenReady(f, (Element)e);
    }

    public static void ready(Element e, Function f) {
        whenReady(f, e);
    }

    /**
     * Update all style elements on the page.
     */
    public static void updateStyles() {
        Polymer.updateStyles();
    }

    /**
     * Restore all properties saved previously to the element was
     * registered.
     *
     * Hack for: https://github.com/Polymer/polymer/issues/1882
     */
    private static native void restoreProperties(Element e)
    /*-{
        if (e && e.__o) {
            @com.vaadin.polymer.Polymer::onReady(*)(e, function(){
                for (i in e.__o) {
                    e[i] = e.__o[i];
                }
                delete e.__o;
            });
        }
    }-*/;

    /**
     * Executes a function after all imports have been loaded.
     */
    public static void whenReady(Function f) {
        whenReady(f, null);
    }

    /**
     * Executes a function after all imports have been loaded and when the
     * passed element is ready to use.
     */
    public static native void whenReady(Function f, Element e)
    /*-{
        $wnd.HTMLImports.whenReady(!e ? f : function() {
          var id = setInterval(function() {
            if (@com.vaadin.polymer.Polymer::isRegisteredElement(*)(e)) {
              clearInterval(id);
              f(e);
            }
          }, 0);
        });
    }-*/;

    /**
     * If an element is not ready, loops until it gets ready, then
     * run a Function (JsFunction or JavaFunction)
     */
    @Deprecated
    private static void onReady(Element e, Object f) {
        whenReady((Function)f, e);
    }

    /**
     * Read all element properties and save in a JS object in the element,
     * so as we can restore then once the element is registered.
     *
     * We consider all ownProperties but those beginning or ending with '_'
     * which is the symbol used by webcomponentjs to store private info.
     *
     * Hack for: https://github.com/Polymer/polymer/issues/1882
     *
     * TODO: this is a temporary workaround, and if the issue is not fixed in
     * polymer we could eventually implement the fix based on a generated proxy
     * per component to store for a while any method call.
     */
    private static native boolean saveProperties(Element e)
    /*-{
        if (!@com.vaadin.polymer.Polymer::isRegisteredElement(*)(e)) {
            var o = {};
            for (i in e) {
                if (e.hasOwnProperty(i) && !/(^_|_$)/.test(i)) {
                    o[i] = e[i];
                    delete(e[i]);
                    e.__o = o;
                }
            }
        }
    }-*/;

    /**
     * Utility method to show a loading element if there is no one in
     * hosting page.
     */
    public static void startLoading() {
        Element l = DOM.getElementById("loading");
        if (l == null) {
            l = DOM.createDiv();
            l.setAttribute("style", "position:fixed;top:0px;left:0px;width:100%;text-align:center;font-family:arial;font-size:24px;color:#4285f4;");
            l.setId("loading");
            l.setInnerText("loading" + "...");
            Document.get().getBody().appendChild(l);
        }
    }

    public static void endLoading(final Element container, Element webcomponent) {
        endLoading(container, webcomponent, null);
    }

    /**
     * Utility method to remove a loading message and show a container when a
     * web component becomes available.
     *
     * @param container : The container to show when the component is available
     * @param webcomponent : Web component to monitor
     * @param callback : Calback function
     */
    public static void endLoading(final Element container, Element webcomponent, final Function func) {
        container.getStyle().setOpacity(0);
        container.getStyle().setProperty("transition", "opacity 1.1s");
        ready(webcomponent, new Function() {
            public Object call(Object arg) {
                reFlow();
                container.getStyle().setOpacity(1);
                DOM.getElementById("loading").getStyle().setOpacity(0);
                return func != null ? func.call(arg) : null;
            }
        });
    }

    /**
     * Force a browser re-flow. For some reason in Chrome we need to force
     * it the very first time we initialize the UI. It seems it happens with
     * widgets and no with elements but not 100% positive. To test it try
     * to reload the app in SDM and do not move the mouse, moving or clicking
     * mouse on body also makes the UI re-draw.
     *
     */
    private static native void reFlow()
    /*-{
      if (navigator.userAgent.toLowerCase().indexOf('chrome') > -1) {
        var c = 0;
        var id = setInterval(function() {
         // Using $doc.body.offsetWidth in an if, otherwise closure
         // compiler prunes it.
         if (c++ >= 20 && $doc.body.offsetWidth > 0)
          clearInterval(id);
       }, 50);
      }
    }-*/;

    /**
     * Box a native JS array in a Java List. It does not have any performance
     * penalty because we directly set the native array of the super ArrayList
     * implementation.
     */
    public static native <T> List<T> asList(JavaScriptObject o)
    /*-{
        var l = @java.util.ArrayList::new()();
        l.@java.util.ArrayList::array = o;
        return l;
    }-*/;

    /**
     * UnBox the native JS array in a Java List. It does not have any performance
     * penalty because we directly take the native array of the super ArrayList
     * implementation.
     */
    public static native <T extends JavaScriptObject> JsArray<T> asJsArray(List<?> l)
    /*-{
        return l.@java.util.ArrayList::array;
    }-*/;

    /**
     * Utility method for getting a property for a JS object
     */
    public native static <T> T property(Object jso, String name)
    /*-{
       return jso[name] || null;
    }-*/;

    /**
     * Utility method for setting properties to JS objects.
     */
    public native static void property(Object jso, String name, Object value)
    /*-{
       jso[name] = value;
    }-*/;

    /**
     * Utility method for setting a function to a JS object.
     * Useful for binding functions to templates.
     */
    public static void function(Object jso, String name, Function fnc) {
        property(jso, name, fnc);
    }

    /**
     * Utility method for calling a function of a JS object.
     */
    public native static <T> T apply(Object jso, String methodName, Object... args)
    /*-{
       return jso[methodName].apply(jso, args);
    }-*/;

    public static native <T> T cast(Object o)
    /*-{
      return o;
    }-*/;
}

