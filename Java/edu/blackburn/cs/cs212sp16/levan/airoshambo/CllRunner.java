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
public class CllRunner {

    public static void main(String[] args) {
        ComputerPlayer a = new ComputerPlayer("");
        ComputerPlayer b = new ComputerPlayer("");
        CircularLinkedList cl = new CircularLinkedList();
        for (int i = 0; i < 30; i++) {
            cl.add(new Round(a.getMove(), b.getMove()));
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(cl.getNextRound().getWinner());
            System.out.println(cl.suggestMove());
        }

    }
}
