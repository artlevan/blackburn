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
    
    public void Statistics(){
        
    }

    public void setWins(Winner winner){
            if(winner.equals(Winner.P1)){
                this.p1Wins++;
            } else if(winner.equals(Winner.P2)){
                this.p2Wins++;
            } else {
                this.ties++;
            }
    }
    public int getTies() {
        return this.ties;
    }

    public int getP1Wins() {
        return this.p1Wins;
    }

    public int getP2Wins() {
        return this.p2Wins;
    }
    
    public int getRoundsPlayed(){
        return this.roundsCount;
    }

    public void addRound(){
        this.roundsCount++;
    }
    
 

    @Override
    public String toString() {
        return "Rounds played = " + roundsCount + "\n Ties = " + ties + "\n p1Wins = " + p1Wins + "\n p2Wins = " + p2Wins;
    }
    
    
}
