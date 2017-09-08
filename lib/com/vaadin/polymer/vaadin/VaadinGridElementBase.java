package com.vaadin.polymer.vaadin;

import com.google.gwt.core.client.JavaScriptObject;
import com.vaadin.polymer.PolymerElement;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace = GLOBAL, name = "HTMLElement")
public class VaadinGridElementBase extends PolymerElement  {

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
    native void getItem(double rowIndex, ItemCallback callback, boolean onlyCached);
}
