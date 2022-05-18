package com.javafx.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

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
    protected void onChangeSelection() {
        System.out.println(tg.getSelectedToggle());
        if(tg.getSelectedToggle().toString().contains("Circle")) {
            c.setRadius(50);
            r.setWidth(0);
            e.setRadiusX(0);
            e.setRadiusY(0);
        }
        else if(tg.getSelectedToggle().toString().contains("Rectangle")){
            c.setRadius(0);
            r.setWidth(100);
            e.setRadiusX(0);
            e.setRadiusY(0);
        }
        else if(tg.getSelectedToggle().toString().contains("Ellipse")){
            c.setRadius(0);
            r.setWidth(0);
            e.setRadiusX(25);
            e.setRadiusY(65);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}