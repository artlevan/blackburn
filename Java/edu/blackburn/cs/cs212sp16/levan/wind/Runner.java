/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.wind;

/**
 *
 * @author arthur
 */
public class Runner {

    public static void main(String[] args) {
        Day d = new Day(new Temperature(25.0, "Celcius"), new Cloud("light"));
        System.out.println(d);
    }
}
