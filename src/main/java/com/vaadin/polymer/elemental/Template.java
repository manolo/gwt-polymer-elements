package com.vaadin.polymer.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.google.gwt.core.client.JsArray;

@JsType(isNative=true, namespace=GLOBAL)
public interface Template extends HTMLElement {
    @JsProperty String getIs();
    @JsProperty void setIs(String value);

    @JsProperty String getAs();
    @JsProperty void setAs(String value);

    @JsProperty String getIdexAs();
    @JsProperty void setIndexAs(String value);

    @JsProperty JsArray<?> getItems();
    @JsProperty void setItems(JsArray<?> items);

    @JsProperty void setFilter(Function<Boolean, ?> items);

    @JsProperty void setIf(String value);
}
