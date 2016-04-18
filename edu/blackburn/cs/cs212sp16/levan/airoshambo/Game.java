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
public class Game {

    private Statistics stats;
    private HumanPlayer p1;
    private ComputerPlayer p2;
    private Round r;
    private int rounds;
    private int count = 0;

    public Game(HumanPlayer p1, ComputerPlayer p2, int rounds) {
        this.p1 = p1;
        this.p2 = p2;
        this.rounds = rounds;
        this.stats = new Statistics();
    }

    public Statistics getStats() {
        return this.stats;
    }
    public void humanMove(Move move){
        p1.setMove(move);
    }
    public void run() {
//        while (count != this.rounds) {
        this.r = new Round(p1.getMove(), p2.getMove());
        stats.addRound();
        stats.setWins(r.getWinner());
 //        }
    }
    
    public Winner roundWinner(){
        return this.r.getWinner();
    }
    
    public Move p2Move(){
        return this.r.getP2Move();
    }
    
    
}
