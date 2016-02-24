/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import kuusisto.tinysound.Music;
import kuusisto.tinysound.Sound;
import kuusisto.tinysound.TinySound;

/**
 *
 * @author arthur.levan
 */
public class Runner_tinysound {

    public static void main(String[] args) {
        TinySound.init();
        File i;
        i = new File("arthur.levan/documents/imperial.wav");
        Music m = TinySound.loadMusic(i);
        m.play(true);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
    }
}
