package linkedlist_30;

import java.util.Iterator;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// Add objects to list
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		System.out.println("-----------------------------------");
		System.out.println("ví dụ sử dụng phương thức addAll()");
		// thêm các phần tử của list vào listA
		LinkedList<String> listA = new LinkedList<String>();
		listA.addAll(list);
		showList(listA);
		System.out.println("-----------------------");
		System.out.println("ví dụ sử dụng phương thức retainAll()");
		// khởi tạo listB
		LinkedList<String> listB = new LinkedList<>();
		listB.add("Java");
		// xóa những phần tử không thuộc listB khỏi listA
		listA.retainAll(listB);
		showList(listA);
		System.out.println("------------------------");
		System.out.println("ví dụ sử dụng phương thức removeAll()");
		// xóa những phần tử thuộc listB khỏi list
		list.remove(listB);
		showList(list);

	}

	public static void showList(LinkedList<String> listA) {
		Iterator<String> iterator = listA.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}

	}

}
