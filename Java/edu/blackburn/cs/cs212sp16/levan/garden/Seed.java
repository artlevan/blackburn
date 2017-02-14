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
//This creates the seed the user will plant
public class Seed {
    private String Type;
    private int Age;
    private int Total;
    //Constructor
    public Seed(String Type, int Age){
        setType(Type);
        setAge(Age);
    }
    //Sets the type of seed
    private void setType(String Type){
        this.Type = Type;
    }
    //Sets the age of the seed
    private void setAge(int Age){
        this.Age = Age;
    }
    //Returns the Type of seed
    public String getType(){
        return this.Type;
    }
    //Returns the Age of the seed
    public int getAge(){
       return this.Age;
    }
    //Returns the amount of seeds planted
    public int Amount(){
        return this.Total;
    }
}
