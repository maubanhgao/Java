package sortedset_28;

import java.util.Iterator;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		// mac dinh la sap xep tang dan
		// Iterator iterator = treeSet.iterator();
		// method descendingIterator() de giam dan
		Iterator iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			String el = (String) iterator.next();
			System.out.println(el);
		}

	}

}
