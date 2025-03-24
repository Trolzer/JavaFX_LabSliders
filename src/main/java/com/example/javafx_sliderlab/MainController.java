package com.example.javafx_sliderlab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class MainController {

    @FXML private Label sliderValueLabel;
    @FXML private Slider valueSlider;
    private SliderModel model = new SliderModel();

    @FXML
    public void initialize(){
        sliderValueLabel.textProperty().bind(model.sliderValueProperty().asString("%.0f"));

        valueSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            model.setSliderValue(newVal.doubleValue());
        });
    }
}
