/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;

/**
 *
 * @author Artmar
 */
import java.io.IOException;
import java.util.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AiRoshamboRunner extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException {

        Stage gameStage = new Stage();
        edu.blackburn.cs.cs212sp16.levan.airoshambo.AiRoshamboController.root = FXMLLoader.load(getClass().getResource("AiRoshambo.fxml"));
        Scene scene = new Scene(edu.blackburn.cs.cs212sp16.levan.airoshambo.AiRoshamboController.root);
        gameStage.setScene(scene);
        gameStage.showAndWait();

    }
    public static void main(String[] args) {

        launch(args);

    }

}
