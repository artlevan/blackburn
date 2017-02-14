/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.levan.sonic;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author arthur.levan
 */
public class Runner {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Player p;

    
        System.out.print ("Please input a Directory to read: ");
        String toRead  = input.nextLine();
        p = new Player(toRead);
        p.listFile();
        p.playFile();
    }
}
