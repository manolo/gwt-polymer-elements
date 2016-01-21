/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-progress project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/components/progress-activity.html">Progress &amp; activity</a></p>
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
 * </code></pre><h3 id="styling-progress-bar-">Styling progress bar:</h3>
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
 * </code></pre><p>Add the class <code>transiting</code> to a paper-progress to animate the progress bar when<br>the value changed. You can also customize the transition:</p>
 * <pre><code>paper-progress {
 *   --paper-progress-transition-duration: 0.08s;
 *   --paper-progress-transition-timing-function: ease;
 *   --paper-progress-transition-transition-delay: 0s;
 * }
 * 
 * 
 * </code></pre><p>The following mixins are available for styling:</p>
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
 * <td><code>--paper-progress-container-color</code></td>
 * <td>Mixin applied to container</td>
 * <td><code>--google-grey-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-transition-duration</code></td>
 * <td>Duration of the transition</td>
 * <td><code>0.008s</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-transition-timing-function</code></td>
 * <td>The timing function for the transition</td>
 * <td><code>ease</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-transition-delay</code></td>
 * <td>delay for the transition</td>
 * <td><code>0s</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-active-color</code></td>
 * <td>The color of the active bar</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-secondary-color</code></td>
 * <td>The color of the secondary bar</td>
 * <td><code>--google-green-100</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-disabled-active-color</code></td>
 * <td>The color of the active bar if disabled</td>
 * <td><code>--google-grey-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-disabled-secondary-color</code></td>
 * <td>The color of the secondary bar if disabled</td>
 * <td><code>--google-grey-300</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-progress-height</code></td>
 * <td>The height of the progress bar</td>
 * <td><code>4px</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperProgressElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-progress";
    @JsOverlay public static final String SRC = "paper-progress/paper-progress.html";


    /**
     * <p>True if the progress is disabled.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisabled();
    /**
     * <p>True if the progress is disabled.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * 
     */
    @JsProperty void setDisabled(boolean value);

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
