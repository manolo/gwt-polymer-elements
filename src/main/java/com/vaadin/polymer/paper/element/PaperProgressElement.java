/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-progress project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.element;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * <p>The progress bars are for situations where the percentage completed can be<br>determined. They give users a quick sense of how much longer an operation<br>will take.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-progress value=&quot;10&quot;&gt;&lt;/paper-progress&gt;
 * 
 * 
 * </code></pre><p>There is also a secondary progress which is useful for displaying intermediate<br>progress, such as the buffer level during a streaming playback progress bar.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-progress value=&quot;10&quot; secondary-progress=&quot;30&quot;&gt;&lt;/paper-progress&gt;
 * 
 * 
 * </code></pre><p>Styling progress bar:</p>
 * <p>To change the active progress bar color:</p>
 * <pre><code>paper-progress {
 *    --paper-progress-active-color: #e91e63;
 * }
 * 
 * 
 * </code></pre><p>To change the secondary progress bar color:</p>
 * <pre><code>paper-progress {
 *   --paper-progress-secondary-color: #f8bbd0;
 * }
 * 
 * 
 * </code></pre><p>To change the progress bar background color:</p>
 * <pre><code>paper-progress {
 *   --paper-progress-container-color: #64ffda;
 * }
 * 
 * 
 * </code></pre>
 */
@JsType
public interface PaperProgressElement extends HTMLElement {

    public static final String TAG = "paper-progress";
    public static final String SRC = "paper-progress/paper-progress.html";


    /**
     * <p>Use an indeterminate progress indicator.</p>
     *
     * JavaScript Info:
     * @property indeterminate
     * @type Boolean
     * 
     */
    @JsProperty boolean getIndeterminate();
    /**
     * <p>Use an indeterminate progress indicator.</p>
     *
     * JavaScript Info:
     * @property indeterminate
     * @type Boolean
     * 
     */
    @JsProperty void setIndeterminate(boolean value);
  
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    @JsProperty double getSecondaryProgress();
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    @JsProperty void setSecondaryProgress(double value);
  
    /**
     * <p>The secondary ratio</p>
     *
     * JavaScript Info:
     * @property secondaryRatio
     * @type Number
     * 
     */
    @JsProperty double getSecondaryRatio();
    /**
     * <p>The secondary ratio</p>
     *
     * JavaScript Info:
     * @property secondaryRatio
     * @type Number
     * 
     */
    @JsProperty void setSecondaryRatio(double value);
  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty JsArray getObservers();
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    @JsProperty void setObservers(JsArray value);
  
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getMax();
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setMax(double value);
  
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getMin();
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setMin(double value);
  
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getRatio();
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setRatio(double value);
  
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getStep();
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setStep(double value);
  
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty double getValue();
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    @JsProperty void setValue(double value);
  
}
