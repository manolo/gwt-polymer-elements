/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from platinum-https-redirect project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.platinum.widget;

import com.vaadin.polymer.platinum.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>The <code>&lt;platinum-https-redirect&gt;</code> element redirects the current page to HTTPS, unless the page is<br>loaded from a web server running on <code>localhost</code>.</p>
 * <p>Using <a href="https://en.wikipedia.org/wiki/HTTP_Strict_Transport_Security">HTTP Strict Transport Security</a><br>(HSTS) can be used to enforce HTTPS for an entire<br><a href="https://html.spec.whatwg.org/multipage/browsers.html#origin">origin</a>, following the first visit to<br>any page on the origin. Configuring the underlying web server to<br><a href="https://en.wikipedia.org/wiki/HTTP_301">redirect</a> all HTTP requests to their HTTPS equivalents<br>takes care of enforcing HTTPS on the initial visit as well.<br>Both options provide a more robust approach to enforcing HTTPS, but require access to the underlying<br>web server’s configuration in order to implement.</p>
 * <p>This element provides a client-side option when HSTS and server-enforced redirects aren’t possible,<br>such as when deploying code on a shared-hosting provider like<br><a href="https://pages.github.com/">GitHub Pages</a>.</p>
 * <p>It comes in handy when used with other <code>&lt;platinum-*&gt;</code> elements, since those elements use<br><a href="http://www.chromium.org/Home/chromium-security/prefer-secure-origins-for-powerful-new-features">features which are restricted to HTTPS</a>,<br>with an exception to support local web servers.</p>
 * <p>It can be used by just adding it to any page, e.g.</p>
 * <pre><code>&lt;platinum-https-redirect&gt;&lt;/platinum-https-redirect&gt;
 * 
 * 
 * </code></pre>
 */
public class PlatinumHttpsRedirect extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PlatinumHttpsRedirect() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PlatinumHttpsRedirect(String html) {
        super(PlatinumHttpsRedirectElement.TAG, PlatinumHttpsRedirectElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PlatinumHttpsRedirectElement getPolymerElement() {
        return (PlatinumHttpsRedirectElement) getElement();
    }





}
