package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.view.PaperTabsView;
import com.github.taras.gwt.polymer.client.view.PaperTabsWidgetView;
import com.github.taras.gwt.polymer.client.view.sampler.ButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.CheckboxSample;
import com.github.taras.gwt.polymer.client.view.sampler.DropdownMenuSample;
import com.github.taras.gwt.polymer.client.view.sampler.FloatingActionButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.IconButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.InputSample;
import com.github.taras.gwt.polymer.client.view.sampler.ItemSample;
import com.github.taras.gwt.polymer.client.view.sampler.MenuButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.ProgressBarSample;
import com.github.taras.gwt.polymer.client.view.sampler.RadioButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.SliderSample;
import com.github.taras.gwt.polymer.client.view.sampler.SpinnerSample;
import com.github.taras.gwt.polymer.client.view.sampler.TabsSample;
import com.github.taras.gwt.polymer.client.view.sampler.ToggleButtonSample;
import com.github.taras.gwt.polymer.client.view.sampler.ToolbarSample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(new PaperTabsView());
        RootPanel.get().add(new PaperTabsWidgetView());
        RootPanel.get().add(new CheckboxSample());
        RootPanel.get().add(new RadioButtonSample());
        RootPanel.get().add(new ToggleButtonSample());
        RootPanel.get().add(new InputSample());
        RootPanel.get().add(new ToolbarSample());
        RootPanel.get().add(new SpinnerSample());
        RootPanel.get().add(new ProgressBarSample());
        RootPanel.get().add(new SliderSample());
        RootPanel.get().add(new TabsSample());
        RootPanel.get().add(new ButtonSample());
        RootPanel.get().add(new IconButtonSample());
        RootPanel.get().add(new FloatingActionButtonSample());
        RootPanel.get().add(new DropdownMenuSample());
        RootPanel.get().add(new MenuButtonSample());
        RootPanel.get().add(new ItemSample());
    }
}
