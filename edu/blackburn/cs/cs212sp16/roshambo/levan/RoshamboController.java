/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author student
 */
public class RoshamboController implements Initializable {
    HumanPlayer playerOne = new HumanPlayer("Arthur");
    AiPlayer playerTwo = new AiPlayer("Computer");
    private int playerWins = 0;
    private int aiWins = 0;
    private int ties = 0;


//    @FXML
//    private int playerLife = playerOne.getLife();
//        @FXML
//    private int computerLife = playerTwo.getLife();
    @FXML
    private TextField player;
    @FXML
    private TextField ai;
    @FXML
    private TextField tie;
    @FXML
    private TextField playerMove;
    @FXML
    private TextField aiMove;
    @FXML
    private TextField whoWins;
    @FXML
    private void handleRock(ActionEvent event) {
        playerOne.setChoice("rock");
        playerTwo.setChoice();
        compareChoices();
    }
    @FXML
    private void handlePaper(ActionEvent event) {
        playerOne.setChoice("paper");
        playerTwo.setChoice();
        compareChoices();
    }
    @FXML
    private void handleScissor(ActionEvent event) {
        playerOne.setChoice("scissors");
        playerTwo.setChoice();
        compareChoices();
    }
    
    public void compareChoices() {
        if (playerOne.getChoice().equals("rock") && playerTwo.getChoice().equals("scissors")) {
            playerWins++;
            playerTwo.loseLife();
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice().equals("scissors") && playerTwo.getChoice().equals("paper")) {
            playerWins++;
            playerTwo.loseLife();
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice().equals("paper") && playerTwo.getChoice().equals("rock")) {
            playerWins++;
            playerTwo.loseLife();
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice().equals(playerTwo.getChoice())) {
            ties++;
            whoWins.setText("The Game is a Tie!");
        } else {
            aiWins++;
            playerOne.loseLife();
            whoWins.setText("The computer wins!");
        }
        player.setText(Integer.toString(playerWins));
        ai.setText(Integer.toString(aiWins));
        tie.setText(Integer.toString(ties));
        playerMove.setText("Player Choice = " + playerOne.getChoice());
        aiMove.setText("Computer's Choice = " + playerTwo.getChoice());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
