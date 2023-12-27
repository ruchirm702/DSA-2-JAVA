/* Longest subarray with sum=0
Given arr[N] and k , return length of longest subarray with sum=0  */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static int longestSubarrayWithSumZero(int[] arr) {
        
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {6,1,3,-4,-2,8,-6,-3,6,-2};
        int[] arr2 = {4,-3,-1,2,-2};
        System.out.println("Length of the longest subarray with sum=0 for arr1: " + longestSubarrayWithSumZero(arr1));
        System.out.println("Length of the longest subarray with sum=0 for arr2: " + longestSubarrayWithSumZero(arr2));
    }
}