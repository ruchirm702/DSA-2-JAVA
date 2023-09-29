/* Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a 
sum equal to 0.If the given array contains a sub-array with sum zero return 1, else return 0.
        Problem Constraints
                    1 <= |A| <= 100000
                    -10^9 <= A[i] <= 10^9 */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    /*
   * Function to check if there exists a subarray in the given array A
   * such that the sum of elements in the subarray is equal to zero.
   *
   * @param A: The input integer array.
   * @return: 1 if such a subarray exists, 0 otherwise.
   */
  public int hasZeroSumSubarray(int[] A) {
    HashSet<Long> set = new HashSet<>();
    long psum = 0;
    for (int i = 0; i < A.length; i++) {
      psum += A[i];
      if (psum == 0) {
        return 1;
      }
      if (set.contains(psum)) {
        return 1;
      }
      set.add(psum);
    }
    return 0;
  }

  public static void main(String[] args) {
    // Example Input 1
    int[] input1 = {1, 2, 3, 4, 5};
    Main solution1 = new Main();
    int result1 = solution1.hasZeroSumSubarray(input1);
    System.out.println("Result 1: " + result1); // Output should be 0

    // Example Input 2
    int[] input2 = {4, -1, 1};
    Main solution2 = new Main();
    int result2 = solution2.hasZeroSumSubarray(input2);
    System.out.println("Result 2: " + result2); // Output should be 1
  }
}