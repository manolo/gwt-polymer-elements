/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.paper.widget.event.PaperDropdownCloseEvent;
import com.vaadin.polymer.paper.widget.event.PaperDropdownCloseEventHandler;

import com.vaadin.polymer.paper.widget.event.PaperDropdownOpenEvent;
import com.vaadin.polymer.paper.widget.event.PaperDropdownOpenEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
 * <td><code>--primary-background-color</code></td>
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
public class PaperMenuButton extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperMenuButton() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperMenuButton(String html) {
        super(PaperMenuButtonElement.TAG, PaperMenuButtonElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperMenuButtonElement getPolymerElement() {
        return (PaperMenuButtonElement) getElement();
    }


    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    public boolean getAllowOutsideScroll() {
        return getPolymerElement().getAllowOutsideScroll();
    }
    /**
     * <p>By default, the dropdown will constrain scrolling on the page<br>to itself when opened.<br>Set to true in order to prevent scroll from being constrained<br>to the dropdown when it opens.</p>
     *
     * JavaScript Info:
     * @property allowOutsideScroll
     * @type Boolean
     * 
     */
    public void setAllowOutsideScroll(boolean value) {
        getPolymerElement().setAllowOutsideScroll(value);
    }

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    public double getHorizontalOffset() {
        return getPolymerElement().getHorizontalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @property horizontalOffset
     * @type Number
     * 
     */
    public void setHorizontalOffset(double value) {
        getPolymerElement().setHorizontalOffset(value);
    }

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getOpenAnimationConfig() {
        return getPolymerElement().getOpenAnimationConfig();
    }
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @property openAnimationConfig
     * @type Object
     * 
     */
    public void setOpenAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setOpenAnimationConfig(value);
    }

    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    public JavaScriptObject getCloseAnimationConfig() {
        return getPolymerElement().getCloseAnimationConfig();
    }
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @property closeAnimationConfig
     * @type Object
     * 
     */
    public void setCloseAnimationConfig(JavaScriptObject value) {
        getPolymerElement().setCloseAnimationConfig(value);
    }

    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public JavaScriptObject getKeyBindings() {
        return getPolymerElement().getKeyBindings();
    }
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @property keyBindings
     * @type !Object
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }

    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public JavaScriptObject getKeyEventTarget() {
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type ?EventTarget
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }

    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public double getVerticalOffset() {
        return getPolymerElement().getVerticalOffset();
    }
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    public void setVerticalOffset(double value) {
        getPolymerElement().setVerticalOffset(value);
    }

    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    public boolean getIgnoreSelect() {
        return getPolymerElement().getIgnoreSelect();
    }
    /**
     * <p>Set to true to disable automatically closing the dropdown after<br>a selection has been made.</p>
     *
     * JavaScript Info:
     * @property ignoreSelect
     * @type Boolean
     * 
     */
    public void setIgnoreSelect(boolean value) {
        getPolymerElement().setIgnoreSelect(value);
    }

    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    public boolean getNoAnimations() {
        return getPolymerElement().getNoAnimations();
    }
    /**
     * <p>Set to true to disable animations when opening and closing the<br>dropdown.</p>
     *
     * JavaScript Info:
     * @property noAnimations
     * @type Boolean
     * 
     */
    public void setNoAnimations(boolean value) {
        getPolymerElement().setNoAnimations(value);
    }

    /**
     * <p>If true, the dropdown will be positioned so that it doesn’t overlap<br>the button.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * 
     */
    public boolean getNoOverlap() {
        return getPolymerElement().getNoOverlap();
    }
    /**
     * <p>If true, the dropdown will be positioned so that it doesn’t overlap<br>the button.</p>
     *
     * JavaScript Info:
     * @property noOverlap
     * @type Boolean
     * 
     */
    public void setNoOverlap(boolean value) {
        getPolymerElement().setNoOverlap(value);
    }

    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getDisabled() {
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperTab
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }

    /**
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    public boolean getDynamicAlign() {
        return getPolymerElement().getDynamicAlign();
    }
    /**
     * <p>If true, the <code>horizontalAlign</code> and <code>verticalAlign</code> properties will<br>be considered preferences instead of strict requirements when<br>positioning the dropdown and may be changed if doing so reduces<br>the area of the dropdown falling outside of <code>fitInto</code>.</p>
     *
     * JavaScript Info:
     * @property dynamicAlign
     * @type Boolean
     * 
     */
    public void setDynamicAlign(boolean value) {
        getPolymerElement().setDynamicAlign(value);
    }

    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public boolean getOpened() {
        return getPolymerElement().getOpened();
    }
    /**
     * <p>True if the content is currently displayed.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    public void setOpened(boolean value) {
        getPolymerElement().setOpened(value);
    }

    /**
     * <p>Whether focus should be restored to the button when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    public boolean getRestoreFocusOnClose() {
        return getPolymerElement().getRestoreFocusOnClose();
    }
    /**
     * <p>Whether focus should be restored to the button when the menu closes.</p>
     *
     * JavaScript Info:
     * @property restoreFocusOnClose
     * @type Boolean
     * 
     */
    public void setRestoreFocusOnClose(boolean value) {
        getPolymerElement().setRestoreFocusOnClose(value);
    }

    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public boolean getFocused() {
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperTab
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }

    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public boolean getStopKeyboardEventPropagation() {
        return getPolymerElement().getStopKeyboardEventPropagation();
    }
    /**
     * <p>If true, this property will cause the implementing element to<br>automatically stop propagation on any handled KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property stopKeyboardEventPropagation
     * @type Boolean
     * @behavior VaadinDatePicker
     */
    public void setStopKeyboardEventPropagation(boolean value) {
        getPolymerElement().setStopKeyboardEventPropagation(value);
    }

