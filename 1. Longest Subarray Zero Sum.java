/*Problem Description
Given an array A of N integers. Find the length of the longest subarray in the array which sums to zero.
Note :
while we A[i] multiple times, it may cross the range of integer, so wisely select data type for any operations.
        Problem Constraints
                            1 <= N <= 10^5
                            -109 <= A[i] <= 10^9              */
  
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // Function to find the length of the longest subarray with a sum of zero
    public int findLongestSubarrayLength(int[] A) {
        int n = A.length;
        HashMap<Long, Integer> sumMap = new HashMap<>();
        long[] cumSum = new long[n + 1];
        int maxLen = 0;

        // Create the cumulative sum array
        for (int i = 0; i < n; i++) {
            cumSum[i + 1] = cumSum[i] + A[i];
        }

        for (int i = 0; i <= n; i++) {
            if (sumMap.containsKey(cumSum[i])) {
                maxLen = Math.max(maxLen, i - sumMap.get(cumSum[i]));
            } else {
                sumMap.put(cumSum[i], i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Main solution = new Main();

        // Example input 1
        int[] A1 = {1, -2, 1, 2};
        int result1 = solution.findLongestSubarrayLength(A1);
        System.out.println("Output 1: " + result1);  // Output should be 3

        // Example input 2
        int[] A2 = {3, 2, -1};
        int result2 = solution.findLongestSubarrayLength(A2);
        System.out.println("Output 2: " + result2);  // Output should be 0
    }
}