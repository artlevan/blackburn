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
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;

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
    private double playerLife = 1.0;
    private double aiLife = 1.0;

    @FXML
    static Parent root;

    @FXML
    private ProgressBar playerOneLife;
    
    @FXML
    private ProgressBar playerTwoLife;
    
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
    
    //Handler for the Rock button.
    @FXML
    private void handleRock(ActionEvent event) {
        playerOne.setChoice("rock");
        playerTwo.setChoice();
        playGame();
    }
    //Handler for the Paper button.
    @FXML
    private void handlePaper(ActionEvent event) {
        playerOne.setChoice("paper");
        playerTwo.setChoice();
        playGame();
    }
    //Handler for the Scissor button.
    @FXML
    private void handleScissor(ActionEvent event) {
        playerOne.setChoice("scissors");
        playerTwo.setChoice();
        playGame();
    }
    //Plays the game; unless the player or computer has no life left, then it closes.
    public void playGame() {
        if (playerLife > 0 && aiLife != 0) {
            compareChoices();
        }
        if (playerLife <= 0 || aiLife <= 0) {
            Stage stage = (Stage) root.getScene().getWindow();
            stage.hide();
        }

    }
    //Compares the Player and Computer's choices to decide a winner or tie.
    public void compareChoices() {
        if (playerOne.getChoice().equals("rock") && playerTwo.getChoice().equals("scissors")) {
            playerWins++;
            playerTwoLife.setProgress(aiLife = aiLife - .1);
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice().equals("scissors") && playerTwo.getChoice().equals("paper")) {
            playerWins++;
            playerTwoLife.setProgress(aiLife = aiLife - .1);
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice().equals("paper") && playerTwo.getChoice().equals("rock")) {
            playerWins++;
            playerTwoLife.setProgress(aiLife = aiLife - .1);
            whoWins.setText("Player Wins!");
        } else if (playerOne.getChoice()
                .equals(playerTwo.getChoice())) {
            ties++;
            whoWins.setText("The Game is a Tie!");
        } else {
            aiWins++;
            playerOneLife.setProgress(playerLife = playerLife - .1);
            whoWins.setText("The computer wins!");
        }

        player.setText(Integer.toString(playerWins));
        ai.setText(Integer.toString(aiWins));
        tie.setText(Integer.toString(ties));
        playerMove.setText(
                "Player Choice = " + playerOne.getChoice());
        aiMove.setText(
                "Computer's Choice = " + playerTwo.getChoice());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
