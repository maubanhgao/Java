package queue_33;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("element 1");
		queue.add("element 2");
		queue.add("element 3");
		String firstElement = queue.element();
		String firstEle = queue.peek();
		System.out.println(firstEle);
		System.out.println(firstElement);
		System.out.println("------------------");
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}

}
