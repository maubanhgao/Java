package deque_35;

import java.util.Deque;
import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();

		deque.add("element 0");

		String removedElement = deque.remove();
		System.out.println(removedElement);
		System.out.println(deque.size());
		
		Deque<String> deque2 = new LinkedList<>();

		deque2.add("element 0");

		String removedElement2 = deque2.removeFirst();
		System.out.println(removedElement2);
		System.out.println(deque2.size());
		
		Deque<String> deque3 = new LinkedList<>();

		deque3.add("element 0");
		deque3.add("element 1");
		deque3.add("element 2");

		String removedElement3 = deque3.removeLast();
		System.out.println(removedElement3);
		System.out.println(deque3.size());
	}

}
