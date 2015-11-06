package com.vaadin.polymer.demo.client.sampler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.PreElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.query.client.GQ;
import com.google.gwt.query.client.Properties;
import com.google.gwt.query.client.plugins.ajax.Ajax;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.demo.client.sampler.gwt.JavaApiElement;
import com.vaadin.polymer.demo.client.sampler.gwt.JavaApiWidget;
import com.vaadin.polymer.demo.client.sampler.gwt.UiBinderElement;
import com.vaadin.polymer.demo.client.sampler.gwt.UiBinderWidget;
import com.vaadin.polymer.demo.client.sampler.highlight.JsHighlight;
import com.vaadin.polymer.demo.client.sampler.iron.IronCollapseSample;
import com.vaadin.polymer.demo.client.sampler.iron.IronImageSample;
import com.vaadin.polymer.demo.client.sampler.iron.IronListSample;
import com.vaadin.polymer.demo.client.sampler.iron.IronSelectorSample;
import com.vaadin.polymer.demo.client.sampler.paper.ButtonSample;
import com.vaadin.polymer.demo.client.sampler.paper.CheckboxSample;
import com.vaadin.polymer.demo.client.sampler.paper.DialogSample;
import com.vaadin.polymer.demo.client.sampler.paper.DropdownMenuSample;
import com.vaadin.polymer.demo.client.sampler.paper.FabSample;
import com.vaadin.polymer.demo.client.sampler.paper.HeaderPanelSample;
import com.vaadin.polymer.demo.client.sampler.paper.IconButtonSample;
import com.vaadin.polymer.demo.client.sampler.paper.InputSample;
import com.vaadin.polymer.demo.client.sampler.paper.ItemSample;
import com.vaadin.polymer.demo.client.sampler.paper.MaterialSample;
import com.vaadin.polymer.demo.client.sampler.paper.MenuSample;
import com.vaadin.polymer.demo.client.sampler.paper.ProgressSample;
import com.vaadin.polymer.demo.client.sampler.paper.RadioButtonSample;
import com.vaadin.polymer.demo.client.sampler.paper.RadioGroupSample;
import com.vaadin.polymer.demo.client.sampler.paper.RippleSample;
import com.vaadin.polymer.demo.client.sampler.paper.SliderSample;
import com.vaadin.polymer.demo.client.sampler.paper.SpinnerSample;
import com.vaadin.polymer.demo.client.sampler.paper.TabsSample;
import com.vaadin.polymer.demo.client.sampler.paper.ToastSample;
import com.vaadin.polymer.demo.client.sampler.paper.ToggleButtonSample;
import com.vaadin.polymer.demo.client.sampler.paper.ToolbarSample;
import com.vaadin.polymer.demo.client.sampler.vaadin.VaadinGridSample;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.widget.IronCollapse;
import com.vaadin.polymer.iron.widget.IronSelector;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperDialog;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;
import com.vaadin.polymer.paper.widget.PaperItem;

public class Sampler extends Composite {

    public static final String API_PATH = "https://api.github.com/repos/vaadin/gwt-polymer-elements/contents/demo/src/main/java/com/vaadin/polymer/demo/client/sampler/";

    interface SamplerUiBinder extends UiBinder<HTMLPanel, Sampler> {
    }

    interface Style extends CssResource {
        String toolbar();
        String category();
        String item();
        String current();
        String buttons();
        String list();
    }

    private static SamplerUiBinder ourUiBinder = GWT.create(SamplerUiBinder.class);

    private Map<String, IronSelector> selectorMap = new HashMap<>();
    private TreeMap<String, IronCollapse> collapseMap = new TreeMap<>();
    private List<Item> items = new ArrayList<>();
    private Item currentItem;

    @UiField Style style;

    @UiField PaperDrawerPanel drawerPanel;
    @UiField FlowPanel listPanel;
    @UiField HTMLPanel content;
    @UiField SpanElement currentLabel;
    @UiField PaperDialog about;
    @UiField PaperButton xmlButton;

    @UiField PaperDialog source;
    @UiField HeadingElement sourceTitle;
    @UiField PreElement sourceContent;


