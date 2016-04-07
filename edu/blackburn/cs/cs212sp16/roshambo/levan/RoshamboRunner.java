/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import javafx.stage.Stage;

/**
 *
 * @author arthur levan estimated time: 8 hours 
 * actual time: 7 hours
 */
public class RoshamboRunner extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Stage dialogStage = new Stage();
        DialogController.root = FXMLLoader.load(getClass().getResource("Dialog.fxml"));
        Scene dialogScene = new Scene(DialogController.root);
        dialogStage.setScene(dialogScene);
        dialogStage.showAndWait();
        
        Stage gameStage = new Stage();
        RoshamboController.root = FXMLLoader.load(getClass().getResource("Roshambo.fxml"));
        Scene scene = new Scene(RoshamboController.root);
        gameStage.setScene(scene);
        gameStage.showAndWait();
        
        
        StatisticsController.root = FXMLLoader.load(getClass().getResource("Statistics.fxml"));
        Scene statScene = new Scene(StatisticsController.root);
        primaryStage.setScene(statScene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
