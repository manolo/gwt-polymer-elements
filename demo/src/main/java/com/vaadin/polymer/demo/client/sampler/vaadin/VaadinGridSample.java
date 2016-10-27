package com.vaadin.polymer.demo.client.sampler.vaadin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.google.gwt.query.client.GQuery.console;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.query.client.Properties;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.paper.widget.PaperInput;
import com.vaadin.polymer.paper.widget.PaperMaterial;
import com.vaadin.polymer.vaadin.Column;
import com.vaadin.polymer.vaadin.Row;
import com.vaadin.polymer.vaadin.SortOrder;
import com.vaadin.polymer.vaadin.event.SelectedItemsChangedEvent;
import com.vaadin.polymer.vaadin.event.SortOrderChangedEvent;
import com.vaadin.polymer.vaadin.widget.VaadinGrid;

public class VaadinGridSample extends Composite {

    interface MyUiBinder extends UiBinder<HTMLPanel, VaadinGridSample> {
    }

    private static MyUiBinder myUiBinder = GWT.create(MyUiBinder.class);

    @UiField VaadinGrid grid;
    @UiField PaperMaterial info;
    @UiField ImageElement img;
    @UiField SpanElement txt;
    @UiField PaperInput filter;

    private double opened = -1;
    private List<Properties> original;
    private JsArray<Properties> items;
    private List<Properties> list;

    public VaadinGridSample() {
        initWidget(myUiBinder.createAndBindUi(this));

        // info and filter will be used later.
        info.removeFromParent();
        filter.removeFromParent();

        // We have a global list of contacts
        items = Sampler.contacts;
        list = Polymer.asList(items);
        grid.setItems(items);
        // Save a copy to use in filters.
        original = new ArrayList<Properties>(list);

        Polymer.ready(grid.getElement(), arg -> {

            // Feature: frozenColumns
            // Configure two columns at left to be always visible
            grid.setFrozenColumns(2);

            // Feature: custom renders
            // Custom renderer for cell
            Column column = grid.getColumns().get(0).cast();
            column.setRenderer(row -> {
                Row r = (Row)row;
                int n = Integer.valueOf(""+ r.getData()) % 4;
                String icon = n == 2 ? "star-half" : n == 1 ? "star" : "star-border";
                r.getElement().<Element>cast().setInnerHTML("<iron-icon icon='" + icon + "'>");;
                return null;
            });

            // Feature: class names
            // Generate different class names per row
            grid.setRowClassGenerator(row -> {
                Row r = (Row)row;
                Properties u = r.getData().cast();
                return "color-" + u.getStr("longText").length() % 4;
            });

            // Feature: row details
            // Generate a widget to show the details of a row
            grid.setRowDetailsGenerator(index -> {
                Properties u = items.get(((Double)index).intValue());
                img.setSrc(u.get("image"));
                txt.setInnerText(u.get("mediumText"));
                return info.getPolymerElement();
            });
            // Open the row details on grid selection
            grid.getPolymerElement().addEventListener(SelectedItemsChangedEvent.NAME, evnt -> {
                JsArrayNumber n = grid.getSelection().selected(null, 0, 200).cast();
                grid.setRowDetailsVisible(opened, false);
                if (n.length() == 1) {
                    grid.setRowDetailsVisible(opened = n.get(0), true);
                }
            });

            // Feature: sorting data
            // Reorder data when clicking on the header sort arrows
            grid.getPolymerElement().addEventListener(SortOrderChangedEvent.NAME, evnt -> {
                SortOrder order =  grid.getSortOrder().get(0).cast();

                int i = (int)order.getColumn();
                String col = i == 1 ? "name" : i == 3 ? "city" : i == 5 ? "state" : "country";

                boolean asc = order.getDirection() == "asc";

                Comparator<Properties> compare = (p1, p2) -> p1.getStr(col).compareTo(p2.get(col));
                Collections.sort(list, asc ? compare : Collections.reverseOrder(compare));
            });

            // Feature: widgets in headers
            // Add a Paper input to the header to use for filtering
            grid.getHeader().getCell(0, 0).setColspan(2);
            grid.getHeader().getCell(0, 0).setContent(filter.getElement());
            // Change grid items based on filter
            filter.getPolymerElement().addEventListener("keyup", evnt -> {
                list.clear();
                String search = filter.getValue().toLowerCase();
                for (Properties p : original) {
                    if (p.getStr("name").toLowerCase().contains(search)) {
                        list.add(p);
                    }
                }
                items = Polymer.asJsArray(list);
                grid.setItems(items);
            });

            return null;
        });

    }
}
