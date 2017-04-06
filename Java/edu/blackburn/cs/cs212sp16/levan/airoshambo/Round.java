/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;

/**
 *
 * @author Arthur
 */
public class Round {

    private Move p1Move;
    private Move p2Move;

    public Round(Move p1Move, Move p2Move) {
        this.p1Move = p1Move;
        this.p2Move = p2Move;
    }

    //Determines the winner of a Round based on the Player's Move
    public Winner getWinner() {
        if (this.p1Move.equals(Move.ROCK) && this.p2Move.equals(Move.SCISSORS)) {
            return Winner.P1;
        }
        if (this.p1Move.equals(Move.PAPER) && this.p2Move.equals(Move.ROCK)) {
            return Winner.P1;
        }
        if (this.p1Move.equals(Move.SCISSORS) && this.p2Move.equals(Move.PAPER)) {
            return Winner.P1;
        }
        if (this.p1Move.equals(this.p2Move)) {
            return Winner.TIE;
        }

        return Winner.P2;
    }
    //Returns the Move of the Player 

    public Move getP1Move() {
        if (this.p1Move.equals(Move.SCISSORS)) {
            return Move.SCISSORS;
        }
        if (this.p1Move.equals(Move.ROCK)) {
            return Move.ROCK;
        } else {
            return Move.PAPER;
        }
    }

    //Returns the Move of the RandomPlayer 
    public Move getP2Move() {
        if (this.p2Move.equals(Move.SCISSORS)) {
            return Move.SCISSORS;
        }
        if (this.p2Move.equals(Move.ROCK)) {
            return Move.ROCK;
        } else {
            return Move.PAPER;
        }
    }
}
