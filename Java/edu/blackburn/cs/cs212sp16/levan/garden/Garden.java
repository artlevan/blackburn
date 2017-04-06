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
public class Garden {

    private Seed plantOne;
    private Seed plantTwo;
    private Seed plantThree;

    public Garden(Seed plantOne, Seed plantTwo, Seed plantThree) {
        this.plantOne = plantOne;
        this.plantTwo = plantTwo;
        this.plantThree = plantThree;
    }

    public void seeGarden() {
        System.out.println("Your garden has: ");
        this.plantOne.getAge();

    }
}
