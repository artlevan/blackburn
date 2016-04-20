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
public class CircularLinkedList {

    private ListElement firstElement;
    private ListElement currentElement;

    public CircularLinkedList() {

        this.firstElement = null;
        this.currentElement = null;
    }

    public void add(Round round) {
        if (this.firstElement == null) {
            this.firstElement = new ListElement(round);
        } else if (this.firstElement.getNextElement() == null) {
            this.currentElement = new ListElement(round);
            this.firstElement.setNextElement(currentElement);
        } else {
            while (hasNext()) {
                getNext();
            }
            this.currentElement.setNextElement(new ListElement(round));
        }
        this.currentElement = this.firstElement;
    }

    public boolean hasNext() {
        if (this.currentElement.getNextElement() != null) {
            return true;
        }
        return false;
    }

    public Round getNext() {
        if (!hasNext()) {
            this.currentElement = this.firstElement.getNextElement();
        } else {
            this.currentElement = this.currentElement.getNextElement();
        }
        return this.currentElement.getRound();
    }
}
