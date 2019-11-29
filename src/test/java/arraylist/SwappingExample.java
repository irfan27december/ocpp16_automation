package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingExample {

 public static void main(String a[]){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Sachin");
    list.add("Rahul");
    list.add("Saurav");
    list.add("Sunil");
    list.add("Kapil");
    list.add("Vinod");

    System.out.println("ArrayList before Swap:");
    for(String temp: list){
        System.out.println(temp);
    }

    //Swapping 2nd(index 1) element with the 5th(index 4) element
    Collections.swap(list, 1, 4);

    System.out.println("ArrayList after swap:");
    for(String temp: list){
       System.out.println(temp);
    }
  }
}