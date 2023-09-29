/* Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements 
in both the array.
NOTE:Each element in the result should appear as many times as it appears in both arrays.
    The result can be in any order.
                Problem Constraints
                1 <= N, M <= 10^5
                1 <= A[i] <= 10^9   */



import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    // Function to find common elements in two arrays while maintaining frequencies
    public int[] findCommonElements(int[] A, int[] B) {
        // Create a HashMap to store elements from array A and their frequencies
        HashMap<Integer, Integer> mapA = new HashMap<>();

        // Add elements from array A to the HashMap and count their frequencies
        for (int num : A) {
            mapA.put(num, mapA.getOrDefault(num, 0) + 1);
        }

        // Initialize a list to store common elements
        List<Integer> commonElementsList = new ArrayList<>();

        // Iterate over array B and check if each element exists in the HashMap
        for (int num : B) {
            if (mapA.containsKey(num)) {
                // Add the element to the common elements list
                commonElementsList.add(num);

                // Decrement the frequency in the HashMap to account for duplicates
                int freq = mapA.get(num);
                if (freq > 1) {
                    mapA.put(num, freq - 1);
                } else {
                    mapA.remove(num);
                }
            }
        }

        // Convert the common elements list to an integer array
        int[] result = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            result[i] = commonElementsList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Input arrays
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        // Create an instance of the Main class
        Main main = new Main();

        // Call the findCommonElements function to find common elements
        int[] commonElements = main.findCommonElements(A, B);

        // Print the common elements
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }
}