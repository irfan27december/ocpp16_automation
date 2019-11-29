package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String a[]){
		ListIterator<String> litr = null;
		List<String> list = new LinkedList<String>();
		list.add("Shyam");
		list.add("Rajat");
		list.add("Paul");
		list.add("Tom");
		list.add("Kate");
		
		//Obtaining list iterator
		litr=list.listIterator();

		System.out.println("Traversing the list in forward direction:");
		while(litr.hasNext()){
			System.out.print(litr.next()+ " ");
		}
		
		System.out.println(" ");
		
		System.out.println("\nTraversing the list in backward direction:");
		while(litr.hasPrevious()){
			System.out.print(litr.previous()+ " ");
		}
	}
}
