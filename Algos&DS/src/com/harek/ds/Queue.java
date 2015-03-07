package com.harek.ds;

/**
 * Created by harekam on 03/07/2015.
 */
public class Queue {
    private Node first, last;

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else
            oldLast.next = last;
    }

    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        return item;
    }

    private class Node {
        String item;
        Node next;
    }
}
