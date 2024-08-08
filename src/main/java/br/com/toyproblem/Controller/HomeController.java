package br.com.toyproblem.Controller;

import javafx.animation.FillTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HomeController implements Initializable {
    

    @FXML
    private TextField txtFieldBaldes;

    @FXML
    private Line flecha_bb;

    @FXML
    private Line flecha_ba;

    @FXML
    private Line flecha_db;

    @FXML
    private Line line_a;

    @FXML
    private Line line_b;

    @FXML
    private Line flecha_ic;

    @FXML
    private Line flecha_ib;

    @FXML
    private Line line_i;

    @FXML
    private Line line_j;

    @FXML
    private Line line_g;

    @FXML
    private Line line_h;

    @FXML
    private Line line_e;

    @FXML
    private Line line_f;

    @FXML
    private Line line_c;

    @FXML
    private Line line_d;

    @FXML
    private Pane line_q;

    @FXML
    private Line line_r;

    @FXML
    private Line line_o;

    @FXML
    private Line line_p;

    @FXML
    private Line line_m;

    @FXML
    private Line line_n;

    @FXML
    private Line line_k;

    @FXML
    private Line line_l;

    @FXML
    private Line flecha_ab;

    @FXML
    private Line flecha_aa;

    @FXML
    private Line flecha_cb;

    @FXML
    private Line flecha_ca;

    @FXML
    private Button btn_start;

    @FXML
    private Line flecha_da;

    @FXML
    private Line flecha_hc;

    @FXML
    private Line flecha_hb;

    @FXML
    private Circle circle;

    @FXML
    private Label label_error;

    @FXML
    void btn_start_clicked(ActionEvent event) {

        int buckets = 1;

        String inputText = txtFieldBaldes.getText();
        if (inputText != null && !inputText.trim().isEmpty()) {
            try {
                buckets = Integer.parseInt(inputText);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida");
                label_error.setVisible(true);
                return;
            }
        }

        TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(0.5));
        transition1.setNode(circle);
        transition1.setToX(0);
        transition1.setToY(-130);

        TranslateTransition transition2 = new TranslateTransition();
        transition2.setDuration(Duration.seconds(0.5));
        transition2.setNode(circle);
        transition2.setToX(440);
        transition2.setToY(-130);

        TranslateTransition transition3 = new TranslateTransition();
        transition3.setDuration(Duration.seconds(0.5));
        transition3.setNode(circle);
        transition3.setToX(460);
        transition3.setToY(0);

        TranslateTransition transition4 = new TranslateTransition();
        transition4.setDuration(Duration.seconds(0.5));
        transition4.setNode(circle);
        transition4.setToX(480);
        transition4.setToY(-130);

        TranslateTransition transition5 = new TranslateTransition();
        transition5.setDuration(Duration.seconds(0.5));
        transition5.setNode(circle);
        transition5.setToX(940);
        transition5.setToY(-130);

        TranslateTransition transition6 = new TranslateTransition();
        transition6.setDuration(Duration.seconds(0.5));
        transition6.setNode(circle);
        transition6.setToX(940);
        transition6.setToY(60);

        TranslateTransition transition7 = new TranslateTransition();
        transition7.setDuration(Duration.seconds(0.5));
        transition7.setNode(circle);
        transition7.setToX(1080);
        transition7.setToY(60);

        TranslateTransition transition8 = new TranslateTransition();
        transition8.setDuration(Duration.seconds(0.5));
        transition8.setNode(circle);
        transition8.setToX(1080);
        transition8.setToY(-20);

        TranslateTransition transition9 = new TranslateTransition();
        transition9.setDuration(Duration.seconds(0.5));
        transition9.setNode(circle);
        transition9.setToX(940);
        transition9.setToY(-20);
        
        FillTransition colorTransitionToGray = new FillTransition(Duration.seconds(0.5), circle, Color.DARKBLUE, Color.GRAY);

        TranslateTransition transition10 = new TranslateTransition();
        transition10.setDuration(Duration.seconds(0.5));
        transition10.setNode(circle);
        transition10.setToX(940);
        transition10.setToY(130);

        TranslateTransition transition11 = new TranslateTransition();
        transition11.setDuration(Duration.seconds(0.5));
        transition11.setNode(circle);
        transition11.setToX(480);
        transition11.setToY(130);

        TranslateTransition transition12 = new TranslateTransition();
        transition12.setDuration(Duration.seconds(0.5));
        transition12.setNode(circle);
        transition12.setToX(460);
        transition12.setToY(0);

        TranslateTransition transition13 = new TranslateTransition();
        transition13.setDuration(Duration.seconds(0.5));
        transition13.setNode(circle);
        transition13.setToX(440);
        transition13.setToY(130);

        TranslateTransition transition14 = new TranslateTransition();
        transition14.setDuration(Duration.seconds(0.5));
        transition14.setNode(circle);
        transition14.setToX(0);
        transition14.setToY(130);

        TranslateTransition transition15 = new TranslateTransition();
        transition15.setDuration(Duration.seconds(0.5));
        transition15.setNode(circle);
        transition15.setToX(0);
        transition15.setToY(25);

        TranslateTransition transition16 = new TranslateTransition();
        transition16.setDuration(Duration.seconds(0.5));
        transition16.setNode(circle);
        transition16.setToX(-150);
        transition16.setToY(25);

        TranslateTransition transition17 = new TranslateTransition();
        transition17.setDuration(Duration.seconds(0.5));
        transition17.setNode(circle);
        transition17.setToX(-150);
        transition17.setToY(-40);

        TranslateTransition transition18 = new TranslateTransition();
        transition18.setDuration(Duration.seconds(0.5));
        transition18.setNode(circle);
        transition18.setToX(0);
        transition18.setToY(-40);

        FillTransition colorTransitionToDarkBlue = new FillTransition(Duration.seconds(0.5), circle, Color.GRAY, Color.DARKBLUE);

        SequentialTransition sequentialTransition = new SequentialTransition(
                transition1, transition2, transition3, transition4, transition5,
                transition6, transition7, transition8, transition9, colorTransitionToGray, transition10,
                transition11, transition12, transition13, transition14, transition15,
                transition16, transition17, transition18, colorTransitionToDarkBlue);

        SequentialTransition fullTransition = new SequentialTransition();
        for (int i = 0; i < buckets; i++) {
            SequentialTransition newSequentialTransition = new SequentialTransition(
                    transition1, transition2, transition3, transition4, transition5,
                    transition6, transition7, transition8, transition9, colorTransitionToGray, transition10,
                    transition11, transition12, transition13, transition14, transition15,
                    transition16, transition17, transition18, colorTransitionToDarkBlue);
            fullTransition.getChildren().add(newSequentialTransition);
        }
        fullTransition.play();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        label_error.setVisible(false);

        line_a.setStartX(30);
        line_a.setStartY(80);
        line_a.setEndX(30);
        line_a.setEndY(143);

        line_b.setStartX(-294);
        line_b.setStartY(80);
        line_b.setEndX(150);
        line_b.setEndY(80);

        line_c.setStartX(90);
        line_c.setStartY(26);
        line_c.setEndX(90);
        line_c.setEndY(88);

        line_d.setStartX(40);
        line_d.setStartY(14);
        line_d.setEndX(40);
        line_d.setEndY(76);

        line_e.setStartX(-370);
        line_e.setStartY(68);
        line_e.setEndX(100);
        line_e.setEndY(68);

        line_f.setStartX(-46);
        line_f.setStartY(134);
        line_f.setEndX(-46);
        line_f.setEndY(69);

        line_g.setStartX(520);
        line_g.setStartY(-86);
        line_g.setEndX(520);
        line_g.setEndY(-26);

        line_h.setStartX(160);
        line_h.setStartY(-84);
        line_h.setEndX(160);
        line_h.setEndY(-26);

        line_i.setStartX(-350);
        line_i.setStartY(-138);
        line_i.setEndX(-350);
        line_i.setEndY(-80);

        line_j.setStartX(-360);
        line_j.setStartY(-90);
        line_j.setEndX(90);
        line_j.setEndY(-90);

        line_k.setStartX(186);
        line_k.setStartY(-36);
        line_k.setEndX(656);
        line_k.setEndY(-36);

        line_l.setStartX(980);
        line_l.setStartY(-92);
        line_l.setEndX(980);
        line_l.setEndY(-36);

        flecha_aa.setStartX(460);
        flecha_aa.setEndX(454);
        flecha_aa.setStartY(40);
        flecha_aa.setEndY(60);

        flecha_ab.setStartX(439);
        flecha_ab.setEndX(445);
        flecha_ab.setStartY(30);
        flecha_ab.setEndY(52);

        flecha_ba.setStartX(931);
        flecha_ba.setEndX(937);
        flecha_ba.setStartY(20);
        flecha_ba.setEndY(40);

        flecha_bb.setStartX(953);
        flecha_bb.setEndX(946);
        flecha_bb.setStartY(30);
        flecha_bb.setEndY(50);

        flecha_ca.setStartX(466);
        flecha_ca.setEndX(460);
        flecha_ca.setStartY(179);
        flecha_ca.setEndY(200);

        flecha_cb.setStartX(458);
        flecha_cb.setEndX(463);
        flecha_cb.setStartY(166);
        flecha_cb.setEndY(188);

        flecha_da.setStartX(-38);
        flecha_da.setEndX(-32);
        flecha_da.setStartY(160);
        flecha_da.setEndY(188);

        flecha_db.setStartX(-28);
        flecha_db.setEndX(-36);
        flecha_db.setStartY(168);
        flecha_db.setEndY(198);
    }
}
