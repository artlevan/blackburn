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
public class Statistics {

    private int roundsCount;
    private int ties;
    private int p1Wins;
    private int p2Wins;

    public void Statistics() {

    }

    //Sets the Winner and Tie totals
    public void setWins(Winner winner) {
        if (winner.equals(Winner.P1)) {
            this.p1Wins++;
        } else if (winner.equals(Winner.P2)) {
            this.p2Wins++;
        } else {
            this.ties++;
        }
    }

    //Returns the total number of Ties
    public int getTies() {
        return this.ties;
    }

    //Returns the total Player wins
    public int getP1Wins() {
        return this.p1Wins;
    }

    //Returns the total RandomPlayer wins
    public int getP2Wins() {
        return this.p2Wins;
    }

    //Returns the current number of Rounds played
    public int getRoundsPlayed() {
        return this.roundsCount;
    }

    //Adds to the total number of Rounds
    public void addRound() {
        this.roundsCount++;
    }

    //Allows the numerical data to be printed to the screen
    @Override
    public String toString() {
        return "Rounds played = " + roundsCount + "\n Ties = " + ties + "\n p1Wins = " + p1Wins + "\n p2Wins = " + p2Wins;
    }

}
