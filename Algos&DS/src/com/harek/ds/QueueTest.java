package com.harek.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by harekam on 03/07/2015.
 */
public class QueueTest {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine().trim();
        int testCases = Integer.parseInt(input);

        ArrayQueue queue = new ArrayQueue();
        while (testCases-- > 0) {
            input = in.readLine().trim();
            queue.enqueue(input);
        }
        while (!queue.isEmpty())
            System.out.println("Value in queue: " + queue.dequeue());


    }

}
