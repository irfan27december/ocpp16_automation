package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	
	public static void removeDuplicatesFromArrayList(){
		List<String> list = new ArrayList<String>();  
		list.add("Mango");  
		list.add("Banana");  
		list.add("Mango");  
		list.add("Apple"); 
		list.add("Apple");
		list.add("Mango");  
		list.add("Apple"); 
		System.out.println("List before removing duplicates from the list "+list.toString());  
		Set<String> set = new LinkedHashSet<String>(list);  
		System.out.println("List after removing duplicates from the list "+set);  
	}
	
	public static void removeDuplicatesFromArray(){
		String[] str = {"Mango","Banana","Banana","Banana","Mango","Banana"};
		List<String> list = new ArrayList<String>(Arrays.asList(str));  
		System.out.println("List before removing duplicates from the array "+list.toString());  
		Set<String> set = new LinkedHashSet<String>(list);  
		System.out.println("List after removing duplicates from the array "+set);  
	}
	
	public static void removeDuplicatesFromSentence(){
		String str = "Mango Banana Banana Banana Mango Banana A A A A B B";
		/*
         * Since the words are separated by space,
         * we will split the string by one or more space
         */
		String[] strArray = str.split("\\s+");
		
		/*The List interface extends the Collections interface. 
		The List represents index based ordered collection of the objects. 
		The elements contained in the List are ordered and can be inserted, accessed or searched based on their index. 
		The list may contain duplicate elements. The main classes implementing the List interface are ArrayList, and LinkedList.*/
		
		List<String> list = new ArrayList<String>(Arrays.asList(strArray));  
		System.out.println("List before removing duplicates from the sentence "+list.toString());  
		Set<String> set = new LinkedHashSet<String>(list);  
		System.out.println("List after removing duplicates from the sentence "+set);  
	}
	
	public static void main(String[] args) {  
		removeDuplicatesFromArrayList();
		removeDuplicatesFromArray();
		removeDuplicatesFromSentence();
	}  
}
