package com.harek.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created harekam by in on 03/06/2015.
 */
public class StackTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine().trim();
        int testCases = Integer.parseInt(input);

        Stack stack = new Stack();
        while (testCases-- > 0) {
            input = in.readLine().trim();
            stack.push(input);
        }
        while (!stack.isEmpty()) {
            System.out.println("Value in stack: " + stack.pop());
        }


    }
}
