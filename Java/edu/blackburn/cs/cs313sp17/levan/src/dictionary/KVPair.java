/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.dictionary;

/**
 *
 * @author arthur.levan
 */
public class KVPair<Key, E> {

    private Key k;
    private E value;

    public KVPair(Key k, E value) {
        this.k = k;
        this.value = value;
    }

    public Key getK() {
        return this.k;
    }

    public E getValue() {
        return this.value;
    }

}
