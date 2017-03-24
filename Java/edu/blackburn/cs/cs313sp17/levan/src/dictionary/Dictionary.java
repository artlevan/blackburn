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
public interface Dictionary<Key, E> {

    //Clears the list
    public void clear();

    //Adds to the list
    public void insert(Key k, E e);

    //Returns the String and removes it from the list
    public E remove(Key k);

    //Finds an item in the list and returns the String
    public E find(Key k);

    //Returns the size of the list
    public int size();

    /*Prints the number of values in the table, min, max, average chain length for the table,
    * and current load factor
     */
    public void report();
}
