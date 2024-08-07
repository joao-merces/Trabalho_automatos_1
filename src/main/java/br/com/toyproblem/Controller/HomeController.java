package br.com.toyproblem.Controller;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;

public class HomeController implements Initializable {

    @FXML
    private Line line_k;

    @FXML
    private Line line_l;

    @FXML
    private TextField txtFieldBaldes;

    @FXML
    private Line flecha_ab;

    @FXML
    private Line flecha_aa;

    @FXML
    private Line flecha_bb;

    @FXML
    private Line flecha_ba;

    @FXML
    private Line flecha_cb;

    @FXML
    private Line flecha_ca;

    @FXML
    private Line flecha_db;

    @FXML
    private Line line_a;

    @FXML
    private Button btn_start;

    @FXML
    private Line flecha_da;

    @FXML
    private Line line_b;

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
    private Circle circle;

    @FXML
    void btn_start_clicked(ActionEvent event) {
        // ESTADO H
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

        // ESTADO E
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

        PauseTransition p1 = new PauseTransition(Duration.seconds(2));

        // ESTADO I
        TranslateTransition transition6 = new TranslateTransition();
        transition6.setDuration(Duration.seconds(0.5));
        transition6.setNode(circle);
        transition6.setToX(940);
        transition6.setToY(0);
        transition6.setOnFinished(e -> {
            circle.setFill(Color.GRAY);
        });

        TranslateTransition transition7 = new TranslateTransition();
        transition7.setDuration(Duration.seconds(0.5));
        transition7.setNode(circle);
        transition7.setToX(940);
        transition7.setToY(130);

        TranslateTransition transition8 = new TranslateTransition();
        transition8.setDuration(Duration.seconds(0.5));
        transition8.setNode(circle);
        transition8.setToX(480);
        transition8.setToY(130);

        TranslateTransition transition9 = new TranslateTransition();
        transition9.setDuration(Duration.seconds(0.5));
        transition9.setNode(circle);
        transition9.setToX(460);
        transition9.setToY(0);

        TranslateTransition transition10 = new TranslateTransition();
        transition10.setDuration(Duration.seconds(0.5));
        transition10.setNode(circle);
        transition10.setToX(440);
        transition10.setToY(130);

        TranslateTransition transition11 = new TranslateTransition();
        transition11.setDuration(Duration.seconds(0.5));
        transition11.setNode(circle);
        transition11.setToX(0);
        transition11.setToY(130);

        TranslateTransition transition12 = new TranslateTransition();
        transition12.setDuration(Duration.seconds(0.5));
        transition12.setNode(circle);
        transition12.setToX(0);
        transition12.setToY(0);
        transition12.setOnFinished(e -> {
            circle.setFill(Color.DARKBLUE);
        });

        PauseTransition p2 = new PauseTransition(Duration.seconds(2));

        SequentialTransition sequentialTransition = new SequentialTransition(
                transition1, transition2, transition3, transition4, transition5,
                transition6, p1, transition7, transition8, transition9, transition10, transition11, transition12, p2);

        SequentialTransition fullTransition = new SequentialTransition();
        for (int i = 0; i < Integer.parseInt(txtFieldBaldes.getText()); i++) {
            SequentialTransition newSequentialTransition = new SequentialTransition(
                    transition1, transition2, transition3, transition4, transition5,
                    transition6, p1, transition7, transition8, transition9, transition10, transition11, transition12, p2);
            fullTransition.getChildren().add(newSequentialTransition);
        }
        fullTransition.play();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
