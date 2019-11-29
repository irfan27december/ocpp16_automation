package arraylist;

import java.util.ArrayList;
public class EnsureCapacityExample {
	public static void main(String args[]) {
		// ArrayList with Capacity 4
		ArrayList<String> list = new ArrayList<String>(4);
		//Added 4 elements
		list.add("Hi");
		list.add("Hello");
		list.add("Bye");
		list.add("GM");

		//Increase capacity to 5
		list.ensureCapacity(5);

		list.add("GE");
		// let us print listl the elements available in list
		for (String temp: list) {
			System.out.println(temp);
		}
	}
}