import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static int[] findFreq(int [] arr , int [] query ){
        int n = arr.length;
        int q = query.length;

        int res [] = new int[q];
        for(int i=0 ; i < q ; i++){
            int freq = 0 ;
            for(int j=0 ; j<n ; j++){
                if(arr[j] == query[i]){
                    freq += 1 ;                    
                }               
            }
            res[i] = freq;
        }
        return res;
    }
    
    public static void main(String args[]) {
		int[] arr = {10, 11, 19, 30, 19, 11, 20, 21, 11, 7, 30, 21};
        int[] query = {10, 31, 21, 30};
        
        int[] ans = findFreq(arr, query);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(query));
        System.out.println(Arrays.toString(ans));
        
	}
}