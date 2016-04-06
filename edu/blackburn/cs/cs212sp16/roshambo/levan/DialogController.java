/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;


/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class DialogController implements Initializable {

    HumanPlayer player;

    @FXML
    private void handleShera(ActionEvent event) {
        player = new HumanPlayer("She-ra");
    }

    @FXML
    private void handleScarlett(ActionEvent event) {
        player = new HumanPlayer("Scarlett");
    }

    @FXML
    private void handlePenny(ActionEvent event) {
        player = new HumanPlayer("Penny");
    }

    @FXML
    private void handleKim(ActionEvent event) {
        player = new HumanPlayer("Kim");
    }

    @FXML
    private void handleJem(ActionEvent event) {
        player = new HumanPlayer("Jem");
    }

    @FXML
    private void handleCheetara(ActionEvent event) {
        player = new HumanPlayer("Cheetara");
    }

    @FXML
    private void handleSteelheart(ActionEvent event) {
        player = new HumanPlayer("Steelheart");
    }

    @FXML
    private void handleCoogan(ActionEvent event) {
        player = new HumanPlayer("Kevin Coogan");
    }

    @FXML
    private void handleGross(ActionEvent event) {
        player = new HumanPlayer("Joshua Gross");
    }
    
    public String getPlayer(){
        return player.getName();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
