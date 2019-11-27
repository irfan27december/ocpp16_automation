package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAnElementInArraylist {


	public static void replaceAnElementInArrayList(int position){
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		System.out.println("Original ArrayList...");

		for(int index = 0; index < list.size(); index++)
			System.out.println(list.get(index));

		// Enter the position and number for replace.
		list.set(position,"BB");

		// Print list after replacement.
		System.out.println("ArrayList after replacement...");
		for(int index = 0; index < list.size(); index++)
			System.out.println(list.get(index));
	}


	public static void main(String[] args) {
		replaceAnElementInArrayList(1);
	}

}
