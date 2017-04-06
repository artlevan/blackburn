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
    private int totalCount = 0;

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
        int oldKey;
        pair = new KVPair(k, e);
        int hashKey = (Integer) k % size;

        if (hashKey < 0) {
            hashKey = -hashKey;
        }

        if ((oldKey = table.get(hashKey).indexOf(pair)) == -1) {
            table.get(hashKey).add(pair);
            totalCount++;
        } else {
            table.get(hashKey).set(oldKey, pair);
        }

    }

    @Override
    public E remove(Key k) {
        E tempValue = null;
        int hashKey = (Integer) k % size;

        if (hashKey < 0) {
            hashKey = -hashKey;
        }
        LinkedList<KVPair> temp = table.get(hashKey);

        for (int i = 0; i < temp.size(); i++) {
            if (k.toString().equals(temp.get(i).getK().toString())) {
                tempValue = (E) temp.get(i).getValue();
                table.get(hashKey).remove(i);
                totalCount--;
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
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).size() > 0) {
                sb.append("Index ");
                sb.append(i);
                sb.append(" has ");
                sb.append(table.get(i).size());
                sb.append(" items.\n");
            }
        }
        sb.append("There are ");
        sb.append(totalCount);
        sb.append(" items in the hash table altogether.");
        System.out.println("The current load factor is: " + (totalCount / size.doubleValue()));
        System.out.println(sb);
    }

}
