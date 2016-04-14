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
public class Round {

    private Move p1Move;
    private Move p2Move;

    public Round(Move p1Move, Move p2Move) {
        this.p1Move = p1Move;
        this.p2Move = p2Move;
    }

    public Winner getWinner() {
        if (p1Move.equals(Move.ROCK) && p2Move.equals(Move.SCISSORS)) {
            return Winner.P1;
        }
        else if (p1Move.equals(Move.PAPER) && p2Move.equals(Move.ROCK)) {
            return Winner.P1;
        }
        else if (p1Move.equals(Move.SCISSORS) && p2Move.equals(Move.PAPER)) {
            return Winner.P1;
        }
        else if (p1Move.equals(p2Move)) {
            return Winner.TIE;
        }

        return Winner.P2;
    }
}
