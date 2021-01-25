package linkedlist_30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class KhoiTaoLinkedList {

	public static void main(String[] args) {
		// khai bao 1 LinkedList co ten la listString
		LinkedList<String> listString = new LinkedList<String>();
		// thêm các phần tử vào list
		listString.add("Java");
		listString.add("C++");
		listString.add("PHP");
		listString.add("Java");
		// hiển thị các phần tử của list
		System.out.println("Các phần tử có trong list là: ");
		System.out.println(listString); 
		// [Java, C++, PHP, Java]
		System.out.println("----------------");
		for(String el : listString) {
			System.out.println(el);
		}
		System.out.println("----------------");
		for(int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}
		System.out.println("----------------");
		Iterator<String> iterator = listString.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------");
		ListIterator<String> iteratorList = listString.listIterator();
		while(iteratorList.hasNext()) {
			System.out.println((String)iteratorList.next());
		}
	}

}
