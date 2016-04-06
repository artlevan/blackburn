/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Artmar
 */
public class DialogController implements Initializable {

    @FXML
    private void handleShera() {
        HumanPlayer playerOne = new HumanPlayer("She-ra");
    }

    @FXML
    private void handleScarlett() {
        HumanPlayer playerOne = new HumanPlayer("Scarlett");
    }

    @FXML
    private void handlePenny() {
        HumanPlayer playerOne = new HumanPlayer("Penny");
    }

    @FXML
    private void handleKim() {
        HumanPlayer playerOne = new HumanPlayer("Kim");
    }

    @FXML
    private void handleJem() {
        HumanPlayer playerOne = new HumanPlayer("Jem");
    }

    @FXML
    private void handleCheetara() {
        HumanPlayer playerOne = new HumanPlayer("Cheetara");
    }

    @FXML
    private void handleSteelheart() {
        HumanPlayer playerOne = new HumanPlayer("Steelheart");
    }

    @FXML
    private void handleCoogan() {
        HumanPlayer playerOne = new HumanPlayer("Kevin Coogan");
    }

    @FXML
    private void handleGross() {
        HumanPlayer playerOne = new HumanPlayer("Joshua Gross");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
