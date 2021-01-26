package deque_35;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example5 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("first element");

		boolean containsElement1 = deque.contains("first element");
		System.out.println(containsElement1);
		
	}

}
