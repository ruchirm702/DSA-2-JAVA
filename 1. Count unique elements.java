/* Problem Description
    You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
    Problem Constraints
        1 <= N <= 10^5
        1 <= A[i] <= 10^9   */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // Function to count elements in the array with a frequency of 1
    public static int countElementsWithFrequencyOne(int[] A) {
        // Create a HashMap to store element frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (map.containsKey(element)) {
                int freq = map.get(element);
                map.put(element, freq + 1);
            } else {
                map.put(element, 1);
            }
        }

        int count = 0;

        // Count elements with a frequency of 1 using a basic for-loop
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (map.get(element) == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Input array
        int[] A = {3, 3, 3, 9, 0, 1, 0};

        // Call the function to count elements with a frequency of 1
        int result = countElementsWithFrequencyOne(A);

        // Print the result
        System.out.println("Number of elements with a frequency of [1] : " + result);
    }
}