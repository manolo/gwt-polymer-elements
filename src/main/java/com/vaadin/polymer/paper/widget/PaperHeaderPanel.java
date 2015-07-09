/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.content.widget.event.ContentScrollEvent;
import com.vaadin.polymer.content.widget.event.ContentScrollEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-header-panel</code> contains a header section and a content panel section.</p>
 * <p><strong>Important:</strong> The <code>paper-header-panel</code> will not display if its parent does not have a height.</p>
 * <p>Using layout classes, you can make the <code>paper-header-panel</code> fill the screen</p>
 * <pre><code>&lt;body class=&quot;fullbleed layout vertical&quot;&gt;
 *   &lt;paper-header-panel class=&quot;flex&quot;&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;div&gt;Hello World!&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *   &lt;/paper-header-panel&gt;
 * &lt;/body&gt;
 * 
 * 
 * </code></pre><p>Special support is provided for scrolling modes when one uses a paper-toolbar or equivalent for the<br>header section.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-header-panel&gt;
 *   &lt;paper-toolbar&gt;Header&lt;/paper-toolbar&gt;
 *   &lt;div&gt;Content goes here...&lt;/div&gt;
 * &lt;/paper-header-panel&gt;
 * 
 * 
 * </code></pre><p>If you want to use other than <code>paper-toolbar</code> for the header, add <code>paper-header</code> class to that<br>element.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-header-panel&gt;
 *   &lt;div class=&quot;paper-header&quot;&gt;Header&lt;/div&gt;
 *   &lt;div&gt;Content goes here...&lt;/div&gt;
 * &lt;/paper-header-panel&gt;
 * 
 * 
 * </code></pre><p>To have the content fit to the main area, use the <code>fit</code> class.</p>
 * <pre><code>&lt;paper-header-panel&gt;
 *   &lt;div class=&quot;paper-header&quot;&gt;standard&lt;/div&gt;
 *   &lt;div class=&quot;fit&quot;&gt;content fits 100% below the header&lt;/div&gt;
 * &lt;/paper-header-panel&gt;
 * 
 * 
 * </code></pre><p>Modes</p>
 * <p>Controls header and scrolling behavior. Options are <code>standard</code>, <code>seamed</code>, <code>waterfall</code>, <code>waterfall-tall</code>, <code>scroll</code> and<br><code>cover</code>. Default is <code>standard</code>.</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Mode</th>
 * <th>Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>standard</code></td>
 * <td>The header is a step above the panel. The header will consume the panel at the point of entry, preventing it from passing through to the opposite side.</td>
 * </tr>
 * <tr>
 * <td><code>seamed</code></td>
 * <td>The header is presented as seamed with the panel.</td>
 * </tr>
 * <tr>
 * <td><code>waterfall</code></td>
 * <td>Similar to standard mode, but header is initially presented as seamed with panel, but then separates to form the step.</td>
 * </tr>
 * <tr>
 * <td><code>waterfall-tall</code></td>
 * <td>The header is initially taller (<code>tall</code> class is added to the header). As the user scrolls, the header separates (forming an edge) while condensing (<code>tall</code> class is removed from the header).</td>
 * </tr>
 * <tr>
 * <td><code>scroll</code></td>
 * <td>The header keeps its seam with the panel, and is pushed off screen.</td>
 * </tr>
 * <tr>
 * <td><code>cover</code></td>
 * <td>The panel covers the whole <code>paper-header-panel</code> including the header. This allows user to style the panel in such a way that the panel is partially covering the header.</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>Example:</p>
 * <pre><code>&lt;paper-header-panel mode=&quot;waterfall&quot;&gt;
 *   &lt;div class=&quot;paper-header&quot;&gt;standard&lt;/div&gt;
 *   &lt;div class=&quot;content fit&quot;&gt;content fits 100% below the header&lt;/div&gt;
 * &lt;/paper-header-panel&gt;
 * 
 * 
 * 
 * </code></pre><p>Styling header panel:</p>
 * <p>To change the shadow that shows up underneath the header:</p>
 * <pre><code>paper-header-panel {
 *   --paper-header-panel-shadow: {
 *       height: 6px;
 *       bottom: -6px;
 *       box-shadow: inset 0px 5px 6px -3px rgba(0, 0, 0, 0.4);
 *   };
 * }
 * 
 * 
 * </code></pre><p>To change the panel container in different modes:</p>
 * <pre><code>paper-slider {
 *   --paper-header-panel-standard-container: {
 *     border: 1px solid gray;
 *   };
 * 
 *   --paper-header-panel-cover-container: {
 *     border: 1px solid gray;
 *   };
 * 
 *   --paper-header-panel-waterfall-container: {
 *     border: 1px solid gray;
 *   };
 * 
 *   --paper-header-panel-waterfall-tall-container: {
 *     border: 1px solid gray;
 *   };
 * }
 * 
 * 
 * </code></pre>
 */
