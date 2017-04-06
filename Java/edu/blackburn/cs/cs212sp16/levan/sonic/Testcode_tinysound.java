/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.*;
import kuusisto.tinysound.Music;
import kuusisto.tinysound.TinySound;

/**
 *
 * @author arthur.levan
 */
public class Testcode_tinysound {

    public static void main(String[] args) {
        TinySound.init();
        File i;
        i = new File("arthur.levan/documents/Whisper.ogg");
        Music m = TinySound.loadMusic(i);
        m.play(false);
        while (m.playing() == true) {
            m.done();
        }

    }
}
