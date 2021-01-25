package set_27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExamHashSet {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Set<String> setA = new HashSet<>();
		setA.add("element 1");
		setA.add("element 2");
		setA.add("element 3");

		// su dung for de duyet
		for (String el : setA) {
			System.out.println(el);
		}
		// element 3
		// element 2
		// element 1
		System.out.println("-----------");
		// dung Iterator de duyet
		Iterator<String> iterator = setA.iterator();
		while (iterator.hasNext()) {
			String el = iterator.next();
			System.out.println(el);
		}
		System.out.println("-----------");
		setA.remove("element 2");
		System.out.println(setA.size());
		setA.clear();
		System.out.println(setA.size());
		System.out.println("----------");
		Set<String> setA2 = new HashSet<>();
		setA2.add("one");
		setA2.add("two");
		setA2.add("three");
		Set<String> setA3 = new HashSet<>();
		setA3.add("four");
		setA3.addAll(setA2);
		Iterator<String> iteratorA3 = setA3.iterator();
		while (iteratorA3.hasNext()) {
			String el = iteratorA3.next();
			System.out.println(el);
		}
		System.out.println("--------------------");
		Set<String> setA4 = new HashSet<>();
		System.out.println(setA3.isEmpty());
		System.out.println(setA4.isEmpty());
		System.out.println("-------------");
		// kiem tra su ton tai cua mot phan tu
		boolean containA3 = setA3.contains("two");
		System.out.println(containA3);
	}

}
