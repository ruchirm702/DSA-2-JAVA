import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static int longestSubarrayWithSumZero(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        long psum= 0;

        // Create a HashMap to store the prefix sum and its index
        HashMap<Long, Integer> sumMap = new HashMap<>();

        //For Edge Case ==> initialize map with psum = 0 at index -1 
        sumMap.put(0L,-1); //0L represents Zero as Long integer

        //Creating Prefix sum and calc longest Subarray length
        for (int i = 0; i < n; i++) {
            psum += arr[i];
            if(sumMap.containsKey(psum)){
                int Length = i - sumMap.get(psum);
                maxLength = Math.max(maxLength,Length);
            }
            else{
                sumMap.put(psum,i);
            }
        }
         return maxLength;   
    }

    
    public static void main(String[] args) {
        int[] arr1 = {6,1,3,-4,-2,8,-6,-3,6,-2};
        int[] arr2 = {4,-3,-1,2,-2};
        System.out.println("Length of the longest subarray with sum=0 for arr1: " + longestSubarrayWithSumZero(arr1));
        System.out.println("Length of the longest subarray with sum=0 for arr2: " + longestSubarrayWithSumZero(arr2));
    }
}