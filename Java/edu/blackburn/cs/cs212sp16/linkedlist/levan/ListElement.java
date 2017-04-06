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
public class ListElement {

    private Account account;
    private ListElement nextElement;

    public ListElement(Account account) {
        this.account = account;
        nextElement = null;
    }

    public Account getAccount() {
        return account;
    }

    public ListElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(ListElement nextElement) {
        this.nextElement = nextElement;
    }

}
