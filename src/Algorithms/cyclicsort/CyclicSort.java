package Algorithms.cyclicsort;
// The main technique in here is that if there is a range in the problem and also finding something like duplicate,missing, missing positive element then we will apply cyclic sort.
// It's complexity is O(N) and do in the one single pass only.
// The steps are 1. Check 2. Swap and 3. Move


import java.util.Arrays;

public class CyclicSort {


    public static void main(String[] args) {
        int[] arr={5,2,3,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i<arr.length ){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }
}
