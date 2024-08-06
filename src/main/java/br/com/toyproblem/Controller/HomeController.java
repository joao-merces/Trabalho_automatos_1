package br.com.toyproblem.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Line line_k;

    @FXML
    private Line line_l;

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
