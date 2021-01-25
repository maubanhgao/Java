package linkedlist_30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example10 {

	public static void main(String[] args) {
		// create arrayList
		List<String> arrayList = new ArrayList<String>();
		// add object in arraylist
		arrayList.add("Java");
		arrayList.add("C++");
		arrayList.add("PHP");
		arrayList.add("Python");

		// create linkedlist
		List<String> linkedList = new LinkedList<String>();
		// aadd object in linkedlist
		linkedList.add("Hiberante");
		linkedList.add("Struts2");
		linkedList.add("Spring");
		linkedList.add("Mybatis");
		System.out.println("arraylist: " + arrayList);
        System.out.println("linkedlist: " + linkedList);
	}

}
