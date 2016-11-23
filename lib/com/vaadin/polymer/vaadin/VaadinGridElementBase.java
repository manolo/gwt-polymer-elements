package com.vaadin.polymer.vaadin;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.*;
import jsinterop.annotations.*;

@JsType(isNative=true)
public interface VaadinGridElementBase extends HTMLElement {

     @JsFunction
     interface ItemCallback {
        void call(JavaScriptObject error, JavaScriptObject item);
     }

    /**
     * <p>Invokes the callback with row data of the provided row index as the<br>parameter.
     * If the row is not cached, it’s fetched from the data source<br>first.</p>
     *
     * JavaScript Info:
     * @method getItem
     * @param {number} rowIndex
     * @param {Function} callback
     * @param {boolean} onlyCached
     */
    void getItem(double rowIndex, ItemCallback callback, boolean onlyCached);
}
