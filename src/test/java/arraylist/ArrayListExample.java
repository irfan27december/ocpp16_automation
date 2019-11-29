package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Arraylist class implements List interface
//ArrayList can dynamically grow and shrink after addition and removal of elements 
//ArrayList is a resizable-array

public class ArrayListExample {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		/* Creating ArrayList of type "String" which means
		 * we can only add "String" elements
		 */
		ArrayList<String> list = new ArrayList<String>();

		/*This is how we add elements to an ArrayList*/
		list.add("Imran");
		list.add("Irfan");
		list.add("Idrees");
		list.add("Mustafa");
		list.add("Hammad");
		list.add("Irfan");
		list.add("Irfan");
		list.add("Irfan");
		list.add("Irfan");
		

		// Displaying elements
		System.out.println("Original ArrayList:");
		for(String str:list)
			System.out.println(str);

		/* Add element at the given index
		 * list.add(0, "Rahul") - Adding element "Rahul" at first position
		 * list.add(1, "Justin") - Adding element "Justin" at second position
		 */
		list.add(0, "Saqib");
		list.add(1, "Maria");

		// Displaying elements
		System.out.println("ArrayList after add operation:");
		for(String str:list)
			System.out.println(str);

		//Remove elements from ArrayList like this
		list.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
		list.remove("Harry"); //Removes "Harry" from ArrayList

		// Displaying elements
		System.out.println("ArrayList after remove operation:");
		for(String str:list)
			System.out.println(str);

		//Remove element from the specified index
		list.remove(1); //Removes Second element from the List

		// Displaying elements
		System.out.println("Final ArrayList:");
		for(String str:list)
			System.out.println(str);
		/*int count = 0;
		for(String str:list){
			//System.out.println(str);
			if(str.equals("Irfan")){
				count++;
				System.out.println(" Present "+list.contains("Irfan"));
			}
		}
		System.out.println("Count is "+count);
		*/
		int count = Collections.frequency(list,"Irfan");
		System.out.println("Frequency is "+count);
	}
}
