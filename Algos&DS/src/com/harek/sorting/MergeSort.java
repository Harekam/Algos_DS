package com.harek.sorting;

/**
 * Created harekam by in on 03/06/2015.
 */
public class MergeSort {
    public static void sort(int array[]) {
        MergeSort.sort(array, array.length - 1);
    }

    private static void merge(int[] array, int[] leftArray, int leftCount, int[] rightArray, int rightCount) {
        int i, j, k;

        // i - to mark the index of left arr
        // j - to mark the index of right arr
        // k - to mark the index of merged arr
        i = 0;
        j = 0;
        k = 0;

        while (i < leftCount && j < rightCount) {
            if (leftArray[i] < rightArray[j]) array[k++] = leftArray[i++];
            else array[k++] = rightArray[j++];
        }
        while (i < leftCount) array[k++] = leftArray[i++];
        while (j < rightCount) array[k++] = rightArray[j++];
    }


    private static void sort(int[] array, int length) {
        int mid, i, leftArray[], rightArray[];
        if (length < 7) {
            InsertionSort.sort(array);//for values less than 7 insertion sort can be faster this might increase the speed of merge sort by 20%
            return;
        }

        mid = length / 2;  // find the mid index.

        // create left and right sub arrays
        // mid elements (from index 0 till mid-1) should be part of left sub-array
        // and (length-mid) elements (from mid to length-1) will be part of right sub-array
        leftArray = new int[mid];
        rightArray = new int[length - mid];

        for (i = 0; i < mid; i++) leftArray[i] = array[i];
        for (i = mid; i < length; i++) rightArray[i - mid] = array[i];

        sort(leftArray, mid);
        sort(rightArray, length - mid);
        merge(array, leftArray, mid, rightArray, length - mid);  // Merging leftArray and rightArray into array as sorted list.

    }

}
