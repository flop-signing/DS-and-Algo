package Algorithms.twopointerAndSlidingWindow;

public class LongestSubArrayOrSubstring {

    // Longest Subarray that sum<=k

    // arr  = [2,5, 1,7, 10];      k=14

    // The way of approaches in this problem

    // 1. Brute Force
    // 2. better Brute Force
    // 3. Optimal

    // Brute Force is Generate all the subarrays and check with the condition


    // Brute Force Approach:

/*

    maxLength=0;
    for(int i=0;i<arr.length-1;i++){
        sum=0;
        for(j=i;j<arr.length-1;){

            if(sum<=k){
                maxLength=max(maxLength,j-i+1);
            }
            else if(sum>k) {
                break;
            }

        }
    }
*/



    // Better approach (Two Pointer and Sliding window)

    // We start with the sliding window of size 1
    // Expansion of array happen will right edge of the window
    // Shrinking of array will happen from left edge of the window


    /*Code:

    l=0,r=0,sum=0,maxlength=0

            while(r<n){
                sum = sum + arr[r];
                while (sum>k){
                    sum=sum-arr[l];
                    l++;
                }


                if (sum <= k) {
                    maxLength = max(maxLength, r - l + 1); // for subarray storing the value of the l and r;
                }

                r=r+1;
            }
*/




    // Optimal Solution:
// if the needed is length of the subarray then with this approach of the question is find the subarray the go with the second approach
/*
    l=0,r=0,sum=0,maxlength=0

            while(r<n){
        sum = sum + arr[r];
        if (sum>k){
            sum=sum-arr[l];
            l++;
        }


        if (sum <= k) {
            maxLength = max(maxLength, r - l + 1); // for subarray storing the value of the l and r;
        }

        r=r+1;
    }
     */

}


