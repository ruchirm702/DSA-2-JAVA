import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static boolean SubarraywithsumZero(int [] arr){
        int [] psum = prefixSum(arr);
        for(int s=0; s<arr.length ; s++){
            for(int e=s ; e<arr.length ; e++){
                int sum = 0;
                if(s==0){
                    sum = psum[e];
                }
                else{
                    sum = psum[e]- psum[s-1];
                }
                if(sum == 0){
                    return true;
                }              
            }
        }
        return false ;
    }
        
    public static int[] prefixSum(int [] arr){
        int [] psum = new int[arr.length];
        psum[0] = arr[0];
        for(int i=1; i < arr.length ; i++){
            psum[i] = psum[i-1]+ arr[i];
        }
        return psum;        
    }  
    
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int[] arr1 = {4, 2, 6,-3, 1, 6};
        System.out.println("Result " + SubarraywithsumZero(arr));
        System.out.println("Result " + SubarraywithsumZero(arr1));
    }
}