package Algorithms.binarysearch;

public class BinarySearch {




    public static void main(String[] args) {
        int[] arr={1,4,5,6,8,12,14,18,23,25};
        int target=18;
        int ans=binarySearch(arr,target);
        System.out.printf("The target element is: %d",ans);

    }

    // return index if it exists

    // return -1 if nothing is found in the array
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
           // int mid = (low + high) / 2;  // in this way it might be possible that the resulting value should exceeds the highest value of the integer

            int mid=low + (high - low) / 2; // it fix the problem.

            if (arr[mid] == key) {
                return mid;

            }
            if (arr[mid] < key) {
                low = mid + 1;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }

    // There is an topic that is Order Agnostic Binary Search and that is the order is not give either it is in ascending or descending
    // But the array is sorted

    //  We find it if we compare the first and the last value of an array
}
