import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    
    public static int[] findFreq(int[] arr, int[] query) {
        // step 1 : make a frequcency map 
        /*
        Key : Array Element (Integer)
        Value : frequcency (Integer)
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i <  arr.length; i++) {
            int ele = arr[i];
            
            if(map.containsKey(ele)) {
                // element is available in map, increment in old freq 
                int oldFreq = map.get(ele);
                map.put(ele, oldFreq + 1);
            } else {
                // element is not available in map, add element with 1 freq
                map.put(ele, 1);
            }
        }
        
        // step 2 : fill answer array from query using frequcency map    
        int[] ans = new int[query.length];
        for(int i = 0; i < query.length; i++) {
            int ele = query[i];
            // check frequcency of ele in arr 
            if(map.containsKey(ele)) {
                ans[i] = map.get(ele);
            } else {
                ans[i] = 0;
            }
        }

        return ans;
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