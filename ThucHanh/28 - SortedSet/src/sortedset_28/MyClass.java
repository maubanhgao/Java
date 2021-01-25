package sortedset_28;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("one");
		System.out.println(sortedSet.size());
		sortedSet.remove("one");
		System.out.println(sortedSet.size());
		// 1
		// 0
		sortedSet.add("one");
		sortedSet.add("two");
		sortedSet.add("thre");
		Object firstElement = sortedSet.first();
		String lastElement = sortedSet.last();
		System.out.println(firstElement);
		System.out.println(lastElement);
		System.out.println("-----------");
		Iterator<String> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			String el = iterator.next();
			System.out.println(el);
		}
	}

}
