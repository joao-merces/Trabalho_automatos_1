package br.com.toy_problem.Controller;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.fxml.FXML;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Circle circle;

    private double TEMP = 0.5;
    @FXML
    private Button btn;

    @FXML
    private TextField input;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void btn_clicked(ActionEvent event) {

        int buckets = 1;

        String inputText = input.getText();
        if (inputText != null && !inputText.trim().isEmpty()) {
            try {
                buckets = Integer.parseInt(inputText);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida");
                return;
            }
        }
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(TEMP));
        transition1.setNode(circle);
        transition1.setToX(196);
        transition1.setToY(0);

        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(TEMP));
        transition2.setNode(circle);
        transition2.setToX(390);
        transition2.setToY(0);

        TranslateTransition transition3 = new TranslateTransition();
        transition3.setDuration(Duration.seconds(TEMP));
        transition3.setNode(circle);
        transition3.setToX(580);
        transition3.setToY(0);

        TranslateTransition transition4 = new TranslateTransition();
        transition4.setDuration(Duration.seconds(TEMP));
        transition4.setNode(circle);
        transition4.setToX(580);
        transition4.setToY(-116);

        TranslateTransition transition5 = new TranslateTransition();
        transition5.setDuration(Duration.seconds(TEMP));
        transition5.setNode(circle);
        transition5.setToX(0);
        transition5.setToY(-116);

        TranslateTransition transition6 = new TranslateTransition();
        transition6.setDuration(Duration.seconds(TEMP));
        transition6.setNode(circle);
        transition6.setToX(0);
        transition6.setToY(0);

        SequentialTransition sequentialTransition = new SequentialTransition(
            transition1, transition2,transition3,transition4, transition5,transition6);


        SequentialTransition fullTransition = new SequentialTransition();
        for (int i = 0; i < buckets; i++) {
            SequentialTransition newSequentialTransition = new SequentialTransition(
                    transition1, transition2,transition3,transition4, transition5,transition6);
            fullTransition.getChildren().add(newSequentialTransition);
        }
        fullTransition.play();
    }
}
