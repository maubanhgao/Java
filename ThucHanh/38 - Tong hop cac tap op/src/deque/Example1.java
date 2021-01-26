package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.add("Nguyên "); // add vào đuôi
		deque.addFirst("Le Vu ");
		deque.addLast("Deque");
		deque.push("Name   (Head)"); // add vào đầu
		deque.offer("Age  5 (Tail)");
		System.out.println(deque);
	}

}
