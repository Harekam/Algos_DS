package com.harek.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created harekam by in on 03/06/2015.
 */
public class MergeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine().trim();
        int n = Integer.parseInt(input);
        int arr[] = new int[n];
        input = in.readLine().trim();
        StringTokenizer st = new StringTokenizer(input);
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        MergeSort.sort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }
}
