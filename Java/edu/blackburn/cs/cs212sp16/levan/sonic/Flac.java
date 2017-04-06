/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import org.kc7bfi.jflac.apps.Player;

/**
 *
 * @author arthur.levan
 */
public class Flac extends Format {

    private String file;

    public Flac(String file) {
        super(".flac");
        this.file = file;
    }

    //Determines if a file is a Flac
    public boolean isFlac(String file) {
        if (file.endsWith(".flac")) {
            return true;
        } else {
            return false;
        }
    }

    //Plays a Flac file
    public void playFlac() {
        try {
            Player p = new Player();
            p.decode(this.file);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
