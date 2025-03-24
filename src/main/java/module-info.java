module com.example.javafx_sliderlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_sliderlab to javafx.fxml;
    exports com.example.javafx_sliderlab;
}