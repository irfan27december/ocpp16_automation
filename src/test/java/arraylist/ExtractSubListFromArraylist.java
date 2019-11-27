package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ExtractSubListFromArraylist {


	public static void extractElements(int fromPos, int toPos){
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// string extracted from given index.
		List<String> subList = list.subList(fromPos, toPos);

		// print extracted string.
		System.out.println("List of elements from: " +fromPos +" to "+ +toPos + " are :"+subList);
	}


	public static void main(String[] args) {
		extractElements(0,3);
	}

}
