/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-progress project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PaperProgress extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperProgress() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperProgress(String html) {
        super(PaperProgressElement.TAG, PaperProgressElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperProgressElement getPolymerElement() {
        return (PaperProgressElement) getElement();
    }


  
    /**
     * <p>Use an indeterminate progress indicator.</p>
     *
     * JavaScript Info:
     * @property indeterminate
     * @type Boolean
     * 
     */
    public boolean getIndeterminate(){
        return getPolymerElement().getIndeterminate();
    }
    /**
     * <p>Use an indeterminate progress indicator.</p>
     *
     * JavaScript Info:
     * @property indeterminate
     * @type Boolean
     * 
     */
    public void setIndeterminate(boolean value) {
        getPolymerElement().setIndeterminate(value);
    }
   
  

  
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public double getSecondaryProgress(){
        return getPolymerElement().getSecondaryProgress();
    }
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @property secondaryProgress
     * @type Number
     * 
     */
    public void setSecondaryProgress(double value) {
        getPolymerElement().setSecondaryProgress(value);
    }
   
    /**
     * <p>The number that represents the current secondary progress.</p>
     *
     * JavaScript Info:
     * @attribute secondary-progress
     * 
     */
    public void setSecondaryProgress(String value) {
        getPolymerElement().setAttribute("secondary-progress", value);
    }
   
  

  
    /**
     * <p>The secondary ratio</p>
     *
     * JavaScript Info:
     * @property secondaryRatio
     * @type Number
     * 
     */
    public double getSecondaryRatio(){
        return getPolymerElement().getSecondaryRatio();
    }
    /**
     * <p>The secondary ratio</p>
     *
     * JavaScript Info:
     * @property secondaryRatio
     * @type Number
     * 
     */
    public void setSecondaryRatio(double value) {
        getPolymerElement().setSecondaryRatio(value);
    }
   
    /**
     * <p>The secondary ratio</p>
     *
     * JavaScript Info:
     * @attribute secondary-ratio
     * 
     */
    public void setSecondaryRatio(String value) {
        getPolymerElement().setAttribute("secondary-ratio", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * 
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  

  
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public double getMax(){
        return getPolymerElement().getMax();
    }
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * @behavior PaperSlider
     */
    public void setMax(double value) {
        getPolymerElement().setMax(value);
    }
   
    /**
     * <p>The number that indicates the maximum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute max
     * @behavior PaperSlider
     */
    public void setMax(String value) {
        getPolymerElement().setAttribute("max", value);
    }
   
  

  
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public double getMin(){
        return getPolymerElement().getMin();
    }
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * @behavior PaperSlider
     */
    public void setMin(double value) {
        getPolymerElement().setMin(value);
    }
   
    /**
     * <p>The number that indicates the minimum value of the range.</p>
     *
     * JavaScript Info:
     * @attribute min
     * @behavior PaperSlider
     */
    public void setMin(String value) {
        getPolymerElement().setAttribute("min", value);
    }
   
  

  
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public double getRatio(){
        return getPolymerElement().getRatio();
    }
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @property ratio
     * @type Number
     * @behavior PaperSlider
     */
    public void setRatio(double value) {
        getPolymerElement().setRatio(value);
    }
   
    /**
     * <p>Returns the ratio of the value.</p>
     *
     * JavaScript Info:
     * @attribute ratio
     * @behavior PaperSlider
     */
    public void setRatio(String value) {
        getPolymerElement().setAttribute("ratio", value);
    }
   
  

  
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public double getStep(){
        return getPolymerElement().getStep();
    }
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * @behavior PaperSlider
     */
    public void setStep(double value) {
        getPolymerElement().setStep(value);
    }
   
    /**
     * <p>Specifies the value granularity of the range’s value.</p>
     *
     * JavaScript Info:
     * @attribute step
     * @behavior PaperSlider
     */
    public void setStep(String value) {
        getPolymerElement().setAttribute("step", value);
    }
   
  

  
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    public double getValue(){
        return getPolymerElement().getValue();
    }
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * @behavior PaperSlider
     */
    public void setValue(double value) {
        getPolymerElement().setValue(value);
    }
   
    /**
     * <p>The number that represents the current value.</p>
     *
     * JavaScript Info:
     * @attribute value
     * @behavior PaperSlider
     */
    public void setValue(String value) {
        getPolymerElement().setAttribute("value", value);
    }
   
  


}
