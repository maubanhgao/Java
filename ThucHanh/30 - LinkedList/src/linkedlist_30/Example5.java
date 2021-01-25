package linkedlist_30;

import java.util.LinkedList;

public class Example5 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Python");

		System.out.println("Số phần tử của list ban đầu : " + list);
		System.out.println("Các phần tử của list ban đầu: " + list.size());
		// remove phần tử có chỉ số index = 1 khỏi list
		list.remove(1);
		System.out.println("\nSố phần tử của list sau khi remove phan tu co index = 1: " + list);
		System.out.println("Các phần tử của list sau khi remove phan tu co index = 1: " + list.size());
		// remove phần tử có chỉ số index = 1 khỏi list
		list.remove("PHP");
		System.out.println("\nSố phần tử của list sau khi remove phan tu \"PHP\": " + list);
		System.out.println("Các phần tử của list sau khi remove phan tu \"PHP\": " + list.size());
	}

}
