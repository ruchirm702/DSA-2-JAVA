import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static boolean checkDistinct(int arr[]){
        int n = arr.length;
        //Creating a HashSet
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<n; i++){
            set.add(arr[i]);
        }
        return set.size() == arr.length;
    }
    
    public static void main(String[] args) {
        int arr[] = {10,7,9,3,11,2};
        int arr2[] = {10,7,9,3,10,11,2};        
        System.out.println("Result 1 :- " + checkDistinct(arr));
        System.out.println("Result 2 :- " + checkDistinct(arr2));
    }
}