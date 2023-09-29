/* Problem Description : Given an array A of N integers, return the number of unique elements in the array.
        Problem Constraints
                1 <= N <= 105
                1 <= A[i] <= 109   */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int countDistinct(int[] A) {
        // Create a HashSet to store unique elements.
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and add each element to the set.
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        // Return the count of unique elements (size of the set).
        return set.size();
    }

    public static void main(String[] args) {
        int[] A = {3, 3, 3, 9, 0, 1, 0};
        Main solution = new Main();
        int distinctCount = solution.countDistinct(A);
        System.out.println("Number of distinct elements: " + distinctCount);
    }
}