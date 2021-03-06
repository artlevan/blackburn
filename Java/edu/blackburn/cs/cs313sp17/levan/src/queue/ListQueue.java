package Java.edu.blackburn.cs.cs313sp17.levan.src.queue;

/**
 * @author arthur.levan
 */
public class ListQueue<E> implements Queue<E> {

    private int count;
    private Node first = null;
    private Node last = null;

    //Node class that will contain data
    private class Node<E> {

        private E value;
        private Node next;

        public Node(E data) {
            value = data;
            next = null;
        }
    }

    //Constructor
    public ListQueue() {
        first = null;
        last = null;
        count = 0;
    }

    //Returns True if the list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    //Returns a String of the Queue in the Format of < a b c >
    @Override
    public String toString() {
        if (first == null && last == null) {
            String empty = "< >";
            return empty;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("< ");
            Node current = first;
            sb.append(current.value);
            current = current.next;
            while (current != null) {
                sb.append(" ");
                sb.append(current.value);
                current = current.next;
            }
            sb.append(" >");
            return sb.toString();
        }
    }

    //Adds an item to the back of the queue
    public void enqueue(E data) {
        Node backValue = last;
        last = new Node(data);
        if (isEmpty()) {
            first = last;
        } else {
            backValue.next = last;
        }
        count++;
    }

    //Returns and Removes the item at the front of the queue
    public E dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            E frontValue = (E) first.value;
            first = first.next;
            count--;
            return frontValue;
        }
    }

    //Resets the list
    public void clear() {
        first = null;
        last = null;
    }

    //Returns the item in the front of the queue without removing it
    public E front() {
        if (isEmpty()) {
            return null;
        } else {
            return (E) first.value;
        }
    }

    //Returns the current length of the Queue
    public int length() {
        return count;
    }
}
