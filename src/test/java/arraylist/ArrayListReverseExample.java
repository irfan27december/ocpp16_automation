package arraylist;

import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListReverseExample {
 
    public static void main(String[] args){
        
        //create new ArrayList object
        ArrayList<String> aListMonths = new ArrayList<String>();
        
        aListMonths.add("January");
        aListMonths.add("February");
        aListMonths.add("March");
        
        System.out.println("Before Reversing: " + aListMonths);
        
        /*
         * To reverse ArrayList, use reverse method of
         * Collections class.
         */
        Collections.reverse(aListMonths);
        
        System.out.println("After Reversing: " + aListMonths);
    }
}