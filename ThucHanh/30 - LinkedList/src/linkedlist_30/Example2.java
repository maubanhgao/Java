package linkedlist_30;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		// truy cập phần tử có chỉ số 3 của list
		System.out.println("Gia tri phan tu thu 3: " + list.get(3));
	}

}
