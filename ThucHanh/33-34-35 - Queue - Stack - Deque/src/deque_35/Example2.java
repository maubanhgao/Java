package deque_35;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example2 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("element 1");
		deque.add("element 2");
		deque.addLast("element 4");
		System.out.println(deque);
		deque.addFirst("element 0");
		System.out.println(deque);
		deque.offer("element 5"); // false neu day 
		System.out.println(deque);
		deque.offerLast("element 7");
		System.out.println(deque);
		deque.offerFirst("element 0");
		System.out.println(deque);
		deque.push("element 0-push");
		System.out.println(deque);
	}

}
