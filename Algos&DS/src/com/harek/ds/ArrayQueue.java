package com.harek.ds;

import java.util.NoSuchElementException;

/**
 * Created by harekam on 03/07/2015.
 */
public class ArrayQueue {
    private String queue[];
    private int N = 0, head = 0, tail = 0;

    public ArrayQueue() {
        queue = new String[2];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(String item) {
        if (N == queue.length) resize(2 * queue.length);
        queue[tail++] = item;
        if (tail == queue.length) tail = 0;          // wrap-around
        N++;
    }

    public String dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        String item = queue[head];
        queue[head] = null;                            // to avoid loitering
        N--;
        head++;
        if (head == queue.length) head = 0;           // wrap-around
        // shrink size of array if necessary
        if (N > 0 && N == queue.length / 4) resize(queue.length / 2);
        return item;
    }

    // resize the underlying array holding the elements
    private void resize(int capacity) {

        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = queue[(head + i) % queue.length];
        }
        queue = copy;
        head = 0;
        tail = N;
    }


}
