/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface VaadinMonthCalendarElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-month-calendar";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getFocusedDate();
    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty void setFocusedDate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getI18n();
    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty void setI18n(JavaScriptObject value);

    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    @JsProperty boolean getIgnoreTaps();
    /**
     * <p>Flag stating whether taps on the component should be ignored.</p>
     *
     * JavaScript Info:
     * @property ignoreTaps
     * @type boolean
     * 
     */
    @JsProperty void setIgnoreTaps(boolean value);

    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMaxDate();
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty void setMaxDate(JavaScriptObject value);

    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMinDate();
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty void setMinDate(JavaScriptObject value);

    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMonth();
    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    @JsProperty void setMonth(JavaScriptObject value);

    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getSelectedDate();
    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty void setSelectedDate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty boolean getShowWeekNumbers();
    /**
     * 
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty void setShowWeekNumbers(boolean value);


}
