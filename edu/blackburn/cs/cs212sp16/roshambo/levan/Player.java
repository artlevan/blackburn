/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.levan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Artmar
 */
public abstract class Player {

    private String name;
    private int life;

    public Player(String name) {
        this.name = name;
        this.life = 100;
    }
    
    public String getName(){
        return this.name;
    }
    public void loseLife(){
        this.life = this.life - 10;
    }
    
    public int getLife(){
        return this.life;
    }

}
