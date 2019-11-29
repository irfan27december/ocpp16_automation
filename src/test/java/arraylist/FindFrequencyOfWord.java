package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFrequencyOfWord {

	public static void findFrequencyOfWordsInArray(){
		String[] arrays = {"Tom","Joe","Ty","Bob","Fred","Kevin","Bob"};
		
		//Converting array to ArrayList Using Arrays.asList() method
		List<String> list2 = new ArrayList<String>(Arrays.asList(arrays));
		
		/*int count2 = Collections.frequency(list2,"Bob");
		System.out.println("Frequency is "+count2);*/
		
		Set<String> set2 = new HashSet<String>(list2); 
		//Set<String> set3 = new LinkedHashSet<String>(list); 
		for (String string : set2) 
			System.out.println("Frequency of "+string + ": " + Collections.frequency(list2, string)); 

	}


	public static void findFrequencyOfCharactersInString(){
		System.out.println(" ");
		// creating Arrays of String type
		String str = "A C A D A A A A A A A A A A A A B A ";
		String[] strToArray = str.split(" ");
		
		// getting the list view of Array
		List<String> list3 = new ArrayList<String>(Arrays.asList(strToArray));
		
		// printing the list
		System.out.println("The list is:" + list3);
		
		/*int count3 = Collections.frequency(list3,"A");
		System.out.println("Frequency is "+count3);*/
		
		Set<String> set3 = new HashSet<String>(list3); 
		//Set<String> set3 = new LinkedHashSet<String>(list); 
		for (String string : set3) 
			 
			/*Collections class contains static utility methods that either accepts or returns the collection. 
			 The collection class provides many useful methods for shuffling, reversing, sorting and searching collection objects.
			*/ 
			System.out.println("Frequency of "+string + ": " + Collections.frequency(list3, string)); 

	}

	/**
	 * @param args
	 */
	public static void main(String args[]){
		/*List<String> list1 = new ArrayList<String>(Arrays.asList("Tom","Joe","Ty","Bob","Fred","Kevin","Bob"));
		int count1 = Collections.frequency(list1,"Bob");
		System.out.println("Frequency is "+count1);*/

		findFrequencyOfWordsInArray();
		findFrequencyOfCharactersInString();




		String [] currency = {"SGD", "USD", "INR", "GBP", "AUD", "SGD"}; 

		System.out.println("Size of array: " + currency.length); 

	}
}
