package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Compare2ArrayListsAndPrintMissingElementsFromAnotherList {
 
    public static void main(String[] args) {
    
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
        aList1.add(1);
        aList1.add(2);
        aList1.add(3);
        
        ArrayList<Integer> aList2 = new ArrayList<Integer>();
        aList2.add(1);
        aList2.add(2);
        aList2.add(4);
        
        compareArrayList(aList1, aList2);        
    }
 
    private static void compareArrayList(List<Integer> a, List<Integer> b){
        
    	 /*
         * Copy ArrayList so that original list
         * remains unchanged
         */
        List<Integer> copy = new ArrayList<Integer>(a);
        
        /*
         * This will remove all elements in list a which are
         * not present in b (i.e. missing elements)
         */
        copy.removeAll(b);
        
        System.out.println("Present in a but missing from b: " + copy);
        
        /*
         * Similarly, get elements present in b but
         * missing from from a
         */
        copy = new ArrayList<Integer>(b);
        
        copy.removeAll(a);        
        System.out.println("Present in b but missing from a: " + copy);
        
    }
}