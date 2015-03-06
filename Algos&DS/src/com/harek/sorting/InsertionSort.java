package com.harek.sorting;

/**
 * Created by harekam on 03/06/2015.
 */
public class InsertionSort {

    public static void sort(int arr[]) {
        InsertionSort.sort(arr, arr.length);
    }

    private static void sort(int[] arr, int length) {

        for (int i = 0; i < length; i++) {
            for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
                exchange(arr, j, j - 1);
            }
        }
    }

    private static void exchange(int[] arr, int j, int i) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;


    }
}
