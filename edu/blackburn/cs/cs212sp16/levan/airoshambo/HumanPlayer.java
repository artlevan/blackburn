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
    int choice;

    public HumanPlayer(String name) {
        this.name = name;
    }

    public void addResult(Round round) {

    }

    public Move getMove() {
        System.out.print("Please select your move: ");
        System.out.println("[1] Rock [2] Paper [3] Scissors");
        choice = input.nextInt();
        while ((choice > 3) || (choice < 1)) {
            System.out.println("Please select only numbers 1, 2, or 3");
            System.out.print("Please select your move: ");
            System.out.println("[1] Rock [2] Paper [3] Scissors");
            choice = input.nextInt();
        }
        if (choice == 1) {
            return Move.ROCK;
        } else if (choice == 2) {
            return Move.PAPER;
        } else {
            return Move.SCISSORS;
        }

    }
}
