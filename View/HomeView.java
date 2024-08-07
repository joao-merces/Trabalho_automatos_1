 package br.com.toyproblem.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeView extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/home.fxml"));
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
