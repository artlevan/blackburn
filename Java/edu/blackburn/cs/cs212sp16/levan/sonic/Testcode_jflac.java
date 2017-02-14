/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import org.kc7bfi.jflac.apps.Player;

/**
 *
 * @author arthur.levan
 */
public class Testcode_jflac {

    public static void main(String[] args) {
        try {
            String file = "arthur.levan/documents/tank.flac";
            Player p = new Player();
            p.decode(file);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Testcode_jflac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
