package com.github.taras.gwt.polymer.client.event;

import com.github.taras.gwt.polymer.client.PolymerWidgetEvent;
import com.github.taras.gwt.polymer.client.webapi.Event;

public class CoreSelectEvent extends PolymerWidgetEvent<CoreSelectEventHandler> {
    public static Type<CoreSelectEventHandler> TYPE = new Type<CoreSelectEventHandler>();
    
    public CoreSelectEvent(Event nativeEvent) {
        super(nativeEvent);
    }

    public Type<CoreSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreSelectEventHandler handler) {
        handler.onCoreSelect(this);
    }
}
