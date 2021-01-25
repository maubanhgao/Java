package linkedlist_30;

import java.util.LinkedList;

public class Example7 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// thêm các phần tử vào list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Python");
		list.add("Java");

		// kiểm tra xem Java có tồn tại trong list hay không?
		System.out.println(list.indexOf("Java")); // 0
		// kiểm tra xem ANDROID có tồn tại trong list hay không?
		System.out.println(list.indexOf("ANDROID")); // -1
		System.out.println(list.lastIndexOf("Java")); // 4

		// sử dụng phương thức toArray() chuyển list thành mảng
		// kết quả của phương thức này sẽ trả về mảng arr
		Object[] arr = list.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Phần tử tại vị trí " + i + " " + "trong arr là " + arr[i]);
		}
	}

}
