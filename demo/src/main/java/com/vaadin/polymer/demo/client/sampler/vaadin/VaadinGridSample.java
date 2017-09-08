package com.vaadin.polymer.demo.client.sampler.vaadin;

import java.util.*;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.query.client.Properties;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.demo.client.sampler.Sampler;
import com.vaadin.polymer.iron.IronIconElement;
import com.vaadin.polymer.paper.widget.PaperInput;
import com.vaadin.polymer.paper.widget.PaperMaterial;
import com.vaadin.polymer.vaadin.Cell;
import com.vaadin.polymer.vaadin.Column;
import com.vaadin.polymer.vaadin.Row;
import com.vaadin.polymer.vaadin.SortOrder;
import com.vaadin.polymer.vaadin.event.SelectedItemsChangedEvent;
import com.vaadin.polymer.vaadin.event.SortOrderChangedEvent;
import com.vaadin.polymer.vaadin.widget.VaadinGrid;

import elemental2.core.Array;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

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
    private Array<Properties> items;
    private List<Properties> list;

    public VaadinGridSample() {
        initWidget(myUiBinder.createAndBindUi(this));

        // info and filter will be used later.
        info.removeFromParent();
        filter.removeFromParent();

        // We have a global list of contacts
        items = Sampler.contacts;
        list = Arrays.asList(items.asArray());
        grid.setItems(items);
        // Save a copy to use in filters.
        original = new ArrayList<>(list);

        Polymer.ready(grid.getElement(), arg -> {

            // Feature: frozenColumns
            // Configure two columns at left to be always visible
            grid.setFrozenColumns(2);

            // Feature: custom renders
            // Custom renderer for cell
            Array<Column> columns= grid.getColumns();
            Column column = columns.getAt(0);
            column.setRenderer(cell -> {
                Cell c = (Cell)cell;

                int n = Integer.valueOf("" + c.getData()) % 4;
                String icon = n == 2 ? "star-half" : n == 1 ? "star" : "star-border";

                // Reuse elements in the cell to improve performance
                HTMLElement cellElm = c.getElement();
                IronIconElement iconElm = (IronIconElement)cellElm.firstChild;
                if (iconElm == null) {
                  iconElm = (IronIconElement)DomGlobal.document.createElement("iron-icon");
                  cellElm.appendChild(iconElm);
                }

                iconElm.setIcon(icon);
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
                Properties u = items.getAt(((Double)index).intValue());
                img.setSrc(u.get("image"));
                txt.setInnerText(u.get("mediumText"));
                return info.getPolymerElement();
            });
            // Open the row details on grid selection
            grid.getPolymerElement().addEventListener(SelectedItemsChangedEvent.NAME, evnt -> {
                Array<Number> n = grid.getSelection().selected(null, 0, 200);
                grid.setRowDetailsVisible(opened, false);
                if (n.length == 1) {
                    grid.setRowDetailsVisible(opened = n.getAt(0).doubleValue(), true);
                }
            });

            // Feature: sorting data
            // Reorder data when clicking on the header sort arrows
            grid.getPolymerElement().addEventListener(SortOrderChangedEvent.NAME, evnt -> {
                SortOrder order =  Js.cast(grid.getSortOrder().getAt(0));

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
