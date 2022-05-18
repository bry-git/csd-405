package com.javafx.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#controllers
 * */

public class ShapesController implements Initializable {
    @FXML
    private VBox vbox;
    @FXML
    private HBox hbox;
    @FXML
    private Circle c;
    @FXML
    private Rectangle r;
    @FXML
    private Ellipse e;
    @FXML
    private ToggleGroup tg;
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;
    @FXML
    private RadioButton rb3;

    @FXML
    private ToggleGroup tg2;
    @FXML
    private RadioButton rb21;
    @FXML
    private RadioButton rb22;
    @FXML
    private RadioButton rb23;

    private Shape s;

    @FXML
    protected void onChangeSelection() {
        if(tg.getSelectedToggle().toString().contains("Circle")) {
            s = c;
            c.setRadius(50);
            r.setWidth(0);
            e.setRadiusX(0);
            e.setRadiusY(0);
        }
        else if(tg.getSelectedToggle().toString().contains("Rectangle")){
            s = r;
            c.setRadius(0);
            r.setWidth(100);
            e.setRadiusX(0);
            e.setRadiusY(0);
        }
        else if(tg.getSelectedToggle().toString().contains("Ellipse")){
            s = e;
            c.setRadius(0);
            r.setWidth(0);
            e.setRadiusX(25);
            e.setRadiusY(65);
        }
    }

    @FXML
    protected void onChangeColor() {
        if(tg2.getSelectedToggle().toString().contains("Red")) {
            s.setFill(Color.RED);
        }
        else if(tg2.getSelectedToggle().toString().contains("Blue")){
            s.setFill(Color.BLUE);
        }
        else if(tg2.getSelectedToggle().toString().contains("Green")){
            s.setFill(Color.GREEN);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}