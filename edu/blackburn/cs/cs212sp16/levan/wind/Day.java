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
public class Day {
    private Temperature temp;
    private Cloud clouds;

    public Day(Temperature temp, Cloud clouds) {
        this.temp = temp;
        this.clouds = clouds;
    }

    public Temperature getTemp() {
        return this.temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Cloud getClouds() {
        return this.clouds;
    }

    public void setClouds(Cloud clouds) {
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "Day{" + "temp=" + temp + ", clouds=" + clouds + '}';
    }
    
}
