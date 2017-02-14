/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.linkedlist.levan;

/**
 *
 * @author dakota.tebbe
 */
public class LinkedList {

    private ListElement firstElement;
    private ListElement currentElement;

    public LinkedList() {
        this.firstElement = null;
        this.currentElement = null;
    }
    //Adds a new LinkedElement to the end of the LinkedList.
    public void add(Account acc) {
        if (this.firstElement == null) {
            this.firstElement = new ListElement(acc);
        } else if (this.firstElement.getNextElement() == null) {
            this.currentElement = new ListElement(acc);
            this.firstElement.setNextElement(currentElement);
        } else {
            while (hasNext()) {
                getNext();
            }
            this.currentElement.setNextElement(new ListElement(acc));
        }
        this.currentElement = this.firstElement;
    }
    //Determines in the currentElement has a next element.
    public boolean hasNext() {
        if (this.currentElement.getNextElement() != null) {
            return true;
        }
        return false;
    }
    //Gets the nextElement of the currentElement if there is one.
    public Account getNext() {
        if (!hasNext()) {
            this.currentElement = this.firstElement.getNextElement();
        } else {
            this.currentElement = this.currentElement.getNextElement();
        }
        return this.currentElement.getAccount();
    }

    //Determines whether or not a specific account object is in the List.
    public Boolean contains(Account acc) {
        boolean contain = false;
        if (this.firstElement.getAccount() == acc) {
            return true;
        } else if (this.firstElement.getAccount() != acc) {
            while (hasNext() == true) {
                if (getNext() == acc) {
                    contain = true;
                }
            }
        }
        this.currentElement = this.firstElement;
        return contain;

    }

    //Finds the position of an account if it is in the Linked List.
    public int find(Account account) {
        int position = 0;
        if (contains(account) == true) {
            if (this.firstElement.getAccount() == account) {
                return position;
            } else {
                while (hasNext()) {
                    if (getNext() == account) {
                        position = position++;
                        return position;
                    } else {
                        position++;
                    }
                }
            }
        }
        return position;
    }
    //Returns the account at the specified position of the list.
    public Account get(int index) {
        Account acc = null;
        for (int i = 0; i <= index; i++) {
            getNext();
            acc = this.currentElement.getAccount();
        }
        return acc;
    }
}
