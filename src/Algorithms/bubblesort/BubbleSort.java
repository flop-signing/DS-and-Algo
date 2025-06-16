package Algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr={3,5,2,1,3,1,9,0,5,6,10,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] array) {
        // run the steps n-1 times

        for (int i = 0; i < array.length - 1; i++) {
            boolean isSwapped = false;
            // for each single step the max element will come to the last position or respective index in the array.
            for (int j = 0; j < array.length - i - 1; j++) {
                // swap if the item is smaller than previous item
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }

            }


            // If you didn't swap for a particular value of i that means the array is sorted.
            if(!isSwapped) {
                break;
            }
        }
    }
}
