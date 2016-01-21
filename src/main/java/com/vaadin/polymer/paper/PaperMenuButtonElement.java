/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/buttons.html#buttons-dropdown-buttons">Dropdown buttons</a></p>
 * <p><code>paper-menu-button</code> allows one to compose a designated “trigger” element with<br>another element that represents “content”, to create a dropdown menu that<br>displays the “content” when the “trigger” is clicked.</p>
 * <p>The child element with the class <code>dropdown-trigger</code> will be used as the<br>“trigger” element. The child element with the class <code>dropdown-content</code> will be<br>used as the “content” element.</p>
 * <p>The <code>paper-menu-button</code> is sensitive to its content’s <code>iron-select</code> events. If<br>the “content” element triggers an <code>iron-select</code> event, the <code>paper-menu-button</code><br>will close automatically.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-menu-button&gt;
 *   &lt;paper-icon-button icon=&quot;menu&quot; class=&quot;dropdown-trigger&quot;&gt;&lt;/paper-icon-button&gt;
 *   &lt;paper-menu class=&quot;dropdown-content&quot;&gt;
 *     &lt;paper-item&gt;Share&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Settings&lt;/paper-item&gt;
 *     &lt;paper-item&gt;Help&lt;/paper-item&gt;
 *   &lt;/paper-menu&gt;
 * &lt;/paper-menu-button&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are also available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-menu-button-dropdown-background</code></td>
 * <td>Background color of the paper-menu-button dropdown</td>
 * <td><code>#fff</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button</code></td>
 * <td>Mixin applied to the paper-menu-button</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-disabled</code></td>
 * <td>Mixin applied to the paper-menu-button when disabled</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-dropdown</code></td>
 * <td>Mixin applied to the paper-menu-button dropdown</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-menu-button-content</code></td>
 * <td>Mixin applied to the paper-menu-button content</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperMenuButtonElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-menu-button";
    @JsOverlay public static final String SRC = "paper-menu-button/paper-menu-button.html";


    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty double getHorizontalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    @JsProperty void setHorizontalOffset(double value);

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getOpenAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    @JsProperty void setOpenAnimationConfig(JavaScriptObject value);

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty double getVerticalOffset();
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty void setVerticalOffset(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior VaadinComboBox
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getCloseAnimationConfig();
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    @JsProperty void setCloseAnimationConfig(JavaScriptObject value);

    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    @JsProperty boolean getIgnoreSelect();
    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    @JsProperty void setIgnoreSelect(boolean value);

    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoAnimations();
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    @JsProperty void setNoAnimations(boolean value);

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getFocused();
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setFocused(boolean value);

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    @JsProperty void setDisabled(boolean value);

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty boolean getStopKeyboardEventPropagation();
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinComboBox
     */
    @JsProperty void setStopKeyboardEventPropagation(boolean value);

    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty void setVerticalAlign(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty void setHorizontalAlign(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior VaadinComboBox
     * 
     */
    void keyboardEventMatchesKeys(Object event, Object eventString);

    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinComboBox
     * 
     */
    void addOwnKeyBinding(Object eventString, Object handlerName);

    /**
     * <p>Hide the dropdown content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

    /**
     * <p>Make the dropdown content appear as an overlay positioned relative<br>to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinComboBox
     * 
     */
    void removeOwnKeyBindings();

}
