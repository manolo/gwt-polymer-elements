package com.vaadin.components.gwt.polymer.client.sampler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.components.gwt.polymer.client.sampler.core.A11yKeysSample;
import com.vaadin.components.gwt.polymer.client.sampler.core.CoreCollapseSample;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperJavaAPI;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperTabsView;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperTabsWidgetView;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.CheckboxSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.DialogSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.DropdownMenuSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.FloatingActionButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.IconButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.InputSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ItemSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.MenuButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ProgressBarSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.RadioButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ShadowSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.SliderSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.SpinnerSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.TabsSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToastSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToggleButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToolbarSample;
import com.vaadin.components.gwt.polymer.client.widget.CoreCollapse;
import com.vaadin.components.gwt.polymer.client.widget.CoreDrawerPanel;
import com.vaadin.components.gwt.polymer.client.widget.CoreSelector;
import com.vaadin.components.gwt.polymer.client.widget.PaperButton;
import com.vaadin.components.gwt.polymer.client.widget.PaperIconButton;
import com.vaadin.components.gwt.polymer.client.widget.PaperItem;
import com.vaadin.components.gwt.polymer.client.widget.event.CoreResponsiveChangeEvent;
import com.vaadin.components.gwt.polymer.client.widget.event.CoreResponsiveChangeEventHandler;

public class Sampler extends Composite {

    public static final String REPO_PATH = "https://github.com/manolo/gwt-polymer/blob/mcm_fixes/gwt-polymer-demo/src/main/java/com/vaadin/components/gwt/polymer/client/sampler/";

    interface SamplerUiBinder extends UiBinder<HTMLPanel, Sampler> {
    }

    interface Style extends CssResource {
        String toolbar();
        String category();
        String item();
    }

    private static SamplerUiBinder ourUiBinder = GWT.create(SamplerUiBinder.class);

    private Map<String, CoreSelector> selectorMap = new HashMap<>();
    private Map<String, CoreCollapse> collapseMap = new HashMap<>();
    private List<Item> items = new ArrayList<>();
    Item currentItem;

    @UiField Style style;

    @UiField CoreDrawerPanel drawerPanel;
    @UiField PaperIconButton menuButton;
    @UiField FlowPanel listPanel;
    @UiField DeckPanel content;
    @UiField SpanElement currentLabel;
    @UiField PaperButton xmlButton;
    @UiField PaperButton javaButton;

    public Sampler() {
        initWidget(ourUiBinder.createAndBindUi(this));

        drawerPanel.addCoreResponsiveChangeHandler(new CoreResponsiveChangeEventHandler() {
            @Override
            public void onCoreResponsiveChange(CoreResponsiveChangeEvent event) {
                menuButton.setVisible(drawerPanel.isNarrow());
            }
        });

        menuButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                drawerPanel.togglePanel();
            }
        });

        xmlButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.open(REPO_PATH + currentItem.category + "/" + currentItem.path + ".ui.xml", "_blank", "");
            }
        });

        javaButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.open(REPO_PATH + currentItem.category + "/" + currentItem.path + ".java", "_blank", "");
            }
        });


        addCategory("core", "Core Elements");
        addSample("a11y keys", new A11yKeysSample(), "core", "A11yKeysSample");
        addSample("Collapse", new CoreCollapseSample(), "core", "CoreCollapseSample");

        addCategory("paper", "Paper Elements");
        addSample("CheckBox", new CheckboxSample(), "paper", "CheckboxSample");
        addSample("Radio Button", new RadioButtonSample(), "paper", "RadioButtonSample");
        addSample("Toggle Button", new ToggleButtonSample(), "paper", "ToggleButtonSample");
        // strange bug appears if include this to Sampler
        addSample("Input", new InputSample(), "paper", "InputSample");
        addSample("Toolbar", new ToolbarSample(), "paper", "ToolbarSample");
        addSample("Spinner", new SpinnerSample(), "paper", "SpinnerSample");
        addSample("Progress Bar", new ProgressBarSample(), "paper", "ProgressBarSample");
        addSample("Slider", new SliderSample(), "paper", "SliderSample");
        addSample("Tabs", new TabsSample(), "paper", "TabsSample");
        addSample("Button", new ButtonSample(), "paper", "ButtonSample");
        addSample("Icon Button", new IconButtonSample(), "paper", "IconButtonSample");
        addSample("Floating Action Button", new FloatingActionButtonSample(), "paper", "FloatingActionButtonSample");
        // not fully implemented yet
