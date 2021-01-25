package linkedlist_30;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Python");

		System.out.println("Số phần tử của list ban đầu : " + list);
		System.out.println("Các phần tử của list ban đầu: " + list.size());
		// CLEAR LIST
		list.clear();
		System.out.println("\nSố phần tử của list sau khi clear: " + list);
		System.out.println("Các phần tử của list sau khi clear: " + list.size());

	}

}
