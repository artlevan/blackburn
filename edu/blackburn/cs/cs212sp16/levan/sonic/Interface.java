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
public class Interface {

    private String directory;
    private File file;
    private String[] paths;
    private Mp3 mp3;
    private Flac flac;
    private String dir = "/";

    public Interface(String directory) {
        this.directory = directory;
        this.file = new File(directory);
        this.paths = this.file.list();
        this.dir = this.directory + dir;
    }

//    public void listFile() {
//        for (int i = 0; i < this.paths.length; i++) {     
//            if ((this.paths[i].endsWith(".mp3") == true) || (this.paths[i].endsWith(".flac") == true)) {
//                System.out.println(this.paths[i]);
//
//            }
//        }
//
//    }
//
//}
    public void listFile() {
        for (int i = 0; i < this.paths.length; i++) {
            if (this.paths[i].endsWith(".mp3") == true) {
                System.out.println("Now Playing: " + this.paths[i]);
                dir = this.directory + "/" + this.paths[i];
                mp3 = new Mp3(dir);
                mp3.playMp3();
            }
            if (this.paths[i].endsWith(".flac") == true) {
                System.out.println("Now Playing: " + this.paths[i]);
                String dir = this.directory + "/" + this.paths[i];
                flac = new Flac(dir);
                flac.playFlac();
            }
        }

    }

}
