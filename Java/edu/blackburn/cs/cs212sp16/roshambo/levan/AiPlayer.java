/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import java.util.Random;

/**
 *
 * @author Arthur
 */
public class AiPlayer extends Player {
    private String choice;
    private Random r = new Random();

    public AiPlayer(String name) {
        super(name);
    }

    public void setChoice() {
        int rng = r.nextInt(2 - 0 + 1) + 0;
        if (rng == 0) {
            this.choice = "rock";
        } else if (rng == 1) {
            this.choice = "paper";
        } else {
            this.choice = "scissors";
        }
    }

   
    public String getChoice() {
        return this.choice;
    }

}


