package Algorithms.insertionsort;

// The approach is at first pass sort until the 1st index
// Then sort until the 2nd index in the second pass
// Then sort until the 3rd index in the third pass
// Then sort until the third index and so on so forth.


// The intuition is after the first pass the left side of the array is sorted
// After the second pass then also sorted  and so on


// Here the best case is array is already sorted(ascending order) and the worst case is if array is sorted in descending order

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 3, 1, 9, 0, 5, 6, 10, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }


}
