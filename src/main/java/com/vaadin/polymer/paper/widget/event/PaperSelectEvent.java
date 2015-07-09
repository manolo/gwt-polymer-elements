/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the selected panel changes.</p>
 * <p>Listening for this event is an alternative to observing changes in the <code>selected</code> attribute.<br>This event is fired both when a panel is selected and deselected.<br>The <code>isSelected</code> detail property contains the selection state.</p>
 */
public class PaperSelectEvent extends GwtEvent<PaperSelectEventHandler> {

    public static Type<PaperSelectEventHandler> TYPE = new Type<PaperSelectEventHandler>();

    private com.vaadin.polymer.paper.element.event.PaperSelectEvent nativeEvent;

    public PaperSelectEvent(com.vaadin.polymer.paper.element.event.PaperSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<PaperSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSelectEventHandler handler) {
        handler.onPaperSelect(this);
    }

    public com.vaadin.polymer.paper.element.event.PaperSelectEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * 
     */
    public boolean getIsSelected() {
        return getNativeEvent().getDetail().getIsSelected();
    }

    /**
     * <p>isSelected: True for selection and false for deselection.<br>    item: The panel that the event refers to.</p>
     */
    public JavaScriptObject getItem() {
        return getNativeEvent().getDetail().getItem();
    }

}
