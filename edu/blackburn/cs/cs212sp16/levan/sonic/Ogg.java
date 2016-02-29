/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.File;
import kuusisto.tinysound.Music;
import kuusisto.tinysound.TinySound;

/**
 *
 * @author Artmar
 */
public class Ogg extends Format {

    private String file;

    public Ogg(String file) {
        super(".ogg");
        this.file = file;
    }

    //Determines if a file is an Ogg
    public boolean isOgg(String file) {
        if (file.endsWith(".ogg")) {
            return true;
        } else {
            return false;
        }
    }
    //Plays an Ogg Vorbis file
    public void playOgg() {
        TinySound.init();
        File i;
        i = new File(this.file);
        Music m = TinySound.loadMusic(i);
        m.play(false);
        while (m.playing() == true) {
            m.done();
        }
    }

}
