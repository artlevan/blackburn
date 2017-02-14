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

    public Game(HumanPlayer p1, ComputerPlayer p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.stats = new Statistics();
    }

    //Returns the current Stats of the Game.
    public Statistics getStats() {
        return this.stats;
    }

    //Sets the Player's move from the controller
    public void humanMove(Move move) {
        p1.setMove(move);
    }

    //Creates a new round and adds the results of the rounds to the Statistics
    public void run() {

        this.r = new Round(p1.getMove(), p2.getMove());
        stats.addRound();
        stats.setWins(r.getWinner());

    }

    //Returns the current Round's winner
    public Winner roundWinner() {
        return this.r.getWinner();
    }

    //Returns the RandomPlayer's move
    public Move p2Move() {
        return this.r.getP2Move();
    }

}
