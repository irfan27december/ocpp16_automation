package arraylist;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Compare2ArrayLists {
	
	
	@Test
	public void compare2ArrayListMethod(){
		/* Creating ArrayList of type "String" which means
		 * we can only add "String" elements
		 */
		ArrayList<String> arrayList1 = new ArrayList<String>();

		/*This is how we add elements to an ArrayList*/
		arrayList1.add("Imran");
		arrayList1.add("Irfan");
		arrayList1.add("Idrees");
		arrayList1.add("Mustafa");
		arrayList1.add("Hammad");
		arrayList1.add("Irfan");

		// Displaying elements
		System.out.println("ArrayList1 :");
		for(String str:arrayList1)
			System.out.println("From array list 1 "+str);

		
		
		
		ArrayList<String> arrayList2 = new ArrayList<String>();

		/*This is how we add elements to an ArrayList*/
		arrayList2.add("Imran");
		arrayList2.add("Irfan");
		arrayList2.add("Idrees");
		arrayList2.add("Mustafa");
		arrayList2.add("Hammad");
		arrayList2.add("Irfana");

		// Displaying elements
		System.out.println("ArrayList2 :");
		for(String str:arrayList2)
			System.out.println("From array list 2 "+str);
		
		if(arrayList1.size() == arrayList2.size()){
			Assert.assertEquals(arrayList1, arrayList2, "Both arraylists are same");
		}else{
			System.out.println("Both arraylsist are of different sizes....");
		}
		
	}
	
}
