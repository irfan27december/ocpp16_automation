package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Compare2ArrayListsAndGetCommonElements {
 
    public static void main(String[] args) {
    
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
        aList1.add(1);
        aList1.add(2);
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        
        ArrayList<Integer> aList2 = new ArrayList<Integer>();
        aList2.add(1);
        aList2.add(2);
        aList2.add(4);
        aList1.add(7);
        
        compareArrayList(aList1, aList2);        
    }
 
    private static void compareArrayList(List<Integer> list1, List<Integer> list2){
        
        /*
         * Copy ArrayList so that original list
         * remains unchanged
         */
        List<Integer> copy = new ArrayList<Integer>(list1);
        
        /*
         * This will retain all elements in list1 which are
         * also present in list b (i.e. common elements) and 
         * remove rest of the elements.
         */
        copy.retainAll(list2);
        
        System.out.println( "Common elements present in both arraylists are: " + copy);
        
    }
}