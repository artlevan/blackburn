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
        KVPair kp = new KVPair("alpha".hashCode(), "alpha");
        ArrayList<Integer> al = new ArrayList<>(5);
        Integer a = "alpha".hashCode();
        Scanner input = new Scanner(System.in);
        String stuff;
        System.out.println("put in a word");
        stuff = input.next();
        dict.insert(stuff.hashCode(), stuff);
        System.out.println(dict.size());
        dict.insert("alpha".hashCode(), "alpha");
        dict.insert("alpha".hashCode(), "alpha");
        System.out.println(dict.find("alpha".hashCode()));
//        dict.remove("alpha".hashCode());
        dict.report();

    }
}
