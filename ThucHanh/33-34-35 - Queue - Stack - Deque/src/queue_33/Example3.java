package queue_33;

import java.util.LinkedList;
import java.util.Queue;

public class Example3 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.add("element 0");
		queue.add("element 1");
		queue.add("element 0");
		queue.add("element 1");
		queue.add("element 0");
		queue.add("element 1");
		boolean containE1 = queue.contains("element 0");
		System.out.println(containE1);
		System.out.println(queue);
		String el = queue.element();
		queue.peek();
		System.out.println(queue);
	}

}