    private Widget createWidget(String name) {
        switch (name) {
        case "JavaApiWidget": return new JavaApiWidget();
        case "JavaApiElement": return new JavaApiElement();
        case "UiBinderWidget": return new UiBinderWidget();
        case "UiBinderElement": return new UiBinderElement();
        case "ButtonSample": return new ButtonSample();
        case "CheckboxSample": return new CheckboxSample();
        case "DialogSample": return new DialogSample();
        case "DropdownMenuSample": return new DropdownMenuSample();
        case "FabSample": return new FabSample();
        case "HeaderPanelSample": return new HeaderPanelSample();
        case "IconButtonSample": return new IconButtonSample();
        case "ItemSample": return new ItemSample();
        case "InputSample": return new InputSample();
        case "MaterialSample": return new MaterialSample();
        case "MenuSample": return new MenuSample();
        case "ProgressSample": return new ProgressSample();
        case "RadioButtonSample": return new RadioButtonSample();
        case "RadioGroupSample": return new RadioGroupSample();
        case "RippleSample": return new RippleSample();
        case "SpinnerSample": return new SpinnerSample();
        case "SliderSample": return new SliderSample();
        case "TabsSample": return new TabsSample();
        case "ToastSample": return new ToastSample();
        case "ToggleButtonSample": return new ToggleButtonSample();
        case "ToolbarSample": return new ToolbarSample();
        case "IronCollapseSample": return new IronCollapseSample();
        case "IronImageSample": return new IronImageSample();
        case "IronListSample": return new IronListSample();
        case "IronSelectorSample": return new IronSelectorSample();
        case "VaadinGridSample": return new VaadinGridSample();
        }
        return null;
    }

    public Sampler() {
        initWidget(ourUiBinder.createAndBindUi(this));

        JsHighlight.INSTANCE.initialize();

        addCategory("gwt", "GWT Integration");
        addSample("Widget Java API", "gwt", "JavaApiWidget", false);
        addSample("Element Java API", "gwt", "JavaApiElement", false);
        addSample("UiBinder Widgets", "gwt", "UiBinderWidget");
        addSample("UiBinder Elements", "gwt", "UiBinderElement");

        addCategory("paper", "Paper Elements");
        addSample("Button", "paper", "ButtonSample");
        addSample("CheckBox", "paper", "CheckboxSample");
        addSample("Dialog", "paper", "DialogSample");
        addSample("DropdownMenu", "paper", "DropdownMenuSample");
        // not suitable for current showcase. In original showcase it works inside iframe
        // addSample("DrawerPanel", "paper", "DrawerPanelSample");
        addSample("Floating Button", "paper", "FabSample");
        addSample("Header Panel", "paper", "HeaderPanelSample");
        addSample("Icon Button", "paper", "IconButtonSample");
        addSample("Item", "paper", "ItemSample");
        addSample("Input", "paper", "InputSample");
        addSample("Material", "paper", "MaterialSample");
        addSample("Menu", "paper", "MenuSample");
        addSample("Progress", "paper", "ProgressSample");
        addSample("Radio Button", "paper", "RadioButtonSample");
        addSample("Radio Group", "paper", "RadioGroupSample");
        addSample("Ripple", "paper", "RippleSample");
        addSample("Spinner", "paper", "SpinnerSample");
        addSample("Slider", "paper", "SliderSample");
        addSample("Tabs", "paper", "TabsSample");
        addSample("Toast", "paper", "ToastSample");
        addSample("Toggle Button", "paper", "ToggleButtonSample");
        addSample("Toolbar", "paper", "ToolbarSample");

        addCategory("iron", "Iron Elements");
        addSample("Collapse", "iron", "IronCollapseSample");
        addSample("Image", "iron", "IronImageSample");
        addSample("List", "iron", "IronListSample");
        addSample("Selector", "iron", "IronSelectorSample");
        
        addCategory("vaadin", "Vaadin Elements");
        addSample("Grid", "vaadin", "VaadinGridSample");

        History.addValueChangeHandler(new ValueChangeHandler<String>() {
            public void onValueChange(ValueChangeEvent<String> event) {
                selectItem(event.getValue());
            }
        });

        Polymer.endLoading(this.getElement(),
                collapseMap.lastEntry().getValue().getElement(), new Function() {
            public Object call(Object arg) {
                selectItem(Window.Location.getHash().replace("#", ""));
                return null;
            }
        });
    }

