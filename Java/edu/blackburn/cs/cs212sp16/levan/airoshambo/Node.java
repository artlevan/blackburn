/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;



/**
 *
 * @author arthur.levan
 */
public class Node {
    private Round round;
    private Node nextNode;
    
    public Node(Round round){
        this.round = round;
        nextNode = null;
    }
    //Returns the current round of this Node
    public Round getRound() {
        return this.round;
    }
    //Returns the next linked Node if not null
    public Node getNextNode() {
        return nextNode;
    }
    //Sets the next linked Node
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    
    
}
