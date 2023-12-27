import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static boolean SubarraywithsumZero(int[] arr) {
        int n = arr.length;
        for (int s = 0; s < n; s++) {
            int sum = 0;
            for (int e = s; e < n; e++) {
                sum += arr[e];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int[] arr1 = {4, 2,4,-3, 1, 6};
        System.out.println("Result " + SubarraywithsumZero(arr));
        System.out.println("Result " + SubarraywithsumZero(arr1));
    }
}