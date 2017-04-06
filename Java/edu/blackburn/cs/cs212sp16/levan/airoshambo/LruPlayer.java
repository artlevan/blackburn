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
public class LruPlayer extends ComputerPlayer {

    private CircularLinkedList cl = new CircularLinkedList();
    private Move move;

    public LruPlayer(String name) {
        super(name);

    }

    public void addRound(Round round) {
        this.cl.add(round);
    }

    public void setMove() {
        getMove();

    }

    public Move getMove() {
        return this.move;
    }

}
