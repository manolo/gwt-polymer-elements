/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-slider project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the slider’s immediateValue changes. Only occurs while the<br>user is dragging.</p>
 * <p>To detect changes to immediateValue that happen for any input (i.e.<br>dragging, tapping, clicking, etc.) listen for immediate-value-changed<br>instead.</p>
 */
@JsType(isNative=true)
public interface ImmediateValueChangeEvent extends Event {

    @JsOverlay static final String NAME = "immediate-value-change";

}
