/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-group project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p><code>paper-radio-group</code> allows user to select only one radio button from a set.<br>Checking one radio button that belongs to a radio group unchecks any<br>previously checked radio button within the same group. Use<br><code>selected</code> to get or set the selected radio button.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-radio-group selected=&quot;small&quot;&gt;
 *   &lt;paper-radio-button name=&quot;small&quot;&gt;Small&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;medium&quot;&gt;Medium&lt;/paper-radio-button&gt;
 *   &lt;paper-radio-button name=&quot;large&quot;&gt;Large&lt;/paper-radio-button&gt;
 * &lt;/paper-radio-group&gt;
 * 
 * 
 * </code></pre><p>See <a href="paper-radio-button.html">paper-radio-button</a> for more<br>information about <code>paper-radio-button</code>.</p>
 */
@JsType
public interface PaperRadioGroupElement extends HTMLElement {

    public static final String TAG = "paper-radio-group";
    public static final String SRC = "paper-radio-group/paper-radio-group.html";


    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * 
     */
    @JsProperty String getAttrForSelected();
    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property attrForSelected
     * @type String
     * 
     */
    @JsProperty void setAttrForSelected(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getKeyBindings();
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * 
     */
    @JsProperty void setKeyBindings(JavaScriptObject value);
  
    /**
     * <p>Selects the given value.</p>
     *
     * JavaScript Info:
     * @method select
     * @param {} value  
     * 
     */
    void select(JavaScriptObject value);

    /**
     * <p>Selects the next item. If the next item is disabled, then it is<br>skipped, and the next item after it is selected.</p>
     *
     * JavaScript Info:
     * @method selectNext
     * 
     */
    void selectNext();

    /**
     * <p>Selects the previous item. If the previous item is disabled, then it is<br>skipped, and its previous item is selected</p>
     *
     * JavaScript Info:
     * @method selectPrevious
     * 
     */
    void selectPrevious();

    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    @JsProperty String getSelectable();
    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property selectable
     * @type String
     * 
     */
    @JsProperty void setSelectable(String value);
  
    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * 
     */
    @JsProperty String getSelectedAttribute();
    /**
     * <p>Overriden from Polymer.IronSelectableBehavior</p>
     *
     * JavaScript Info:
     * @property selectedAttribute
     * @type String
     * 
     */
    @JsProperty void setSelectedAttribute(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHostAttributes();
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    @JsProperty void setHostAttributes(JavaScriptObject value);
  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTab
     */
    void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName);

    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty JavaScriptObject getKeyEventTarget();
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTab
     */
    @JsProperty void setKeyEventTarget(JavaScriptObject value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTab
     */
    void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString);

    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTab
     */
    void removeOwnKeyBindings();

    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTab
     */
    void attached();

    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTab
     */
    void detached();

    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTab
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperTab
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTab
     */
    void registered();

    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getActivateEvent();
    /**
     * <p>The event that fires from items when they are selected. Selectable<br>will listen for this event from items and update the selection state.<br>Set to empty string to listen to no events.</p>
     *
     * JavaScript Info:
     * @property activateEvent
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setActivateEvent(String value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getExcludedLocalNames();
    /**
     * 
     *
     * JavaScript Info:
     * @property excludedLocalNames
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setExcludedLocalNames(JavaScriptObject value);
  
    /**
     * <p>Returns the index of the given item.</p>
     *
     * JavaScript Info:
     * @method indexOf
     * @param {Object} item  
     * @behavior PaperTabs
     */
    void indexOf(JavaScriptObject item);

    /**
     * <p>Returns an array of selectable items.</p>
     *
     * JavaScript Info:
     * @method items
     * @behavior PaperTabs
     */
    void items();

    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelected();
    /**
     * <p>Gets or sets the selected element. The default is to use the index of the item.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelected(String value);
  
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty String getSelectedClass();
    /**
     * <p>The class to set on elements when selected.</p>
     *
     * JavaScript Info:
     * @property selectedClass
     * @type string
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedClass(String value);
  
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty JavaScriptObject getSelectedItem();
    /**
     * <p>Returns the currently selected item.</p>
     *
     * JavaScript Info:
     * @property selectedItem
     * @type Object
     * @behavior PaperTabs
     */
    @JsProperty void setSelectedItem(JavaScriptObject value);
  
}
