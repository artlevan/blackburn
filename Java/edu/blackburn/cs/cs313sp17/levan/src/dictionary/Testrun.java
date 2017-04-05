/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

import java.util.ArrayList;

/**
 *
 * @author arthur.levan
 */
public class Testrun {

    public static void main(String[] args) {
        DictionaryImpl Dict = new DictionaryImpl(45653);
        KVPair kp = new KVPair("alpha".hashCode(), "alpha");
        ArrayList<Integer> al = new ArrayList<>(5);
        System.out.println(Dict.size());
        Dict.insert("alpha".hashCode(), "alpha");
        System.out.println(Dict.size());
        System.out.println(Dict.find(kp.getK()));
        Dict.clear();
        System.out.println(Dict.size());
        
    }
}
