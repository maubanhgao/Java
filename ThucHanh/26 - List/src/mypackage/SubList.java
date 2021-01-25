package mypackage;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		for(String el : list) {
			System.out.println(el);
		}
		System.out.println("-------------------");
		List <String> subList = list.subList(1, 3);
		for(String el : subList) {
			System.out.println(el);
		}
	}

}
