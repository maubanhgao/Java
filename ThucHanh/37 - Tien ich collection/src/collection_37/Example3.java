package collection_37;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		System.out.println("Original List : \n" + mylist);
		
		Collections.shuffle(mylist);// Tron phan tu
		
		System.out.println("After: " + mylist);
	}

}
