/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arthur.levan
 */
public class Testrun {

    public static void main(String[] args) {
        DictionaryImpl dict = new DictionaryImpl(45653);
        Integer a = "alpha".hashCode();
        Scanner input = new Scanner(System.in);
        String stuff;
        System.out.println("put in a word");
        stuff = input.next();
        dict.insert(stuff.hashCode(), stuff);
        System.out.println(dict.size());
        for (int i = 0; i < (45653 / 4); i++) {
            dict.insert("alpha".hashCode(), "alpha");
        }
        System.out.println(dict.find("alpha".hashCode()));
        dict.report();
        dict.remove(stuff.hashCode());
        dict.report();

    }
}