    /**
     * <p>Set to true to enable automatically closing the dropdown after an<br>item has been activated, even if the selection did not change.</p>
     *
     * JavaScript Info:
     * @property closeOnActivate
     * @type Boolean
     * 
     */
    public boolean getCloseOnActivate() {
        return getPolymerElement().getCloseOnActivate();
    }
    /**
     * <p>Set to true to enable automatically closing the dropdown after an<br>item has been activated, even if the selection did not change.</p>
     *
     * JavaScript Info:
     * @property closeOnActivate
     * @type Boolean
     * 
     */
    public void setCloseOnActivate(boolean value) {
        getPolymerElement().setCloseOnActivate(value);
    }

    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    public String getVerticalAlign() {
        return getPolymerElement().getVerticalAlign();
    }
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    public void setVerticalAlign(String value) {
        getPolymerElement().setVerticalAlign(value);
    }

    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public String getHorizontalAlign() {
        return getPolymerElement().getHorizontalAlign();
    }
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    public void setHorizontalAlign(String value) {
        getPolymerElement().setHorizontalAlign(value);
    }


    // Needed in UIBinder
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>closing of the dropdown.</p>
     *
     * JavaScript Info:
     * @attribute close-animation-config
     * 
     */
    public void setCloseAnimationConfig(String value) {
        Polymer.property(this.getPolymerElement(), "closeAnimationConfig", value);
    }

    // Needed in UIBinder
    /**
     * <p>To be used to express what combination of keys  will trigger the relative<br>callback. e.g. <code>keyBindings: { &#39;esc&#39;: &#39;_onEscPressed&#39;}</code></p>
     *
     * JavaScript Info:
     * @attribute key-bindings
     * @behavior VaadinDatePicker
     */
    public void setKeyBindings(String value) {
        Polymer.property(this.getPolymerElement(), "keyBindings", value);
    }

    // Needed in UIBinder
    /**
     * <p>The EventTarget that will be firing relevant KeyboardEvents. Set it to<br><code>null</code> to disable the listeners.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior VaadinDatePicker
     */
    public void setKeyEventTarget(String value) {
        Polymer.property(this.getPolymerElement(), "keyEventTarget", value);
    }

    // Needed in UIBinder
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>horizontalAlign</code>. Use a negative value to offset to the<br>left, or a positive value to offset to the right.</p>
     *
     * JavaScript Info:
     * @attribute horizontal-offset
     * 
     */
    public void setHorizontalOffset(String value) {
        Polymer.property(this.getPolymerElement(), "horizontalOffset", value);
    }

    // Needed in UIBinder
    /**
     * <p>A pixel value that will be added to the position calculated for the<br>given <code>verticalAlign</code>. Use a negative value to offset towards the<br>top, or a positive value to offset towards the bottom.</p>
     *
     * JavaScript Info:
     * @attribute vertical-offset
     * 
     */
    public void setVerticalOffset(String value) {
        Polymer.property(this.getPolymerElement(), "verticalOffset", value);
    }

    // Needed in UIBinder
    /**
     * <p>An animation config. If provided, this will be used to animate the<br>opening of the dropdown.</p>
     *
     * JavaScript Info:
     * @attribute open-animation-config
     * 
     */
    public void setOpenAnimationConfig(String value) {
        Polymer.property(this.getPolymerElement(), "openAnimationConfig", value);
    }


    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior VaadinDatePicker
     * 
     */
    public void addOwnKeyBinding(Object eventString, Object handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }

    /**
     * <p>Hide the dropdown content.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    public void close() {
        getPolymerElement().close();
    }

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior VaadinDatePicker
     * 
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }

    /**
     * <p>Make the dropdown content appear as an overlay positioned relative<br>to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    public void open() {
        getPolymerElement().open();
    }

    /**
     * <p>Toggles the drowpdown content between opened and closed.</p>
     *
     * JavaScript Info:
     * @method toggle
     * 
     * 
     */
    public void toggle() {
        getPolymerElement().toggle();
    }

    /**
     * <p>Returns true if a keyboard event matches <code>eventString</code>.</p>
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {KeyboardEvent} event  
     * @param {string} eventString  
     * @behavior VaadinDatePicker
     * @return {boolean}
     */
    public boolean keyboardEventMatchesKeys(JavaScriptObject event, String eventString) {
        return getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }


    /**
     * <p>Fired when the dropdown closes.</p>
     *
     * JavaScript Info:
     * @event paper-dropdown-close
     */
    public HandlerRegistration addPaperDropdownCloseHandler(PaperDropdownCloseEventHandler handler) {
        return addDomHandler(handler, PaperDropdownCloseEvent.TYPE);
    }

    /**
     * <p>Fired when the dropdown opens.</p>
     *
     * JavaScript Info:
     * @event paper-dropdown-open
     */
    public HandlerRegistration addPaperDropdownOpenHandler(PaperDropdownOpenEventHandler handler) {
        return addDomHandler(handler, PaperDropdownOpenEvent.TYPE);
    }

}
