package com.vaadin.polymer.elemental;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Function<RET, ARG>  {
    public RET call(ARG arg);
}

