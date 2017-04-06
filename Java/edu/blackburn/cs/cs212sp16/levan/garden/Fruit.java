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
//This creates Fruit objects for when the plant matures
public class Fruit {

    private String Type;
    private int Produce;

    //Constructor
    public Fruit(String Type) {
        this.Type = Type;
    }

    //Picks fruit
    public String pickFruit() {
        Produce++;
        return Type;
    }

    //Returns Total
    public int Amount() {
        return Produce;
    }

}
