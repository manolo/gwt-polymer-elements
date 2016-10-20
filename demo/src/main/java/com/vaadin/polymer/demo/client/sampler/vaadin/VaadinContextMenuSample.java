package com.vaadin.polymer.demo.client.sampler.vaadin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Properties;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.iron.event.IronSelectEvent;
import com.vaadin.polymer.paper.PaperMenuElement;
import com.vaadin.polymer.paper.widget.PaperToast;
import com.vaadin.polymer.vaadin.Column;
import com.vaadin.polymer.vaadin.widget.VaadinContextMenu;
import com.vaadin.polymer.vaadin.widget.VaadinGrid;

import java.util.Arrays;
import java.util.List;

public class VaadinContextMenuSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinContextMenuSample> {
    }

    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinGrid grid;
    @UiField VaadinContextMenu gridcontext;
    @UiField VaadinContextMenu basiccontext;
    @UiField Element opener;
    @UiField PaperToast toast;

    // ui:field do not work here because it's in a template that is not attached to the dom.
    PaperMenuElement gridmenu;

    public VaadinContextMenuSample() {
        Polymer.importHref(Arrays.asList("vaadin-context-menu", "paper-menu", "paper-item", "paper-item/paper-item-body"));

        initWidget(myUiBinder.createAndBindUi(this));

        // Demo 1
        basiccontext.setListenOn(opener);
        basiccontext.getPolymerElement().addEventListener(IronSelectEvent.NAME, e -> {
            HTMLElement item = Polymer.property(e.getDetail(), "item");
            show(item.getAttribute("value"));
        });

        // Demo 2
        // We have a global list of contacts
        grid.setItems(Sampler.contacts);
        gridcontext.setListenOn(grid.getElement());

        // We have to wait until the overlay is attached to the DOM.
        // vaadin-contex-menu, lacks for an API able to realize when the overlay is opened
        Scheduler.get().scheduleFixedPeriod(() -> {
            gridmenu = Polymer.dom(gridcontext.getPolymerElement().getRoot()).querySelector("paper-menu");
            if (gridmenu != null) {

                // First time we select all items
                JsArrayInteger all = JsArray.createArray().cast();
                all.push(0);
                all.push(1);
                all.push(2);
                all.push(3);
                all.push(4);
                gridmenu.setSelectedValues(all.cast());

                gridmenu.addEventListener("selected-values-changed", e -> {
                    gridcontext.getPolymerElement().debounce("values-changed", o -> {
                        for (int i = 0; i < 5; i++) {
                            ((Column)grid.getColumns().get(i)).setHidden(true);
                        }
                        JsArrayInteger selected = gridmenu.getSelectedValues().cast();
                        for (int i = 0; i < selected.length(); i++) {
                            ((Column)grid.getColumns().get(selected.get(i))).setHidden(false);
                        }
                        return null;
                    }, 1);
                });
            }
            return gridmenu == null;
        }, 100);
    }


    private void show(String message) {
        if (!message.isEmpty()) {
            toast.close();
            toast.setText("Value: " + message);
            toast.open();
        }
    }
}
