package linkedlist_30;

import java.util.LinkedList;

public class Example6 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Python");
		// kiểm tra xem PHP có tồn tại trong list hay không?
		System.out.println(list.contains("PHP"));
		// kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.contains("ANDROID"));
	}

}
