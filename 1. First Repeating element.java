/* Problem Description : Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
If there is no repeating element, return -1.
        Problem Constraints
                    1 <= N <= 10^5
                    1 <= A[i] <= 10^9 */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public int findFirstRepeating(int[] A) {
        HashSet<Integer> seen = new HashSet<>();
        int firstRepeating = -1; // Initialize with -1
        
        for (int i = A.length - 1; i >= 0; i--) {
            int element = A[i];
            
            // Check if we have seen this element before
            if (seen.contains(element)) {
                firstRepeating = element; // Update the firstRepeating element
            }
            
            // Add the current element to the HashSet
            seen.add(element);
        }
        
        return firstRepeating; // Returns -1 if no repeating element found
    }

    public static void main(String[] args) {
        Main solution = new Main();

        int[] input1 = {10, 5, 3, 4, 3, 5, 6};
        int result1 = solution.findFirstRepeating(input1);
        System.out.println("Input 1 Result: " + result1); // Should print 3

        int[] input2 = {6, 10, 5, 4, 9, 120};
        int result2 = solution.findFirstRepeating(input2);
        System.out.println("Input 2 Result: " + result2); // Should print -1
    }
}