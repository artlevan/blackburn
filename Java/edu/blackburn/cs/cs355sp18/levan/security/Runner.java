/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs355sp18.levan.security;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Hello
 * Hello, World!
 * alphabet
 * ALPHABET
 * @author Arthur Levan
 */
public class Runner {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner input = new Scanner(System.in);
        Interface i = new Interface();
        String s = "";

        while (!s.equalsIgnoreCase("r") && !s.equalsIgnoreCase("t")) {
            System.out.print("Enter [T] for TEA or [R] for RC4: ");
            s = input.nextLine();
        }

        i.run(s);

    }
}
