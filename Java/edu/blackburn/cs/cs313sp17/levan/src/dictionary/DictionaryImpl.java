/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

import java.util.ArrayList;
import java.util.LinkedList;

public class DictionaryImpl<Key, E> implements Dictionary<Key, E> {

    private LinkedList<KVPair> list;
    private ArrayList<LinkedList> table;
    private final Integer size;
    private KVPair pair;
    private int entryCount = 0;

    public DictionaryImpl(Integer size) {
        this.size = size;
        table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<>());
        }
    }

    @Override
    public void clear() {
        this.table = new ArrayList<>(0);
    }

    @Override
    public void insert(Key k, E e) {
        pair = new KVPair(k, e);

        int hashKey = (Integer) k % size;

        //Gets the absolute power of @param k
        if (hashKey < 0) {
            hashKey = -hashKey;
        }

        int oldKey = table.get(hashKey).indexOf(pair);

        if (oldKey == -1) {
            table.get(hashKey).add(pair);
            entryCount++;
        } else {
            table.get(hashKey).set(oldKey, pair);
        }

    }

    @Override
    public E remove(Key k) {
        E tempValue = null;
        int hashKey = (Integer) k % size;

        //Gets the absolute power of @param k
        if (hashKey < 0) {
            hashKey = -hashKey;
        }
        LinkedList<KVPair> temp = table.get(hashKey);

        for (int i = 0; i < temp.size(); i++) {
            if (k.toString().equals(temp.get(i).getK().toString())) {
                tempValue = (E) temp.get(i).getValue();
                table.get(hashKey).remove(i);
                entryCount--;
            }
        }

        return tempValue;
    }

    @Override
    public E find(Key k) {
        LinkedList<KVPair> temp = table.get((Integer) k % size);

        for (int i = 0; i < temp.size(); i++) {
            if (k.toString().equals(temp.get(i).getK().toString())) {
                return (E) temp.get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return table.size();
    }

    @Override
    public void report() {
        int min = 1;
        int max = 0;
        int sum = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).size() > 0) {

                if (table.get(i).size() < min) {
                    min = table.get(i).size();
                }
                if (table.get(i).size() > max) {
                    max = table.get(i).size();
                }
                sum++;
            }
        }
        System.out.println("The Minimum chain length is: " + min);
        System.out.println("The Maximum chain length is: " + max);
        System.out.println("The Average chain length is: " + (entryCount / sum));
        System.out.println("The current load factor is: " + (entryCount / size.doubleValue()));
        System.out.println(sb);
    }

}
