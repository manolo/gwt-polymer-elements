package com.github.taras.gwt.polymer.client.sampler;

import java.util.HashMap;
import java.util.Map;

import com.github.taras.gwt.polymer.client.sampler.core.A11yKeysSample;
import com.github.taras.gwt.polymer.client.sampler.core.CoreCollapseSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.CheckboxSample;
import com.github.taras.gwt.polymer.client.sampler.paper.DialogSample;
import com.github.taras.gwt.polymer.client.sampler.paper.DropdownMenuSample;
import com.github.taras.gwt.polymer.client.sampler.paper.FloatingActionButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.IconButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ItemSample;
import com.github.taras.gwt.polymer.client.sampler.paper.MenuButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ProgressBarSample;
import com.github.taras.gwt.polymer.client.sampler.paper.RadioButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.SliderSample;
import com.github.taras.gwt.polymer.client.sampler.paper.SpinnerSample;
import com.github.taras.gwt.polymer.client.sampler.paper.TabsSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ToastSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ToggleButtonSample;
import com.github.taras.gwt.polymer.client.sampler.paper.ToolbarSample;
import com.github.taras.gwt.polymer.client.widget.CoreCollapse;
import com.github.taras.gwt.polymer.client.widget.CoreDrawerPanel;
import com.github.taras.gwt.polymer.client.widget.CoreSelector;
import com.github.taras.gwt.polymer.client.widget.PaperButton;
import com.github.taras.gwt.polymer.client.widget.PaperIconButton;
import com.github.taras.gwt.polymer.client.widget.PaperItem;
import com.github.taras.gwt.polymer.client.widget.event.CoreResponsiveChangeEvent;
import com.github.taras.gwt.polymer.client.widget.event.CoreResponsiveChangeEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class Sampler extends Composite {

    public static final String REPO_PATH = "https://github.com/cwayfinder/gwt-polymer/blob/master/demo/src/main/java/com/github/taras/gwt/polymer/client/sampler/";

    interface SamplerUiBinder extends UiBinder<HTMLPanel, Sampler> {
    }

    interface Style extends CssResource {
        String toolbar();
        String category();
        String item();
    }

    private static SamplerUiBinder ourUiBinder = GWT.create(SamplerUiBinder.class);

    private Map<String, CoreSelector> selectorMap = new HashMap<>();
    private String path;

    @UiField Style style;
    
    @UiField CoreDrawerPanel drawerPanel;
    @UiField PaperIconButton menuButton;
    @UiField FlowPanel listPanel;
    @UiField SimplePanel content;
    @UiField SpanElement label;
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
                Window.open(REPO_PATH + path + ".ui.xml", "_blank", "");
            }
        });
        
        javaButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.open(REPO_PATH + path + ".java", "_blank", "");
            }
        });
        
        
        addCategory("Core Elements");
        addSample("a11y keys", new A11yKeysSample(), "Core Elements", "core/A11yKeysSample");
        addSample("Collapse", new CoreCollapseSample(), "Core Elements", "core/CoreCollapseSample");

        addCategory("Paper Elements");
        addSample("CheckBox", new CheckboxSample(), "Paper Elements", "paper/CheckboxSample");
        addSample("Radio Button", new RadioButtonSample(), "Paper Elements", "paper/RadioButtonSample");
        addSample("Toggle Button", new ToggleButtonSample(), "Paper Elements", "paper/ToggleButtonSample");
//        addSample("Input", new InputSample(), "Paper Elements", "paper/InputSample");     // strange bug appears if include this to Sampler
        addSample("Toolbar", new ToolbarSample(), "Paper Elements", "paper/ToolbarSample");
        addSample("Spinner", new SpinnerSample(), "Paper Elements", "paper/SpinnerSample");
        addSample("Progress Bar", new ProgressBarSample(), "Paper Elements", "paper/ProgressBarSample");
        addSample("Slider", new SliderSample(), "Paper Elements", "paper/SliderSample");
        addSample("Tabs", new TabsSample(), "Paper Elements", "paper/TabsSample");
        addSample("Button", new ButtonSample(), "Paper Elements", "paper/ButtonSample");
        addSample("Icon Button", new IconButtonSample(), "Paper Elements", "paper/IconButtonSample");
        addSample("Floating Action Button", new FloatingActionButtonSample(), "Paper Elements", "paper/FloatingActionButtonSample");
//        addSample("Dropdown", new DropdownSample(), "Paper Elements", "paper/DropdownSample");        // not fully implemented yet
        addSample("Dropdown Menu", new DropdownMenuSample(), "Paper Elements", "paper/DropdownMenuSample");
        addSample("Menu Button", new MenuButtonSample(), "Paper Elements", "paper/MenuButtonSample");
        addSample("Item", new ItemSample(), "Paper Elements", "paper/ItemSample");
        addSample("Dialog", new DialogSample(), "Paper Elements", "paper/DialogSample");
//        addSample("Shadow", new ShadowSample(), "Paper Elements", "paper/ShadowSample");    // wait for pull-request
        addSample("Toast", new ToastSample(), "Paper Elements", "paper/ToastSample");

        addCategory("Other");
        addSample("JsInterop wrappers", new PaperTabsView(), "Other", "PaperTabsView");
        addSample("Widget wrappers", new PaperTabsWidgetView(), "Other", "PaperTabsWidgetView");

        selectRandomItem();
    }

    private void addCategory(String name) {
        PaperItem item = new PaperItem(name);
        item.addStyleName(style.category());

        final CoreCollapse collapse = new CoreCollapse("");

        item.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                collapse.toggle();
            }
        });

        CoreSelector selector = new CoreSelector("");
        collapse.add(selector);
        selectorMap.put(name, selector);

        listPanel.add(item);
        listPanel.add(collapse);
    }

    private void addSample(final String name, final Widget sample, String categoryName, final String path) {
        PaperItem item = new PaperItem(name);
        item.addStyleName(style.item());

        item.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                label.setInnerText(name);
                content.setWidget(sample);

                Sampler.this.path = path;
            }
        });

        CoreSelector selector = selectorMap.get(categoryName);
        selector.add(item);
    }

    // TODO: Refactor this
    private void selectRandomItem() {
        (new Timer() {
            @Override
            public void run() {
                ((CoreCollapse) listPanel.getWidget(3)).toggle();
                selectorMap.get("Paper Elements").setSelected(0);
                selectorMap.get("Paper Elements").getWidget(0).fireEvent(new ClickEvent() {});
            }
        }).schedule(500);
    }
}