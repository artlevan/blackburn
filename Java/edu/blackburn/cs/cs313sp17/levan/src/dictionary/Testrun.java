/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arthur.levan
 */
public class Testrun {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DictionaryImpl dict = new DictionaryImpl(1);
        Integer a = "alpha".hashCode();
        System.out.println("Charlie".hashCode());
//        Scanner input = new Scanner(System.in);
//        String stuff;
//        System.out.println("put in a word");
//        stuff = input.nextLine();
//        dict.insert(stuff.hashCode(), stuff);
//        System.out.println("put in a phrase");
//        stuff = input.next();
//        dict.insert(stuff.hashCode(), stuff);
//        System.out.println("Dictionary size is: " + dict.size());
//        for (int i = 0; i < (45653 / 4); i++) {
//            dict.insert("alpha".hashCode(), "alpha");
//        }
//        System.out.println(dict.find("alpha".hashCode()));
//        dict.report();
//        System.out.println("");
//        dict.remove(stuff.hashCode());
//        dict.report();
        URL path = Testrun.class.getResource("dict-small.txt");
        String hashMe = "dict-small.txt";
        File f = new File(path.getFile());
        FileReader fr = new FileReader(f);
        BufferedReader read = new BufferedReader(fr);
//        while (read.readLine() != null) {
//            hashMe = read.readLine();
//            if(hashMe != null){
//            dict.insert(hashMe.hashCode(), hashMe);
//            }
//        }
dict.insert("alpha".hashCode(), "alpha");
dict.insert("alpha".hashCode(), "bravo");
dict.insert("alpha".hashCode(), "charlie");
        dict.report();
    }
}
