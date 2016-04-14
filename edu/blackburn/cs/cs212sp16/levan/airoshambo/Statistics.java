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
    
}
