import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void hashsetPractise(){
        
        //Create
        HashSet<Integer> set = new HashSet<>();

        //Add
        set.add(10);
        set.add(23);
        set.add(10); //Repeated
        set.add(35);
        set.add(63);

        //Printing 
        System.out.println("HashSet :-" + set);

         System.out.println();
        
        //Contains
         System.out.println(set.contains(23));
         System.out.println(set.contains(4));

         System.out.println();
        
        //Remove
         System.out.println("HashSet Before Removal :- " + set);
         System.out.println(set.remove(63));
         System.out.println("Hashset After removal :- " + set);

         System.out.println();

        //Size 
         System.out.println("Size of HashSet :- " + set.size());
        
    }
    public static void main(String[] args) {
        hashsetPractise();
    }
}