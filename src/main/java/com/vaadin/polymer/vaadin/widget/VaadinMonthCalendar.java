/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinMonthCalendar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinMonthCalendar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinMonthCalendar(String html) {
        super(VaadinMonthCalendarElement.TAG, VaadinMonthCalendarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinMonthCalendarElement getPolymerElement() {
        return (VaadinMonthCalendarElement) getElement();
    }


    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public JavaScriptObject getFocusedDate() {
        return getPolymerElement().getFocusedDate();
    }
    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public void setFocusedDate(JavaScriptObject value) {
        getPolymerElement().setFocusedDate(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public JavaScriptObject getI18n() {
        return getPolymerElement().getI18n();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public void setI18n(JavaScriptObject value) {
        getPolymerElement().setI18n(value);
    }

    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    public boolean getIgnoreTaps() {
        return getPolymerElement().getIgnoreTaps();
    }
    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    public void setIgnoreTaps(boolean value) {
        getPolymerElement().setIgnoreTaps(value);
    }

    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public JavaScriptObject getMaxDate() {
        return getPolymerElement().getMaxDate();
    }
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public void setMaxDate(JavaScriptObject value) {
        getPolymerElement().setMaxDate(value);
    }

    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public JavaScriptObject getMinDate() {
        return getPolymerElement().getMinDate();
    }
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public void setMinDate(JavaScriptObject value) {
        getPolymerElement().setMinDate(value);
    }

    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    public JavaScriptObject getMonth() {
        return getPolymerElement().getMonth();
    }
    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    public void setMonth(JavaScriptObject value) {
        getPolymerElement().setMonth(value);
    }

    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public JavaScriptObject getSelectedDate() {
        return getPolymerElement().getSelectedDate();
    }
    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public void setSelectedDate(JavaScriptObject value) {
        getPolymerElement().setSelectedDate(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    public boolean getShowWeekNumbers() {
        return getPolymerElement().getShowWeekNumbers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    public void setShowWeekNumbers(boolean value) {
        getPolymerElement().setShowWeekNumbers(value);
    }


    // Needed in UIBinder
    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @attribute focused-date
     * 
     */
    public void setFocusedDate(String value) {
        Polymer.property(this.getPolymerElement(), "focusedDate", value);
    }

    // Needed in UIBinder
    /**
     * 
     *
     * JavaScript Info:
     * @attribute i18n
     * 
     */
    public void setI18n(String value) {
        Polymer.property(this.getPolymerElement(), "i18n", value);
    }

    // Needed in UIBinder
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @attribute max-date
     * 
     */
    public void setMaxDate(String value) {
        Polymer.property(this.getPolymerElement(), "maxDate", value);
    }

    // Needed in UIBinder
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @attribute min-date
     * 
     */
    public void setMinDate(String value) {
        Polymer.property(this.getPolymerElement(), "minDate", value);
    }

    // Needed in UIBinder
    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @attribute month
     * 
     */
    public void setMonth(String value) {
        Polymer.property(this.getPolymerElement(), "month", value);
    }

    // Needed in UIBinder
    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @attribute selected-date
     * 
     */
    public void setSelectedDate(String value) {
        Polymer.property(this.getPolymerElement(), "selectedDate", value);
    }



}
