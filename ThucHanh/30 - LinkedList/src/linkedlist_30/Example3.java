package linkedlist_30;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		System.out.println("list trước khi cập nhật: ");
		System.out.println(list);
		// cập nhật giá trị cho phần tử có chỉ số là 3 (Java)
		list.set(3, "Python");
		System.out.println("list trước khi cập nhật: ");
		System.out.println(list);
	}

}
