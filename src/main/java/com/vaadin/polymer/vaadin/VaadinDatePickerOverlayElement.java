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
public interface VaadinDatePickerOverlayElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-date-picker-overlay";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getFocusedDate();
    /**
     * <p>Date value which is focused using keyboard.</p>
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
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getInitialPosition();
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty void setInitialPosition(JavaScriptObject value);

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
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getSelectedDate();
    /**
     * <p>The value for this element.</p>
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


    /**
     * <p>Scrolls the month and year scrollers enough to reveal the given date.</p>
     *
     * JavaScript Info:
     * @method revealDate
     * @param {} date  
     * 
     * 
     */
    void revealDate(Object date);

    /**
     * <p>Scrolls the list to the given Date.</p>
     *
     * JavaScript Info:
     * @method scrollToDate
     * @param {} date  
     * @param {} animate  
     * 
     * 
     */
    void scrollToDate(Object date, Object animate);

    /**
     * 
     *
     * JavaScript Info:
     * @method announceFocusedDate
     * 
     * 
     */
    void announceFocusedDate();

    /**
     * <p>Focuses the cancel button</p>
     *
     * JavaScript Info:
     * @method focusCancel
     * 
     * 
     */
    void focusCancel();

}
