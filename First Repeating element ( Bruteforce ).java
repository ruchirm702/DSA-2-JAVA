
/* Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is the smallest. 
If there is no repeating element, return -1. */

import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    
    public static int firstrepeatElem(int[] A) {
        for(int i=0; i < A.length ; i++){
            for(int j= i+1 ; j < A.length ; j++){
                if(A[i] == A[j]){
                    return A[i];
                }
            }
        }
        return -1 ; 
    }

    public static void main(String[] args) {       
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("First Repeating Element: " +  firstrepeatElem(arr));
    }
}