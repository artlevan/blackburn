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
 * @author student
 */
public class RoshamboRunner extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Stage dialogStage = new Stage();
        Parent vb = FXMLLoader.load(getClass().getResource("Dialog.fxml"));
        Scene dialogScene = new Scene(vb);
        dialogStage.setScene(dialogScene);
        dialogStage.showAndWait();

        Parent root = FXMLLoader.load(getClass().getResource("Roshambo.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
