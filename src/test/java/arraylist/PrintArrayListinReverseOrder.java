package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintArrayListinReverseOrder {
	public static void main(String[] args) {
	    ////Creating object of ArrayList
	    ArrayList arrList = new ArrayList();
	   
	    //adding data to the list
	    arrList.add("100");
	    arrList.add("200");
	    arrList.add("300");
	    arrList.add("400");
	    arrList.add("500");
	   
	    System.out.println("Array List elements: ");
	    Collections.reverse(arrList);
	    Set<String> set = new HashSet<String>(arrList);
	    
	    for(String str:set)
	    System.out.println(str);
	    
	    
	    
	    //Alternate way to display array list elements in reverse order
	    /*for(int iLoop = arrList.size() - 1; iLoop >= 0; iLoop--)
	      System.out.println(arrList.get(iLoop));*/
	    
	    
	   
	  }
}
