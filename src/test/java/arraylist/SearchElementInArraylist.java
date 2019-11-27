package arraylist;

import java.util.ArrayList;

public class SearchElementInArraylist {

	
	public static boolean isElementPresentInList(String searchElement){
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		boolean isElementPresent = list.contains(searchElement);
		if(isElementPresent=true){
			System.out.println("Element "+searchElement + " is present in arraylist");					
		}else{
			System.out.println("Element "+searchElement + " is not present in arraylist");
		}
		return isElementPresent;
	}
	
	
	public static void main(String[] args) {
		isElementPresentInList("B");
	}

}
