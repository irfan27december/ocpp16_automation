package arraylist;

import java.util.ArrayList;
import java.util.Collections;
 
public class FindMinMaxValueArrayListExample {
 
    public static void main(String[] args) {
        
        /*
         * ArrayList containing student marks
         */
        ArrayList<Integer> aListMarks = new ArrayList<Integer>();
        
        //add elements to ArrayList
        aListMarks.add(53);
        aListMarks.add(67);
        aListMarks.add(89);
        aListMarks.add(43);
        aListMarks.add(87);
        aListMarks.add(71);
        aListMarks.add(63);
        aListMarks.add(45);
        aListMarks.add(69);
        aListMarks.add(53);
        
        /*
         * To find minimum value in ArrayList, use
         * min method of Collections class.
         */
        
        System.out.println( "ArrayList Min Value: " + Collections.min(aListMarks) );
        
        
        /*
         * To find maximum value in ArrayList, use
         * max method of Collections class.
         */
        
        System.out.println( "ArrayList Max Value: " + Collections.max(aListMarks) );
 
    }
}