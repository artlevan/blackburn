/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Artmar
 */
public class AiRoshamboController implements Initializable {

    private int count = 0;
    private int rounds = 10;
    private Move move;
    private HumanPlayer p1 = new HumanPlayer("");
    private ComputerPlayer p2 = new ComputerPlayer("Roshambot");
    private Game game = new Game(p1, p2, rounds);


    /**
     * Initializes the controller class.
     */
    @FXML
    static Parent root;

    @FXML
    private TextField winner;

    @FXML
    private TextField player;
    
    @FXML
    private TextField computer;
    
    @FXML
    private TextField stats;
    
    @FXML
    private TextField totalRounds;
    

    
 
    @FXML
    private void handleRock(ActionEvent event) {
        this.move = Move.ROCK;
        game.humanMove(move);
        player.setText("You chose ROCK");
        playGame();
    }

    //Handler for the Paper button.
    @FXML
    private void handlePaper(ActionEvent event) {
        this.move = Move.PAPER;
        game.humanMove(move);
        player.setText("You chose PAPER");
        playGame();
    }

    //Handler for the Scissor button.
    @FXML
    private void handleScissor(ActionEvent event) {
        this.move = Move.SCISSORS;
        game.humanMove(move);
        player.setText("You chose SCISSORS");
        playGame();
    }

    public void showWinner(Winner result) {
        if (result.equals(Winner.TIE)) {
            winner.setText(Winner.TIE + " Game!");
        } else {
            winner.setText(result + " wins!");
        }
    }

    public Move getMove() {
        return this.move;
    }

    public void playGame() {
        totalRounds.setText("Best of 10 Rounds");
        
        if (count < rounds) {
            game.run();
            
            showWinner(game.roundWinner());
            computer.setText("P2 Chose " + game.p2Move());
            count++;
            stats.setText(game.getStats() + "");
        } else {
            stats.setText(game.getStats() + "");
            Stage stage = (Stage) root.getScene().getWindow();
            stage.hide();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
