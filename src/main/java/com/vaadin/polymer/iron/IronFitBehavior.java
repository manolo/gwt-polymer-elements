/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-fit-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 * <p>Polymer.IronFitBehavior fits an element in another element using <code>max-height</code> and <code>max-width</code>, and<br>optionally centers it in the window or another element.</p>
 * <p>The element will only be sized and/or positioned if it has not already been sized and/or positioned<br>by CSS.</p>
 * <table>
 * <thead>
 * <tr>
 * <th>CSS properties</th>
 * <th>Action</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>position</code> set</td>
 * <td>Element is not centered horizontally or vertically</td>
 * </tr>
 * <tr>
 * <td><code>top</code> or <code>bottom</code> set</td>
 * <td>Element is not vertically centered</td>
 * </tr>
 * <tr>
 * <td><code>left</code> or <code>right</code> set</td>
 * <td>Element is not horizontally centered</td>
 * </tr>
 * <tr>
 * <td><code>max-height</code> or <code>height</code> set</td>
 * <td>Element respects <code>max-height</code> or <code>height</code></td>
 * </tr>
 * <tr>
 * <td><code>max-width</code> or <code>width</code> set</td>
 * <td>Element respects <code>max-width</code> or <code>width</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface IronFitBehavior {

    @JsOverlay public static final String NAME = "Polymer.IronFitBehavior";
    @JsOverlay public static final String SRC = "iron-fit-behavior/iron-fit-behavior.html";


    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty boolean getAutoFitOnAttach();
    /**
     * <p>Set to true to auto-fit on attach.</p>
     *
     * JavaScript Info:
     * @property autoFitOnAttach
     * @type Boolean
     * @behavior PaperDialog
     */
    @JsProperty void setAutoFitOnAttach(boolean value);

    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty JavaScriptObject getFitInto();
    /**
     * <p>The element to fit <code>this</code> into.</p>
     *
     * JavaScript Info:
     * @property fitInto
     * @type Object
     * @behavior PaperDialog
     */
    @JsProperty void setFitInto(JavaScriptObject value);

    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    @JsProperty JavaScriptObject getSizingTarget();
    /**
     * <p>The element that will receive a <code>max-height</code>/<code>width</code>. By default it is the same as <code>this</code>,<br>but it can be set to a child element. This is useful, for example, for implementing a<br>scrolling region inside the element.</p>
     *
     * JavaScript Info:
     * @property sizingTarget
     * @type !Element
     * @behavior PaperDialog
     */
    @JsProperty void setSizingTarget(JavaScriptObject value);


    /**
     * <p>Centers horizontally and vertically if not already positioned. This also sets<br><code>position:fixed</code>.</p>
     *
     * JavaScript Info:
     * @method center
     * @behavior PaperDialog
     * 
     */
    void center();

    /**
     * <p>Constrains the size of the element to the window or <code>fitInfo</code> by setting <code>max-height</code><br>and/or <code>max-width</code>.</p>
     *
     * JavaScript Info:
     * @method constrain
     * @behavior PaperDialog
     * 
     */
    void constrain();

    /**
     * <p>Fits and optionally centers the element into the window, or <code>fitInfo</code> if specified.</p>
     *
     * JavaScript Info:
     * @method fit
     * @behavior PaperDialog
     * 
     */
    void fit();

    /**
     * <p>Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after the element,<br>the window, or the <code>fitInfo</code> element has been resized.</p>
     *
     * JavaScript Info:
     * @method refit
     * @behavior PaperDialog
     * 
     */
    void refit();

    /**
     * <p>Resets the target element’s position and size constraints, and clear<br>the memoized data.</p>
     *
     * JavaScript Info:
     * @method resetFit
     * @behavior PaperDialog
     * 
     */
    void resetFit();

}
