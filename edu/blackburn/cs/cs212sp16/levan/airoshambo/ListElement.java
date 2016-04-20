/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.airoshambo;



/**
 *
 * @author dakota.tebbe
 */
public class ListElement {
    private Round round;
    private ListElement nextElement;
    
    public ListElement(Round round){
        this.round = round;
        nextElement = null;
    }
    
    public Round getRound() {
        return this.round;
    }
    
    public ListElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(ListElement nextElement) {
        this.nextElement = nextElement;
    }
    
    
    
}
