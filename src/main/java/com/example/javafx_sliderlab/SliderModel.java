package com.example.javafx_sliderlab;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SliderModel {
    private final DoubleProperty sliderValue = new SimpleDoubleProperty(50);

    public double getSliderValue(){
        return sliderValue.get();
    }

    public void setSliderValue(double value){
        sliderValue.set(value);
    }

    public DoubleProperty sliderValueProperty(){
        return sliderValue;
    }
}
