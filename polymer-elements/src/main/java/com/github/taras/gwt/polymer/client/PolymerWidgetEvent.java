package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.webapi.element.Event;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public abstract class PolymerWidgetEvent<H extends EventHandler> extends GwtEvent<H> {

    private Event nativeEvent;

    public PolymerWidgetEvent(Event nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Event getNativeEvent() {
        return nativeEvent;
    }
}
