//Given an array arr[N],, check if any pair (i,j) exist such that arr[i] + arr[j]==K , and i!=j;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static boolean checkpairSum(int arr[] , int k){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j =0 ; j<i-1 ; j++){
                if(arr[i]+arr[j] == k){
                    return true ;
                }                
            }
        }
        return false ;
    }
    
    public static void main(String[] args) {
        int [] arr = {8,9,1,-2,4,5,11,-6,4};
        int k1 = 6 ;
        int k2 = 22;
        System.out.println("Result 1 : " + checkpairSum(arr,k1));
        System.out.println();
        System.out.println("Result 2 : " + checkpairSum(arr,k2));
    }
}