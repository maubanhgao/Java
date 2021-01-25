package mypackage;

import java.util.ArrayList;
import java.util.List;

public class MyListArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		cars.add(0, "Nguyen");
		System.out.println(cars);

		List<String> listSource = new ArrayList<>();
		listSource.add("123");
		listSource.add("456");
		List<String> listDest = new ArrayList<>();
		listDest.addAll(listSource);
		for (String dest : listDest) {
			System.out.println(dest);
		}
		cars.set(0, "890");
		System.out.println(cars.get(0));

		List<String> list = new ArrayList<>();
		String element1 = "element 1";
		String element2 = "element 2";
		list.add(element1);
		list.add(element2);
		// tim kiem phan tu trong list
		int index1 = list.indexOf(element1);
		int index2 = list.indexOf(element2);
		System.out.println("index1: " + index1);
		System.out.println("index2: " + index2);
		// index1: 0
		// index2: 1

		List<String> listadd = new ArrayList<>();
		String el1 = "element 1";
		String el2 = "element 2";

		listadd.add(el1);
		listadd.add(el2);
		listadd.add(el1);

		int lastIndex = listadd.lastIndexOf(el1);
		System.out.println("LastIndex = " + lastIndex); // LastIndex = 2

		listadd.remove(0);
		int lastIndexxxxx = listadd.lastIndexOf(el1);
		System.out.println("LastIndex after remove: " + lastIndexxxxx);
		// LastIndex after remove: 1
		listadd.clear();
		System.out.println(listadd.size()); // 0
		System.out.println("------------------------");
		// tim kiem phan tu tra ve true/ false
		boolean containElement = list.contains("element 1");
		System.out.println(containElement); // true
	}

}
