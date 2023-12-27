
/* Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is the smallest. 
If there is no repeating element, return -1. */

import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    
    public static int firstrepeatElem(int[] A) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        // Iterate from right to left
        for (int i = A.length - 1; i >= 0; i--) {
            int ele = A[i];

            // Check if the element is already in the map
            if (map.containsKey(ele)) {
                ans = ele;
            }

            // Update the map with the current element's index
            map.put(ele, i);
        }
        return ans;
    }

    public static void main(String[] args) {       
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("First Repeating Element: " +  firstrepeatElem(arr));
    }
}