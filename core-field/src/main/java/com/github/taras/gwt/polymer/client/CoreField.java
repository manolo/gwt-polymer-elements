package com.github.taras.gwt.polymer.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

public class CoreField extends Widget {

	private static boolean injected = false;

	/*
	 * Constuctor. Ensures that needed html templates are added and injects a <core-field> element to the page.
	 */
	public CoreField() {
		super();
		ensureHTMLImport();
		Element el = DOM.createElement("core-field");
		setElement(el);
	}

	/*
	 * Injects the core-field html template to page head section.
	 */
	private static void ensureHTMLImport() {
		if (!injected) {
			Element head = Document.get().getElementsByTagName("head")
					.getItem(0);
			Element htmlImport = Document.get().createLinkElement();
			htmlImport.setAttribute("rel", "import");
			htmlImport.setAttribute("href", GWT.getModuleBaseForStaticFiles()
					+ "components/core-field/core-field.html");
			head.appendChild(htmlImport);
		}
	}
}
