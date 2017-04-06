/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.util.*;
import java.io.*;

/**
 *
 * @author arthur.levan
 */
public class Player {

    private String directory;
    private File file;
    private String[] paths;
    private Mp3 mp3;
    private Flac flac;
    private Wav wav;
    private Ogg ogg;
    private String dir = "/";

    public Player(String directory) {
        this.directory = directory;
        this.file = new File(directory);
        this.paths = this.file.list();
        this.dir = this.directory + dir;
    }

    //Prints all supported Audio files in a directory to screen
    public void listFile() {
        System.out.println();
        for (int i = 0; i < this.paths.length; i++) {
            if (((this.paths[i].endsWith(".mp3") == true) || (this.paths[i].endsWith(".flac") == true))
                    || ((this.paths[i].endsWith(".wav") == true) || (this.paths[i].endsWith(".ogg") == true))) {
                System.out.println(this.paths[i]);
            }
        }
        System.out.println();
    }

    //Sets and plays an Mp3
    public void setAndPlayMp3(int cell) {
        System.out.println("Now Playing: " + this.paths[cell]);
        dir = this.directory + "/" + this.paths[cell];
        mp3 = new Mp3(dir);
        mp3.playMp3();
    }

    //Sets and plays a Flac
    public void setAndPlayFlac(int cell) {
        System.out.println("Now Playing: " + this.paths[cell]);
        String dir = this.directory + "/" + this.paths[cell];
        flac = new Flac(dir);
        flac.playFlac();
    }

    //Sets and plays a Wav
    public void setAndPlayWav(int cell) {
        System.out.println("Now Playing: " + this.paths[cell]);
        String dir = this.directory + "/" + this.paths[cell];
        wav = new Wav(dir);
        wav.playWav();
    }

    //Sets and plays an Ogg
    public void setAndPlayOgg(int cell) {
        System.out.println("Now Playing: " + this.paths[cell]);
        String dir = this.directory + "/" + this.paths[cell];
        ogg = new Ogg(dir);
        ogg.playOgg();
    }

    //Plays all supported audio files in a directory
    public void playFile() {
        for (int i = 0; i < this.paths.length; i++) {
            if (this.paths[i].endsWith(".mp3") == true) {
                setAndPlayMp3(i);
            }
            if (this.paths[i].endsWith(".flac") == true) {
                setAndPlayFlac(i);
            }
            if (this.paths[i].endsWith(".wav") == true) {
                setAndPlayWav(i);
            }
            if (this.paths[i].endsWith(".ogg") == true) {
                setAndPlayOgg(i);
            }
        }

    }

}
