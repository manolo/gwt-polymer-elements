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
public interface VaadinElementsDatepickerDatePickerBehavior {

    @JsOverlay public static final String NAME = "vaadin.elements.datepicker.DatePickerBehavior";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>Set true to display ISO-8601 week numbers in the calendar. Notice that<br>displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code><br>is 1 (Monday).</p>
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty boolean getShowWeekNumbers();
    /**
     * <p>Set true to display ISO-8601 week numbers in the calendar. Notice that<br>displaying week numbers is only supported when <code>i18n.firstDayOfWeek</code><br>is 1 (Monday).</p>
     *
     * JavaScript Info:
     * @property showWeekNumbers
     * @type Boolean
     * 
     */
    @JsProperty void setShowWeekNumbers(boolean value);

    /**
     * <p>Set true to open the date selector overlay.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>Set true to open the date selector overlay.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);

    /**
     * <p>Indicates whether this date picker has a value.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    @JsProperty boolean getHasValue();
    /**
     * <p>Indicates whether this date picker has a value.</p>
     *
     * JavaScript Info:
     * @property hasValue
     * @type Boolean
     * 
     */
    @JsProperty void setHasValue(boolean value);

    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   // An array with the full names of months starting
     *   // with January.
     *   monthNames: [
     *     &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *     &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *     &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *   ],
     * 
     *   // An array of weekday names starting with Sunday. Used
     *   // in screen reader announcements.
     *   weekdays: [
     *     &#39;Sunday&#39;, &#39;Monday&#39;, &#39;Tuesday&#39;, &#39;Wednesday&#39;,
     *     &#39;Thursday&#39;, &#39;Friday&#39;, &#39;Saturday&#39;
     *   ],
     * 
     *   // An array of short weekday names starting with Sunday.
     *   // Displayed in the calendar.
     *   weekdaysShort: [
     *     &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *   ],
     * 
     *   // An integer indicating the first day of the week
     *   // (0 = Sunday, 1 = Monday, etc.).
     *   firstDayOfWeek: 0,
     * 
     *   // Used in screen reader announcements along with week
     *   // numbers, if they are displayed.
     *   week: &#39;Week&#39;,
     * 
     *   // Translation of the Calendar icon button title.
     *   calendar: &#39;Calendar&#39;,
     * 
     *   // Translation of the Clear icon button title.
     *   clear: &#39;Clear&#39;,
     * 
     *   // Translation of the Today shortcut button text.
     *   today: &#39;Today&#39;,
     * 
     *   // Translation of the Cancel button text.
     *   cancel: &#39;Cancel&#39;,
     * 
     *   // A function to format given `Date` object as
     *   // date string.
     *   formatDate: function(d) {
     *     // returns a string representation of the given
     *     // Date object in &#39;MM/DD/YYYY&#39; -format
     *   },
     * 
     *   // A function to parse the given text to a `Date`
     *   // object. Must properly parse (at least) text
     *   // formatted by `formatDate`.
     *   // Setting the property to null will disable
     *   // keyboard input feature.
     *   parseDate: function(text) {
     *     // Parses a string in &#39;MM/DD/YY&#39;, &#39;MM/DD&#39; or &#39;DD&#39; -format to
     *     // a Date object
     *   }
     * 
     *   // A function to format given `monthName` and
     *   // `fullYear` integer as calendar title string.
     *   formatTitle: function(monthName, fullYear) {
     *     return monthName + &#39; &#39; + fullYear;
     *   }
     * 
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getI18n();
    /**
     * <p>The object used to localize this component.<br>To change the default localization, replace the entire<br><em>i18n</em> object or just the property you want to modify.</p>
     * <p>The object has the following JSON structure and default values:</p>
     * <pre><code>{
     *   // An array with the full names of months starting
     *   // with January.
     *   monthNames: [
     *     &#39;January&#39;, &#39;February&#39;, &#39;March&#39;, &#39;April&#39;, &#39;May&#39;,
     *     &#39;June&#39;, &#39;July&#39;, &#39;August&#39;, &#39;September&#39;,
     *     &#39;October&#39;, &#39;November&#39;, &#39;December&#39;
     *   ],
     * 
     *   // An array of weekday names starting with Sunday. Used
     *   // in screen reader announcements.
     *   weekdays: [
     *     &#39;Sunday&#39;, &#39;Monday&#39;, &#39;Tuesday&#39;, &#39;Wednesday&#39;,
     *     &#39;Thursday&#39;, &#39;Friday&#39;, &#39;Saturday&#39;
     *   ],
     * 
     *   // An array of short weekday names starting with Sunday.
     *   // Displayed in the calendar.
     *   weekdaysShort: [
     *     &#39;Sun&#39;, &#39;Mon&#39;, &#39;Tue&#39;, &#39;Wed&#39;, &#39;Thu&#39;, &#39;Fri&#39;, &#39;Sat&#39;
     *   ],
     * 
     *   // An integer indicating the first day of the week
     *   // (0 = Sunday, 1 = Monday, etc.).
     *   firstDayOfWeek: 0,
     * 
     *   // Used in screen reader announcements along with week
     *   // numbers, if they are displayed.
     *   week: &#39;Week&#39;,
     * 
     *   // Translation of the Calendar icon button title.
     *   calendar: &#39;Calendar&#39;,
     * 
     *   // Translation of the Clear icon button title.
     *   clear: &#39;Clear&#39;,
     * 
     *   // Translation of the Today shortcut button text.
     *   today: &#39;Today&#39;,
     * 
     *   // Translation of the Cancel button text.
     *   cancel: &#39;Cancel&#39;,
     * 
     *   // A function to format given `Date` object as
     *   // date string.
     *   formatDate: function(d) {
     *     // returns a string representation of the given
     *     // Date object in &#39;MM/DD/YYYY&#39; -format
     *   },
     * 
     *   // A function to parse the given text to a `Date`
     *   // object. Must properly parse (at least) text
     *   // formatted by `formatDate`.
     *   // Setting the property to null will disable
     *   // keyboard input feature.
     *   parseDate: function(text) {
     *     // Parses a string in &#39;MM/DD/YY&#39;, &#39;MM/DD&#39; or &#39;DD&#39; -format to
     *     // a Date object
     *   }
     * 
     *   // A function to format given `monthName` and
     *   // `fullYear` integer as calendar title string.
     *   formatTitle: function(monthName, fullYear) {
     *     return monthName + &#39; &#39; + fullYear;
     *   }
     * 
     * }
     * 
     * 
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty void setI18n(JavaScriptObject value);

    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty String getMax();
    /**
     * <p>The latest date that can be selected. All later dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property max
     * @type String
     * 
     */
    @JsProperty void setMax(String value);

    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty String getLabel();
    /**
     * <p>The label for this element.</p>
     *
     * JavaScript Info:
     * @property label
     * @type string
     * 
     */
    @JsProperty void setLabel(String value);

    /**
     * <p>The value for this element.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value for this element.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * 
     */
    @JsProperty String getInitialPosition();
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     * <p>The same date formats as for the <code>value</code> property are supported.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type string
     * 
     */
    @JsProperty void setInitialPosition(String value);

    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty String getMin();
    /**
     * <p>The earliest date that can be selected. All earlier dates will be disabled.</p>
     * <p>Supported date formats:</p>
     * <ul>
     * <li>ISO 8601 <code>&quot;YYYY-MM-DD&quot;</code> (default)</li>
     * <li>6-digit extended ISO 8601 <code>&quot;+YYYYYY-MM-DD&quot;</code>, <code>&quot;-YYYYYY-MM-DD&quot;</code></li>
     * </ul>
     *
     * JavaScript Info:
     * @property min
     * @type String
     * 
     */
    @JsProperty void setMin(String value);


    /**
     * <p>Closes the dropdown.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

    /**
     * <p>Opens the dropdown.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

}
