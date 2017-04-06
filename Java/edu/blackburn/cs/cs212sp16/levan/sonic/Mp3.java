/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author arthur.levan
 */
public class Mp3 extends Format {

    private String file;

    public Mp3(String file) {
        super(".mp3");
        this.file = file;
    }

    //Determines if a file is an mp3
    public boolean isMp3(String file) {
        if (file.endsWith(".mp3")) {
            return true;
        } else {
            return false;
        }
    }

    //Plays an mp3 file
    public void playMp3() {
        try {
            InputStream i = new FileInputStream(this.file);
            Player p = new Player(i);
            p.play();
        } catch (FileNotFoundException | JavaLayerException ex) {
            Logger.getLogger(Testcode_jlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
