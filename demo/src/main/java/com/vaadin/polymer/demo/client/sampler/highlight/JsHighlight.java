package com.vaadin.polymer.demo.client.sampler.highlight;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.builders.JsniBundle;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public abstract class JsHighlight implements JsniBundle {

  interface CssHighlight extends ClientBundle  {
    CssHighlight INSTANCE =  GWT.create(CssHighlight.class);

    @Source("idea.css")
    CssResource idea();
  }

  private static boolean initialized;
  public static final JsHighlight INSTANCE = GWT.create(JsHighlight.class);

  @LibrarySource("highlight.pack.js")
  abstract void loadHighlight();

  public void initialize() {
    if (!initialized) {
      initialized = true;
      CssHighlight.INSTANCE.idea().ensureInjected();
      loadHighlight();
    }
  }

  public native void highlightBlock(Element e) /*-{
    e && $wnd.hljs && $wnd.hljs.highlightBlock(e);
  }-*/;
}