    private void showSource(String category, String file) {
        Ajax.get(API_PATH + category + "/" + file)
          .done(new com.google.gwt.query.client.Function() {
            native String atob(String b64) /*-{
               try {
                    // Safari fails if b64 fragment has new-lines
                    return '' + $wnd.atob(b64.replace(/\n/g, ''));
                } catch(e) {
                    return '' + e;
                }
            }-*/;
            public void f() {
                Properties p = GQ.create().parse(arguments(0));
                String c = atob(p.get("content"));
                sourceTitle.setInnerHTML(file);
                sourceContent.removeAttribute("class");
                sourceContent.setInnerText(c);
                source.open();
                JsHighlight.INSTANCE.highlightBlock(sourceContent);
          }
        });
    }

    @UiHandler("xmlButton")
    protected void onXmlButton(ClickEvent e) {
        showSource(currentItem.category, currentItem.path + ".ui.xml");
    }
    @UiHandler("javaButton")
    protected void onJavaButton(ClickEvent e) {
        showSource(currentItem.category, currentItem.path + ".java");
    }

    @UiHandler({"logo1", "logo2", "logo3"})
    protected void onLogo(ClickEvent e) {
        Window.open(((Widget)e.getSource()).getElement().getAttribute("url"), "_blank", "");
        closeMenu();
    }
    @UiHandler("help")
    protected void onHelp(ClickEvent e) {
        about.open();
    }

    private void addCategory(String path, String name) {
        PaperItem item = new PaperItem("<iron-icon icon='expand-more'></iron-icon><span>" + name + "</span><paper-ripple></paper-ripple>");
        item.addStyleName(style.category());

        final IronCollapse collapse = new IronCollapse("");
        item.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                setOpened(collapse, !collapse.getOpened());
            }
        });

        IronSelector selector = new IronSelector("");
        collapse.add(selector);
        selectorMap.put(path, selector);
        collapseMap.put(path, collapse);

        listPanel.add(item);
        listPanel.add(collapse);
    }

    private void addSample(final String name, String category, String path) {
        addSample(name, category, path, true);
    }

    private void addSample(final String name, String category, String path, boolean hasxml) {
        // FIXME(manolo) for some reason certain examples only work well when they
        // have been attached previously, or we go directly to it (hashfragment)
        // IconButtonSample FabSample ToolbarSample PaperJavaAPI Tabs
//        content.add(sample);
        IronCollapse collapse = collapseMap.get(category);
        IronSelector selector = selectorMap.get(category);
        items.add(new Item(collapse, selector, category, path, name, hasxml));
    }

    private void selectItem(String hash) {
        String tmp[] = hash != null ? hash.split("/") : null;
        if (tmp == null || tmp.length < 2) {
            tmp = new String[]{"gwt", "JavaApiWidget"};
        }
        for (Item i : items) {
            if (i.category == tmp[0] && i.path == tmp[1]) {
                // First time we select
                i.ready(o -> {
                    i.onClick(null);
                    return o;
                });
                return;
            }
        }
    }

    private void setOpened(IronCollapse collapse, boolean opened) {
        for (IronCollapse c : collapseMap.values()) {
            c.setOpened(c == collapse && opened);
        }
    }

    private class Item extends PaperItem implements ClickHandler {
        String category;
        IronCollapse collapse;
        IronSelector selector;
        String path;
        String name;
        int selectorIdx;
        boolean uixml;

        public Item(IronCollapse collapse, IronSelector selector, String category, String path, String name, boolean uixml) {
            super("<span>" + name + "</span>");
            this.collapse = collapse;
            this.selector = selector;
            this.category = category;
            this.path = path;
            this.name = name;
            this.uixml = uixml;
            selectorIdx = selector.getWidgetCount();
            selector.add(this);
            setName(name);
            addStyleName(style.item());
            addClickHandler(this);
        }

        Widget w;
        Widget getWidget() {
            if (w == null) {
                w = createWidget(path);
            }
            return w;
        }

        public void onClick(ClickEvent event) {
            for (IronSelector s : selectorMap.values()) {
                s.setSelected("-1");
            }
            selector.getPolymerElement().setAttribute("selected", selectorIdx);
            content.clear();
            content.add(getWidget());
            currentItem = this;
            History.newItem(category + "/" + path, false);
            currentLabel.setInnerText(name);
            xmlButton.setVisible(uixml);
            setOpened(collapse, true);
            closeMenu();
        }
    }

    private void closeMenu() {
        if (drawerPanel.getNarrow()) {
            drawerPanel.closeDrawer();
        }
    }
    
    public static native void async(Function f, int timeout) /*-{
       $wnd.Polymer.Base.async(f, timeout);
    }-*/;
}
