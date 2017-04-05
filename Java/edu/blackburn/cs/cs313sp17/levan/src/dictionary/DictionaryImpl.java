/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

import java.util.ArrayList;
import java.util.LinkedList;

public class DictionaryImpl<Key, E> implements Dictionary<Key, E> {

    private final LinkedList<KVPair> list = new LinkedList<>();
    private ArrayList<KVPair> table;
    private Integer size;
    private KVPair pair;

    public DictionaryImpl(Integer size) {
        this.size = size;
        table = new ArrayList<>(size);
    }

    @Override
    public void clear() {
        this.table = new ArrayList<>(0);
    }

    @Override
    public void insert(Key k, E e) {
        pair = new KVPair(k, e);
        System.out.println(table.add(pair));
    }

    @Override
    public E remove(Key k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E find(Key k) {
        for (int i = 0; i < table.size(); i++) {
            KVPair s = table.get(i);
            if (table.contains(s)) {
                return (E) s.getValue();
            }
        }
//
//        for (KVPair kp : this.table) {
//            if(kp.getK() == k){
//                return (E) kp.getValue();
//            }
//        }
        return null;
    }

    @Override
    public int size() {
        return table.size();
    }

    @Override
    public void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
