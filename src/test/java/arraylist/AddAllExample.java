package arraylist;

import java.util.ArrayList;
public class AddAllExample {
   public static void main(String[] args) { 
        // ArrayList1 of String type
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println("ArrayList1 before addAll:"+list1);

        //ArrayList2 of String Type
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");

        //Adding ArrayList2 into ArrayList1
        list1.addAll(list2);
        System.out.println("ArrayList1 after addAll:"+list1);
   }
}