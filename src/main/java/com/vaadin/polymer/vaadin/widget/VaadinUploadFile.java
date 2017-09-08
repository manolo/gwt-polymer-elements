/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-upload project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.vaadin.widget.event.FileAbortEvent;
import com.vaadin.polymer.vaadin.widget.event.FileAbortEventHandler;

import com.vaadin.polymer.vaadin.widget.event.FileRemoveEvent;
import com.vaadin.polymer.vaadin.widget.event.FileRemoveEventHandler;

import com.vaadin.polymer.vaadin.widget.event.FileRetryEvent;
import com.vaadin.polymer.vaadin.widget.event.FileRetryEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>&lt;vaadin-upload-file&gt;</code> element represents a file in the file list of <code>&lt;vaadin-upload&gt;</code>.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling the component.</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--vaadin-upload-file</code></td>
 * <td>A mixin that is applied to the host element</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-row</code></td>
 * <td>A mixin that is applied to the file row</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-status-icon</code></td>
 * <td>A mixin that is applied to all file status icons. By default, file status icons are hidden until the upload process finishes.</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-status-icon-complete</code></td>
 * <td>A mixin that is applied to the complete status icon when the upload process succeeds</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-status-icon-error</code></td>
 * <td>A mixin that is applied to the error status icon when the upload process fails</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-meta</code></td>
 * <td>A mixin that is applied to the info container</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-meta-complete</code></td>
 * <td>A mixin that is applied to the info container when file upload is complete</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-meta-error</code></td>
 * <td>A mixin that is applied to the info container when an error happens</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-name</code></td>
 * <td>A mixin that is applied to the file name</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-status</code></td>
 * <td>A mixin that is applied to the file status label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-error</code></td>
 * <td>A mixin that is applied to the file error label</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-commands</code></td>
 * <td>A mixin that is applied to the buttons container</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-progress</code></td>
 * <td>A mixin that is applied to the included paper-progress</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-progress-error</code></td>
 * <td>A mixin that is applied to the progress bar when error is set</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-progress-indeterminate</code></td>
 * <td>A mixin that is applied to the progress bar when indeterminate</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-progress-uploading-indeterminate</code></td>
 * <td>A mixin that is applied to the progress bar when uploading and indeterminate</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-progress-complete</code></td>
 * <td>A mixin that is applied to the progress when file is complete</td>
 * <td><code>{}</code></td>
 * </tr>
 * <tr>
 * <td><code>--vaadin-upload-file-canceled</code></td>
 * <td>A mixin that is applied to the upload cancel animation</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class VaadinUploadFile extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinUploadFile() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinUploadFile(String html) {
        super(VaadinUploadFileElement.TAG, VaadinUploadFileElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinUploadFileElement getPolymerElement() {
        return (VaadinUploadFileElement) getElement();
    }


    /**
     * <p>File metadata, upload status and progress information.</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public JavaScriptObject getFile() {
        return getPolymerElement().getFile();
    }
    /**
     * <p>File metadata, upload status and progress information.</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public void setFile(JavaScriptObject value) {
        getPolymerElement().setFile(value);
    }


    // Needed in UIBinder
    /**
     * <p>File metadata, upload status and progress information.</p>
     *
     * JavaScript Info:
     * @attribute file
     * 
     */
    public void setFile(String value) {
        Polymer.property(this.getPolymerElement(), "file", value);
    }



    /**
     * <p>Fired when abort button is pressed. It is listened by <code>vaadin-upload</code> which<br>will abort the upload in progress, but will not remove the file from the list<br>to allow the animation to hide the element to be run.</p>
     *
     * JavaScript Info:
     * @event file-abort
     */
    public HandlerRegistration addFileAbortHandler(FileAbortEventHandler handler) {
        return addDomHandler(handler, FileAbortEvent.TYPE);
    }

    /**
     * <p>Fired after the animation to hide the element has finished. It is listened<br>by <code>vaadin-upload</code> which will actually remove the file from the upload<br>file list.</p>
     *
     * JavaScript Info:
     * @event file-remove
     */
    public HandlerRegistration addFileRemoveHandler(FileRemoveEventHandler handler) {
        return addDomHandler(handler, FileRemoveEvent.TYPE);
    }

    /**
     * <p>Fired when the retry button is pressed. It is listened by <code>vaadin-upload</code><br>which will start a new upload process of this file.</p>
     *
     * JavaScript Info:
     * @event file-retry
     */
    public HandlerRegistration addFileRetryHandler(FileRetryEventHandler handler) {
        return addDomHandler(handler, FileRetryEvent.TYPE);
    }

}
