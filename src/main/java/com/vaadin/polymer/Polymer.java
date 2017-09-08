package com.vaadin.polymer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Timer;

import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.elemental.HTMLElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class Polymer {

    private static PolymerRoot Polymer;
    public static Base Base;
    private static boolean hasHtmlImports = htmlImportsSupported();

    /**
     * Set the location of the bower_components for the application.
     * By default it is computed from the module base.
     *
     * Additionally this can be set from JS modifying the
     * `window.gwtBowerLocation` property.
     */
    @JsProperty(namespace = JsPackage.GLOBAL)
    public static native void setGwtBowerLocation(String s);

    @JsProperty(namespace = JsPackage.GLOBAL)
    public static native String getGwtBowerLocation();


    static {
        if (getGwtBowerLocation() == null) {
            String moduleBase = GWT.getModuleBaseForStaticFiles();
            String moduleName = GWT.getModuleName();
            // SSO linker does not set correctly the module base
            if (!moduleBase.contains(moduleName)) {
                moduleBase = moduleName + "/";
            }
            setGwtBowerLocation(moduleBase + "bower_components/");
        }
    }

    @JsType(isNative=true, namespace="Polymer")
    public interface DomApi {

        <T extends HTMLElement> T querySelector(String selector);

        JsArray querySelectorAll(String selector);

        void appendChild(Object el);

        JsArray children();
    }

    @JsType(isNative=true, namespace=GLOBAL)
    public interface PolymerRoot {
        void updateStyles();

        DomApi dom(Object el);
    }

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

    private static Set<String> urlImported = new HashSet<>();
    private static HashMap<String, List<Function>> whenImported = new HashMap<>();

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
            // Not ending with html or js
            if (!hrefOrTag.matches(".*\\.(html|js)$")) {
                hrefOrTag += ".html";
            }
            hrefOrTag = getGwtBowerLocation() + hrefOrTag;
        }
        return hrefOrTag;
    }

    // Loads Polymer once if not done yet, and queue all callbaks until ready
    private static native void whenPolymerLoaded(Function ok)
    /*-{
        function resolve() {
          // Set our static reference to Base
          @com.vaadin.polymer.Polymer::Polymer = $wnd.Polymer;
          @com.vaadin.polymer.Polymer::Base = $wnd.Polymer.Base;
          // Polymer dynamic loaded does not remove unresolved
          $doc.body.removeAttribute('unresolved');
        }
        if (!$wnd.Polymer) {
            // Dynamic load Polymer and wait until ready
            if (!$wnd._pending_oks) {
                $wnd._pending_oks = [ok];
                var l = $doc.createElement('link');
                l.rel = 'import';
                l.href = @com.vaadin.polymer.Polymer::absoluteHref(*)('polymer');
                l.onload = function() {
                  // Run all tasks waiting for Polymer be ready
                  $wnd._pending_oks.forEach(function(ok){ok()});
                  $wnd._pending_oks = undefined;
                  resolve();
                };
                $doc.head.appendChild(l);
            }
            $wnd._pending_oks.push(ok);
        } else {
            resolve();
            ok();
        }
    }-*/;

    /**
     * Inserts the appropriate &lt;import&gt; of a component given by url.
     * If the components is already registered it does not import anything so as
     * the user could import elements in the hosted page, or vulcanize them.
     * If the component is being imported, all callbacks are queued until ready.
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

        Function done = arg -> {
                urlImported.add(href);
                List<Function> pending = whenImported.get(href);
                if (pending != null) {
                    for (Function f : pending) {
                        f.call(null);
                    }
                }
                whenImported.remove(href);
                return null;
        };
        if (Base == null) {
            whenPolymerLoaded(arg -> {
                importHref(hrefOrTag, ok, err);
                return null;
            });
            return;
        }
        if (!urlImported.contains(href)) {
            if (!isRegistered(href)) {
                List<Function> pending = whenImported.get(href);
                if (pending == null) {
                    pending = new ArrayList<Function>();
                    whenImported.put(href, pending);
                    Base.importHref(href, done, err);
                }
                if (ok != null) {
                    pending.add(ok);
                }
                return;
            }
            urlImported.add(href);
        }
        if (ok != null) {
            ok.call(null);
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

        // Import all necessary stuff for this element
        for (String src : imports) {
            importHref(src, null, null);
        }
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
     * Executes a function after all imports have been loaded.
     */
    public static void whenReady(Function f) {
        whenReady(f, null);
    }

    private native static boolean htmlImportsSupported()
    /*-{
        return 'import' in $doc.createElement('link');
    }-*/;

    /**
     * Executes a function after all imports have been loaded and when the
     * passed element is ready to use.
     * For browsers not supporting html imports, it loads the webcomponentsjs polyfill.
     */
    public static native void whenReady(Function f, Element e)
    /*-{
        function registered() {
          if (e) {
              var id = setInterval(function() {
                if (@com.vaadin.polymer.Polymer::isRegisteredElement(*)(e)) {
                  clearInterval(id);
                  if (f) f(e);
                }
              }, 10);
          } else {
              if (f) f();
          }
        }
        function done() {
            $wnd.HTMLImports.whenReady(registered);
        }
        function loadPolyfill() {
            var s = $doc.createElement('script');
            s.src = @com.vaadin.polymer.Polymer::absoluteHref(*)
                        ('webcomponentsjs/webcomponents-lite.min.js');
            s.onreadystatechange = s.onload = done;
            $doc.head.appendChild(s);
        }
        if (!$wnd.HTMLImports) {
            if (@com.vaadin.polymer.Polymer::hasHtmlImports) {
                registered();
            } else {
                loadPolyfill();
            }
        } else {
           done();
        }
    }-*/;

    /**
     * If an element is not ready, loops until it gets ready, then
     * run a Function (JsFunction or JavaFunction)
     * @deprecated use {@link #whenReady(Function, Element)} instead.
     */
    @Deprecated
    private static void onReady(Element e, Object f) {
        whenReady((Function)f, e);
    }

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
     * In case that value is a JSON string it must be based to Polymer attribute setter
     * so as it's able to parse. Needed when setting json values in UIBinder.
     */
    public native static void property(HTMLElement jso, String name, String value)
    /*-{
        if (jso.setAttribute && /^[\[\{]/.test(value)) {
          jso.setAttribute(name.replace(/([a-z])([A-Z])/g, '$1-$2').toLowerCase(), value);
        } else {
          jso[name] = value;
        }
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

    /**
     * Return the dom API of one element.
     */
    public static DomApi dom(Object element) {
        return Polymer.dom(element);
    }
}

