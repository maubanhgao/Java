package vidu;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("123");
		boolean contain123 = list.contains("123");
		System.out.println(contain123);
		boolean removed = list.remove("123");
		System.out.println(list.size());
	}

}
