/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

/**
 *
 * @author Artmar
 */
public class HumanPlayer extends Player {
    private String choice;
    public HumanPlayer(String name) {
        super(name);
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return this.choice;
    }
}
