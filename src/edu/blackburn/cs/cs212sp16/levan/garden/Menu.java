/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.garden;

/**
 *
 * @author arthur
 */
public class Menu {
    public static void main(String[] args) {
        Seed p = new Seed("Raspberry", 1);
        System.out.println("Age = " + p.getAge());
        System.out.println("Type = " + p.getType());
    }
}