//        addSample("Dropdown", new DropdownSample(), "paper", "DropdownSample");
        addSample("Dropdown Menu", new DropdownMenuSample(), "paper", "DropdownMenuSample");
        addSample("Menu Button", new MenuButtonSample(), "paper", "MenuButtonSample");
        addSample("Item", new ItemSample(), "paper", "ItemSample");
        addSample("Dialog", new DialogSample(), "paper", "DialogSample");
        // wait for pull-request, because setZ seems not working.
        addSample("Shadow", new ShadowSample(), "paper", "ShadowSample");
        addSample("Toast", new ToastSample(), "paper", "ToastSample");

        addCategory("gwt", "Other");
        addSample("Element UiBinder", new PaperTabsView(), "gwt", "PaperTabsView");
        addSample("Widget UiBinder", new PaperTabsWidgetView(), "gwt", "PaperTabsWidgetView");
        addSample("Java API", new PaperJavaAPI(), "gwt", "PaperJavaAPI");


        RootPanel.get().add(new PaperJavaAPI());

        selectItem(Window.Location.getHash().replace("#", ""));

        History.addValueChangeHandler(new ValueChangeHandler<String>() {
            public void onValueChange(ValueChangeEvent<String> event) {
                selectItem(event.getValue());
            }
        });
    }

    private void addCategory(String path, String name) {
        PaperItem item = new PaperItem(name);
        item.addStyleName(style.category());
        final CoreCollapse collapse = new CoreCollapse("");

        item.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                collapse.toggle();
            }
        });

        CoreSelector selector = new CoreSelector("");
        collapse.add(selector);
        selectorMap.put(path, selector);
        collapseMap.put(path, collapse);

        listPanel.add(item);
        listPanel.add(collapse);
    }

    private void addSample(final String name, final Widget sample, String category, String path) {
        final int idx = content.getWidgetCount();
        content.add(sample);

        CoreCollapse collapse = collapseMap.get(category);
        CoreSelector selector = selectorMap.get(category);
        items.add(new Item(collapse, selector, category, path, idx, name));
    }

    private void selectItem(String hash) {
        String tmp[] = hash != null ? hash.split("/") : new String[]{"paper", "CheckboxSample"};
        if (tmp == null || tmp.length < 2) {
            tmp = new String[]{"paper", "CheckboxSample"};
        }
        for (Item i : items) {
            if (i.category == tmp[0] && i.path == tmp[1]) {
                i.onClick(null);
                return;
            }
        }
    }

    private class Item extends PaperItem implements ClickHandler {
        String category;
        CoreCollapse collapse;
        CoreSelector selector;
        String path;
        String name;
        int selectorIdx;
        int sampleIdx;

        public Item(CoreCollapse collapse, CoreSelector selector, String category, String path, int idx, String name) {
            super(name);
            this.collapse = collapse;
            this.selector = selector;
            this.category = category;
            this.path = path;
            this.name = name;
            this.sampleIdx = idx;
            selectorIdx = selector.getWidgetCount();
            selector.add(this);
            setName(name);
            addStyleName(style.item());
            addClickHandler(this);
        }

        public void onClick(ClickEvent event) {
            for (CoreSelector s : selectorMap.values()) {
                s.setSelected(-1);
            }
            collapse.setOpened(true);
            selector.setSelected(selectorIdx);
            content.showWidget(sampleIdx);
            currentItem = this;
            History.newItem(category + "/" + path, false);
            currentLabel.setInnerText(name);
        }
    }
}
