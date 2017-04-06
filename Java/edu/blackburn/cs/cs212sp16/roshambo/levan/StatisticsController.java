/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class StatisticsController implements Initializable {

    @FXML
    static Parent root;

    @FXML
    private void handleButton(ActionEvent event) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.hide();
//        player = new HumanPlayer("She-ra");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
