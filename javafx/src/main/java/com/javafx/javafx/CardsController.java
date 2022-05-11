package com.javafx.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#controllers
 * */

public class CardsController implements Initializable {
    @FXML
    private VBox vbox;
    @FXML
    private HBox hbox;
    @FXML
    private ImageView cv1;
    @FXML
    private ImageView cv2;
    @FXML
    private ImageView cv3;
    @FXML
    private ImageView cv4;
    @FXML
    private Button drawButton;

    @FXML
    protected void onDrawAgainClick() {
        Random r = new Random();
        int card1index = r.nextInt(55 - 1) + 1;
        int card2index = r.nextInt(55 - 1) + 1;
        int card3index = r.nextInt(55 - 1) + 1;
        int card4index = r.nextInt(55 - 1) + 1;

        Image i = new Image(getClass().getResourceAsStream("cards/"+card1index+".png"));
        cv1.setImage(i);

        Image i2 = new Image(getClass().getResourceAsStream("cards/"+card2index+".png"));
        cv2.setImage(i2);

        Image i3 = new Image(getClass().getResourceAsStream("cards/"+card3index+".png"));
        cv3.setImage(i3);

        Image i4 = new Image(getClass().getResourceAsStream("cards/"+card4index+".png"));
        cv4.setImage(i4);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random r = new Random();
        int card1index = r.nextInt(55 - 1) + 1;
        int card2index = r.nextInt(55 - 1) + 1;
        int card3index = r.nextInt(55 - 1) + 1;
        int card4index = r.nextInt(55 - 1) + 1;

        Image i = new Image(getClass().getResourceAsStream("cards/"+card1index+".png"));
        cv1.setImage(i);

        Image i2 = new Image(getClass().getResourceAsStream("cards/"+card2index+".png"));
        cv2.setImage(i2);

        Image i3 = new Image(getClass().getResourceAsStream("cards/"+card3index+".png"));
        cv3.setImage(i3);

        Image i4 = new Image(getClass().getResourceAsStream("cards/"+card4index+".png"));
        cv4.setImage(i4);

        drawButton = new Button();
        drawButton.setText("Draw Again");
    }


}