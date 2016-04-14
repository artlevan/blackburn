/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;

import java.util.Random;

/**
 *
 * @author Artmar
 */
public class ComputerPlayer extends Player {

    private Random r = new Random();

    public ComputerPlayer(String name) {
        this.name = name;
    }

    public void addResult(Round round) {

    }

    public Move getMove() {
        int rng = r.nextInt(3 - 1 + 1) + 1;
        if (rng == 1) {
            return Move.ROCK;
        } else if (rng == 2) {
            return Move.PAPER;
        } else {
            return Move.SCISSORS;
        }
    }
}
