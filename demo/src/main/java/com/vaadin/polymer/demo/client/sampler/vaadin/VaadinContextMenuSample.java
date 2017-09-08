package com.vaadin.polymer.demo.client.sampler.vaadin;

import java.util.Arrays;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.iron.event.IronSelectEvent;
import com.vaadin.polymer.paper.PaperMenuElement;
import com.vaadin.polymer.paper.widget.PaperToast;
import com.vaadin.polymer.vaadin.Column;
import com.vaadin.polymer.vaadin.widget.VaadinContextMenu;
import com.vaadin.polymer.vaadin.widget.VaadinGrid;

import elemental2.core.Array;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

public class VaadinContextMenuSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinContextMenuSample> {
    }

    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinGrid grid;
    @UiField VaadinContextMenu gridcontext;
    @UiField VaadinContextMenu basiccontext;
    @UiField HTMLElement opener;
    @UiField PaperToast toast;

    // ui:field do not work here because it's in a template that is not attached to the dom.
    PaperMenuElement gridmenu;

    public VaadinContextMenuSample() {
        Polymer.importHref(Arrays.asList("vaadin-context-menu", "paper-menu", "paper-item", "paper-item/paper-item-body"));

        initWidget(myUiBinder.createAndBindUi(this));

        // Demo 1
        basiccontext.setListenOn(opener);
        basiccontext.getPolymerElement().addEventListener(IronSelectEvent.NAME, e -> {
            HTMLElement item = Polymer.property(((IronSelectEvent)e).getDetail(), "item");
            show(item.getAttribute("value"));
        });

        // Demo 2
        // We have a global list of contacts
        grid.setItems(Sampler.contacts);
        gridcontext.setListenOn(PolymerElement.as(grid.getElement()));

        // We have to wait until the overlay is attached to the DOM.
        // vaadin-contex-menu, lacks for an API able to realize when the overlay is opened
        Scheduler.get().scheduleFixedPeriod(() -> {
            gridmenu = Polymer.dom(gridcontext.getPolymerElement().root).querySelector("paper-menu");
            if (gridmenu != null) {

                // First time we select all items
                Array<Integer> all = new Array<>(0,1,2,3,4);
                gridmenu.setSelectedValues(all);

                gridmenu.addEventListener("selected-values-changed", e -> {
                    gridcontext.getPolymerElement().debounce("values-changed", o -> {
                        for (int i = 0; i < 5; i++) {
                            ((Column)grid.getColumns().getAt(i)).setHidden(true);
                        }
                        Array<Number> selected = gridmenu.getSelectedValues();
                        for (int i = 0; i < selected.length; i++) {
                            final Array<Column> columns = grid.getColumns();
                            (columns.getAt(selected.getAt(i).intValue())).setHidden(false);
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
