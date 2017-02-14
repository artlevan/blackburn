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
public class Measurement {

    private double amount;
    private String unit;

    public Measurement(double amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return this.amount;
    }

    protected void setAmount(double amount) {
        this.amount = this.amount;
    }

    public String getUnit() {
        return this.unit;
    }

    protected void setUnit(String unit) {
        this.unit = unit;
    }

    public Measurement add(Measurement temp) {
        return new Measurement(this.amount + temp.getAmount(), unit);
    }

    public Measurement sub(Measurement temp) {
        return new Measurement(this.amount - temp.getAmount(), unit);
    }

    @Override
    public String toString() {
        return this.amount + " degrees " + this.unit;
    }

}
