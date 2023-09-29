/* Problem Description :- Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
        Problem Constraints
                    1 <= |A| <= 105
                    1 <= |B| <= 105
                    1 <= A[i] <= 105
                    1 <= B[i] <= 105  */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public int[] solve(int[] A, int[] B) {
        
        // STEP 1: Make Frequency MAP - Key: Array element (INT), Value: Frequency (Int)
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (map.containsKey(element)) {
                // If the element is available in the map, increment its old frequency
                int oldFrequency = map.get(element);
                map.put(element, oldFrequency + 1);
            } else {
                // If the element is not available in the map, add the element with frequency = 1
                map.put(element, 1);
            }
        }

        // STEP 2: Fill the answer array from Query B using the frequency map
        
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int element = B[i];
            // Check the frequency of the element in A
            if (map.containsKey(element)) {
                ans[i] = map.get(element);
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 9, 2, 8};
        int[] B = {3, 2};

        Main solution = new Main();
        int[] result = solution.solve(A, B);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
