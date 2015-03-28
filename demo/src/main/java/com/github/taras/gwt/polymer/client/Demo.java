package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.sampler.Sampler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
//        RootPanel.get().add(new PaperTabsView());
//        RootPanel.get().add(new PaperTabsWidgetView());
//        RootPanel.get().add(new CheckboxSample());
//        RootPanel.get().add(new RadioButtonSample());
//        RootPanel.get().add(new ToggleButtonSample());
//        RootPanel.get().add(new InputSample());
//        RootPanel.get().add(new ToolbarSample());
//        RootPanel.get().add(new SpinnerSample());
//        RootPanel.get().add(new ProgressBarSample());
//        RootPanel.get().add(new SliderSample());
//        RootPanel.get().add(new TabsSample());
//        RootPanel.get().add(new ButtonSample());
//        RootPanel.get().add(new IconButtonSample());
//        RootPanel.get().add(new FloatingActionButtonSample());
//        RootPanel.get().add(new DropdownMenuSample());
//        RootPanel.get().add(new MenuButtonSample());
//        RootPanel.get().add(new ItemSample());
//        RootPanel.get().add(new DialogSample());
//        RootPanel.get().add(new ShadowSample());
//        RootPanel.get().add(new ToastSample());
//        
//        RootPanel.get().add(new A11yKeysSample());
//        RootPanel.get().add(new CoreSelectorSample());
//        RootPanel.get().add(new CoreDrawerPanelSample());
        
        RootPanel.get().add(new Sampler());
    }
}
