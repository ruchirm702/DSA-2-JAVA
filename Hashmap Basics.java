import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void hashmapPractise(){

    // Creating a Hashmap of Countries with their Population where countries are Key and Population is Value 
        
        //Create Hashpmap
        HashMap<String,Integer> map = new HashMap<>();

        //Insert Values 
        map.put("India" , 22);
        map.put("China" , 32);
        map.put("Bhutan" , 11);
        System.out.println(map); 

        System.out.println();
        
        System.out.println("After Updation :-");
        //Update 
        map.put("India", 15);
        System.out.println(map); 

        System.out.println();
        
        System.out.println("Checking Availability :- ");
        //Check key Availability
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Russia"));
        
        System.out.println();
        System.out.println(map);
        //Get value 
        System.out.println("Get value :-");
        System.out.println(map.get("India"));
        
        

        //Remove
        System.out.println("Before removing China " + map);
        System.out.println(map.remove("China"));
        System.out.println("After removal " + map );

        System.out.println();
        //Size 
        System.out.println("Size : ");
        System.out.println(map.size());

        System.out.println();
        //Print 
        System.out.println("Final HashMap --> " + map);
    } 
    public static void main(String[] args) {
        hashmapPractise();
    }
}