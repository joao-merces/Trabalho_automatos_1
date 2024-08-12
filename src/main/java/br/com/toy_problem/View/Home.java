package br.com.toy_problem.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Home extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/main.fxml"));
        Parent root = loader.load();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setWidth(1280);
        stage.setHeight(720);
        stage.setScene(scene);
        stage.setTitle("Toy Problem 2");
        stage.show();
    }
}
