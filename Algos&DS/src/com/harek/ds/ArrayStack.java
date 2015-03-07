package com.harek.ds;

import java.util.NoSuchElementException;

/**
 * Created by harekam on 03/07/2015.
 */
public class ArrayStack {
    private String[] stack;
    private int N;

    public ArrayStack() {
        stack = new String[2];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        if (N == stack.length) resize(2 * stack.length);    // double size of array if necessary
        stack[N++] = item;                            // add item
    }


    public String pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        String item = stack[N - 1];
        stack[N - 1] = null;                              // to avoid loitering
        N--;
        // shrink size of array if necessary
        if (N > 0 && N == stack.length / 4) resize(stack.length / 2);
        return item;
    }

    // resize the underlying array holding the elements
    private void resize(int capacity) {

        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = stack[i];
        }
        stack = copy;
    }

}
