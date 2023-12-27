import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static boolean checkDistinct(int arr[]){
        int n = arr.length;
         // Make a frequency map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int ele = arr[i];
            if(map.containsKey(ele)){
                int oldfreq = map.get(ele);
                map.put(ele,oldfreq+1);
            }
            else{
                map.put(ele,1);
            }           
        }
        return map.size() == arr.length;
    }
    
    public static void main(String[] args) {
        int arr[] = {10,7,9,3,11,2};
        int arr2[] = {10,7,9,3,10,11,2};        
        System.out.println("Result 1 :- " + checkDistinct(arr));
        System.out.println("Result 2 :- " + checkDistinct(arr2));
    }
}