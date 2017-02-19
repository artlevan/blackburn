/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.queue;

/**
 *
 * @author arthur.levan
 */
public interface Queue<E> {

    /*
    Adds an item to the back of the queue
     */
    public void enqueue(E Item);

    /*
    Removes an item from the front of the queue
     */
    public E dequeue();

    /*
    Clears the queue of all items
     */
    public void clear();

    /*
    Returns the item at the front of the queue without removing it
     */
    public E front();

    /*
    Returns the current size of the Queue
     */
    public int length();

}
