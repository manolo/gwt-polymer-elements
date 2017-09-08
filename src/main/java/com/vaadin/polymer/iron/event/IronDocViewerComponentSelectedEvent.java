/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-doc-viewer project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Broadcast when another component is clicked on</p>
 */
@JsType(isNative=true)
public interface IronDocViewerComponentSelectedEvent extends Event {

    @JsOverlay static final String NAME = "iron-doc-viewer-component-selected";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>name of the component<br>iron-doc-viewer container should load component if possible</p>
         */
        @JsProperty String getDetail();

    }

}
