package com.harek.ds;

/**
 * Created harekam by in on 03/06/2015.
 */
//Stack using linkedlist
public class Stack {

    private Node first = null;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    private class Node {
        String item;
        Node next;
    }

}