public class PaperHeaderPanel extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperHeaderPanel() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperHeaderPanel(String html) {
        super(PaperHeaderPanelElement.TAG, PaperHeaderPanelElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.content.element.event.ContentScrollEvent.NAME,
                new com.vaadin.polymer.content.element.event.ContentScrollEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.content.element.event.ContentScrollEvent event) {
                fireEvent(new ContentScrollEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperHeaderPanelElement getPolymerElement() {
        return (PaperHeaderPanelElement) getElement();
    }


  
    /**
     * <p>If true, the scroller is at the top</p>
     *
     * JavaScript Info:
     * @property atTop
     * @type Boolean
     * 
     */
    public boolean getAtTop(){
        return getPolymerElement().getAtTop();
    }
    /**
     * <p>If true, the scroller is at the top</p>
     *
     * JavaScript Info:
     * @property atTop
     * @type Boolean
     * 
     */
    public void setAtTop(boolean value) {
        getPolymerElement().setAtTop(value);
    }
   
  

  
    /**
     * <p>Returns the header element</p>
     *
     * JavaScript Info:
     * @method header
     * 
     */
    public void header() {
        getPolymerElement().header();
    }
  

  
    /**
     * <p>Controls header and scrolling behavior. Options are<br><code>standard</code>, <code>seamed</code>, <code>waterfall</code>, <code>waterfall-tall</code>, <code>scroll</code> and<br><code>cover</code>. Default is <code>standard</code>.</p>
     * <p><code>standard</code>: The header is a step above the panel. The header will consume the<br>panel at the point of entry, preventing it from passing through to the<br>opposite side.</p>
     * <p><code>seamed</code>: The header is presented as seamed with the panel.</p>
     * <p><code>waterfall</code>: Similar to standard mode, but header is initially presented as<br>seamed with panel, but then separates to form the step.</p>
     * <p><code>waterfall-tall</code>: The header is initially taller (<code>tall</code> class is added to<br>the header).  As the user scrolls, the header separates (forming an edge)<br>while condensing (<code>tall</code> class is removed from the header).</p>
     * <p><code>scroll</code>: The header keeps its seam with the panel, and is pushed off screen.</p>
     * <p><code>cover</code>: The panel covers the whole <code>paper-header-panel</code> including the<br>header. This allows user to style the panel in such a way that the panel is<br>partially covering the header.</p>
     * <pre><code>&lt;paper-header-panel mode=&quot;cover&quot;&gt;
     *   &lt;paper-toolbar class=&quot;tall&quot;&gt;
     *     &lt;core-icon-button icon=&quot;menu&quot;&gt;&lt;/core-icon-button&gt;
     *   &lt;/paper-toolbar&gt;
     *   &lt;div class=&quot;content&quot;&gt;&lt;/div&gt;
     * &lt;/paper-header-panel&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    public String getMode(){
        return getPolymerElement().getMode();
    }
    /**
     * <p>Controls header and scrolling behavior. Options are<br><code>standard</code>, <code>seamed</code>, <code>waterfall</code>, <code>waterfall-tall</code>, <code>scroll</code> and<br><code>cover</code>. Default is <code>standard</code>.</p>
     * <p><code>standard</code>: The header is a step above the panel. The header will consume the<br>panel at the point of entry, preventing it from passing through to the<br>opposite side.</p>
     * <p><code>seamed</code>: The header is presented as seamed with the panel.</p>
     * <p><code>waterfall</code>: Similar to standard mode, but header is initially presented as<br>seamed with panel, but then separates to form the step.</p>
     * <p><code>waterfall-tall</code>: The header is initially taller (<code>tall</code> class is added to<br>the header).  As the user scrolls, the header separates (forming an edge)<br>while condensing (<code>tall</code> class is removed from the header).</p>
     * <p><code>scroll</code>: The header keeps its seam with the panel, and is pushed off screen.</p>
     * <p><code>cover</code>: The panel covers the whole <code>paper-header-panel</code> including the<br>header. This allows user to style the panel in such a way that the panel is<br>partially covering the header.</p>
     * <pre><code>&lt;paper-header-panel mode=&quot;cover&quot;&gt;
     *   &lt;paper-toolbar class=&quot;tall&quot;&gt;
     *     &lt;core-icon-button icon=&quot;menu&quot;&gt;&lt;/core-icon-button&gt;
     *   &lt;/paper-toolbar&gt;
     *   &lt;div class=&quot;content&quot;&gt;&lt;/div&gt;
     * &lt;/paper-header-panel&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property mode
     * @type String
     * 
     */
    public void setMode(String value) {
        getPolymerElement().setMode(value);
    }
   
  

  
    /**
     * <p>Returns the scrollable element.</p>
     *
     * JavaScript Info:
     * @method scroller
     * 
     */
    public void scroller() {
        getPolymerElement().scroller();
    }
  

  
    /**
     * <p>If true, the drop-shadow is always shown no matter what mode is set to.</p>
     *
     * JavaScript Info:
     * @property shadow
     * @type Boolean
     * 
     */
    public boolean getShadow(){
        return getPolymerElement().getShadow();
    }
    /**
     * <p>If true, the drop-shadow is always shown no matter what mode is set to.</p>
     *
     * JavaScript Info:
     * @property shadow
     * @type Boolean
     * 
     */
    public void setShadow(boolean value) {
        getPolymerElement().setShadow(value);
    }
   
  

  
    /**
     * <p>The class used in waterfall-tall mode.  Change this if the header<br>accepts a different class for toggling height, e.g. “medium-tall”</p>
     *
     * JavaScript Info:
     * @property tallClass
     * @type String
     * 
     */
    public String getTallClass(){
        return getPolymerElement().getTallClass();
    }
    /**
     * <p>The class used in waterfall-tall mode.  Change this if the header<br>accepts a different class for toggling height, e.g. “medium-tall”</p>
     *
     * JavaScript Info:
     * @property tallClass
     * @type String
     * 
     */
    public void setTallClass(String value) {
        getPolymerElement().setTallClass(value);
    }
   
  

  
    /**
     * <p>Returns true if the scroller has a visible shadow.</p>
     *
     * JavaScript Info:
     * @method visibleShadow
     * 
     */
    public void visibleShadow() {
        getPolymerElement().visibleShadow();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * 
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  


    /**
     * <p>Fired when the content has been scrolled.  <code>event.detail.target</code> returns<br>the scrollable element which you can use to access scroll info such as<br><code>scrollTop</code>.</p>
     * <pre><code>&lt;paper-header-panel on-content-scroll=&quot;{{scrollHandler}}&quot;&gt;
     *   ...
     * &lt;/paper-header-panel&gt;
     * 
     * 
     * scrollHandler: function(event) {
     *   var scroller = event.detail.target;
     *   console.log(scroller.scrollTop);
     * }
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @event content-scroll
     */
    public HandlerRegistration addContentScrollHandler(ContentScrollEventHandler handler) {
        return addHandler(handler, ContentScrollEvent.TYPE);
    }

}
