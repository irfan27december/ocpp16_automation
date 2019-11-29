package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
 
public class RemoveDuplicatesFromArrayListExample {
 
    public static void main(String[] args) {
        
        List<String> aListDays = new ArrayList<String>();
        aListDays.add("Sunday");
        aListDays.add("Monday");
        aListDays.add("Tuesday");
        aListDays.add("Sunday");//duplicate
        aListDays.add("Wednesday");
        aListDays.add("Monday");//duplicate
        aListDays.add("Tuesday");//duplicate
        
        //ArrayList is an ordered collection, we used LinkedHashSet to retain the order of the elements. 
        //Convert ArrayList to LinkedHashSet
        LinkedHashSet<String> lhSetDays = new LinkedHashSet<String>(aListDays);
        
        //clear the original ArrayList
        aListDays.clear();
        
        //Add all elements of LinkedHashSet back to the ArrayList
        aListDays.addAll(lhSetDays);
        
        System.out.println("LinkedHashSet elements after removing duplicates "+aListDays);
        
        //You can also use the HashSet class instead of the LinkedHashSet class. 
        /* If you use the HashSet class, there will be no guarantee of the order of the elements of the ArrayList after removing duplicates. 
        If the order of the elements is important to you, use the LinkedHashSet.*/
        
        Set<String> set = new HashSet<String>(aListDays);
        aListDays.clear();
        aListDays.addAll(set);
        System.out.println("HashSet elements after removing duplicates "+aListDays);
        
    }
}