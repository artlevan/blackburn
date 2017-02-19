package Java.edu.blackburn.cs.cs313sp17.levan.src.queue;

/**
 *
 * @author arthur.levan
 */


public class ListQueue<E> implements Queue<E> {

    private int count;
    private Node first = null;
    private Node last = null;

    private class Node<E> {

        private E value;
        private Node next;

        public Node(E data) {
            value = data;
            next = null;
        }

    }

    public ListQueue() {
        first = null;
        last = null;
        count = 0;

    }

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public String toString() {
   if (first == null && last == null){
        String empty = " ";
        return empty;
    }else{
       StringBuilder sb = new StringBuilder();
       sb.append("< ");

       Node curr = first;
       sb.append(curr.value);
       curr = curr.next;
       while(curr != null) {
           sb.append(" ");
           sb.append(curr.value);
           curr = curr.next;
       }
       sb.append(" >");
       return sb.toString();
    }
    }

    public void enqueue(E data) {
        Node lastValue = last;
        last = new Node(data);
        if (isEmpty()) {
            first = last;
            
        } else {
            lastValue.next = last;
            
        } count++;
    }

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

    public void clear() {
        first = null;
        last = null;
    }

    public E front() {
        if (isEmpty()) {
            return null;
        } else {
            return (E) first.value;
        }
    }


    public int length() {
        return count;

    }
//    public static void main(String[] args) {
//        ListQueue<Integer> queue = new ListQueue<Integer>();
//        queue.enqueue(10);
//        queue.enqueue(25);
//        queue.enqueue(4636);
//                System.out.println(queue.toString());
//        System.out.println(queue.length());
//        while (queue.length() != 0){
//        System.out.println(queue.dequeue());
//        }
//
//    }
}


