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
import java.util.*;

public class HumanPlayer extends Player {

    Scanner input = new Scanner(System.in);
    private Move choice;

    public HumanPlayer(String name) {
        this.name = name;
    }
    //Sets the Player's move
    public void setMove(Move move){
        this.choice = move;
    }
    //Returns the Player's move
    public Move getMove() {
        return this.choice;

    }
}
