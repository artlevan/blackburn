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
//Displays the current basket
public class Basket {
    private Fruit plantOne;
    private Fruit plantTwo;
    private Fruit plantThree;
    
    //Constructor
    public Basket(Fruit plantOne, Fruit plantTwo, Fruit plantThree){
        this.plantOne = plantOne;
        this.plantTwo = plantTwo;
        this.plantThree = plantThree;
    }
    //Shows the basket
    public void seeBasket(){
        plantOne.Amount();
        plantTwo.Amount();
        plantThree.Amount();
    }
}
