package Algorithms.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 3, 1, 9, 0, 5, 6, 10, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum item in the remaining array and swapped with correct index
            int last = arr.length - i - 1;
            int maxIndex = maximum(arr, 0, last);
            swap(arr,maxIndex,last);

        }
    }

    private static int maximum(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }

        }
        return max;
    }

    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
