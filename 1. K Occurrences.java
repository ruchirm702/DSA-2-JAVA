/* Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].He wants to
select some trees to replace his broken branches.But he wants uniformity in his selection of trees.So he picks 
only those trees whose heights have frequency B.He then sums up the heights that occur B times. 
(He adds the height only once to the sum and not B times).But the sum he ended up getting was huge so he
prints it modulo 10^9+7. In case no such cluster exists, Groot becomes sad and prints -1.
Constraints:
1.   1<=N<=100000
2.   1<=B<=N
3.   0<=H[i]<=10^9
Input: Integers N and B and an array C of size N
Output: Sum of all numbers in the array that occur exactly B times. */ 


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
// The main method must be in a class named "Main".
class Main {
    public static int calculateSum(int N, int B, int[] C) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of elements in the array
        for (int i = 0; i < N; i++) {
            int num = C[i];
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        int sum = 0;
        boolean clusterExists = false;

        // Iterate through the frequencyMap and calculate the sum of elements that occur exactly B times
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == B) {
                sum += key;
                clusterExists = true;
            }
        }

        // If no such cluster exists, return -1
        if (!clusterExists) {
            return -1;
        }

        // Take modulo 10^9+7 for the final sum
        return sum % 1000000007;
    }

    public static void main(String[] args) {
        // Example input
        int N = 5;
        int B = 2;
        int[] C = {1, 2, 2, 3, 3};

        int result = calculateSum(N, B, C);
        System.out.println(result);
    }
}