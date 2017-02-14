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
public class CircularLinkedList {

    private Node originalNode;
    private Node currentNode;

    public CircularLinkedList() {

        this.originalNode = null;
        this.currentNode = null;
    }

    //Adds a round to the end of the list and links back to the original
    public void add(Round round) {
        if (this.originalNode == null) {
            this.originalNode = new Node(round);
        } else if (this.originalNode.getNextNode() == null) {
            this.currentNode = new Node(round);
            this.originalNode.setNextNode(this.currentNode);
        } else {
            rotate();
            this.currentNode.setNextNode(new Node(round));
        }
        this.currentNode = this.originalNode;
    }

    //Rotates through the list while it has a next Node
    public void rotate() {
        do {
            getNext();
            
        } while (hasNext());

    }

    //Determines if the current Node has a next node
    public boolean hasNext() {
        if (this.currentNode.getNextNode() != null) {
            return true;
        }
        return false;
    }
     //Gets the next Node of the current Node
    public void getNext(){
            if (!hasNext()) {
            this.currentNode = this.originalNode.getNextNode();
        } else {
            this.currentNode = this.currentNode.getNextNode();
        }
    }
    //Gets the next Node of the current Node and returns the Round of it.
    public Round getNextRound() {
        getNext();
        return this.currentNode.getRound();
    }
    //Suggests a Move to the computer based on the Player's last move
    public Move suggestMove() {
        getNextRound();
        if (this.currentNode.getRound().getP1Move().equals(Move.ROCK)) {
            return Move.PAPER;
        } else if (this.currentNode.getRound().getP1Move().equals(Move.PAPER)) {
            return Move.SCISSORS;
        } else {
            return Move.ROCK;
        }

    }
}
