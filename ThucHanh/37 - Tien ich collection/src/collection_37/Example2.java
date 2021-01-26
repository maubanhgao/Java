package collection_37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println("Before: " + list);
		Collections.reverse(list);
		System.out.println("After: " + list);
	}

}
