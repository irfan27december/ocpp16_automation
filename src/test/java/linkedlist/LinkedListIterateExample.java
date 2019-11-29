package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterateExample {

	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		/*Using Iterator*/
		//Iterator in Java can traverse a List or Set in forward direction. 
		Iterator iterator = list.iterator();
		System.out.println("Printing list using iterator: ");
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println("");

		/*Advanced for loop*/
		System.out.println("Printing list using advanced for loop:");
		for(String str: list){
			System.out.print(str + " ");
		}

	}

}
