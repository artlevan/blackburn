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
public class Runner {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Account a = Account.getRandom();
        String contains = "";
        for (int i = 0; i < 5; i++) {
            l.add(Account.getRandom());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(l.getNext());
        }
        for (int i = 0; i < 5; i++) {
            if (l.contains(a)) {
                contains = "List contains: " + a;
            } else {
                contains = "List does not contain: " + a;
            }

        }

        System.out.println(contains);
        System.out.println(l.find(a));
        System.out.println("Account at index: " + 3 + " " + l.get(3));
    }
}
