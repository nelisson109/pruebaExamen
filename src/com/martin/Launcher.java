package com.martin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
        Parent root = FXMLLoader.load(getClass().getResource("Views/PantallaPrincipal.fxml"));
        stage.setTitle("Pantalla Principal");
        stage.setScene(new Scene(root, 1100, 600));
        stage.show();
    }
    public static void main(String args[]){
        launch();
    }
}
