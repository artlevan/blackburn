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
public class Cloud {

    private String level;
    private String none = "none";
    private String light = "light";
    private String medium = "medium";
    private String heavy = "heavy";
    private Measurement temp;

    public Cloud(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void levelTemp(String level) {
        if (this.level.compareTo(none) == none.compareTo(this.level)) {
            temp.add(new Measurement(6.0, "Celcius"));
        }
        if (this.level.compareTo(light) == light.compareTo(this.level)) {
            Measurement l = new Measurement(3.0, "Celcius");
        }
        if (this.level.compareTo(medium) == medium.compareTo(this.level)) {
            Measurement m = new Measurement(3.0, "Celcius");
        }
        if (this.level.compareTo(heavy) == heavy.compareTo(this.level)) {
            Measurement h = new Measurement(14.0, "Celcius");
        }

    }

    @Override
    public String toString() {
        return "Cloud level: " + level;
    }

}
