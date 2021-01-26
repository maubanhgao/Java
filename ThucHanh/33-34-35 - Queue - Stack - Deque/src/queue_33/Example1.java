package queue_33;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		Queue<String> queue2 = new PriorityQueue<>();
		// them phan tu
		queue.add("element 1"); // nhan Exeption
		queue.offer("element 2"); // nhan false
		queue2.add("element 1");
		queue2.offer("element 2");
		// Duyet qua phan tu
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
		System.out.println("-----------------");
		for (String el : queue2) {
			System.out.println(el);
		}
		System.out.println("------------");
		// lay phan tu
		String el1queue = queue.poll(); // lay phan tu dau tieng neu rong se tra ve null
		String el2queue = queue.remove(); // lap phan tu dau tien neu rong se nem ra loi
		System.out.println(el2queue);
		System.out.println(el1queue);
		queue2.add("element 3");
		queue2.add("element 4");
		int num = 2;
		for(int i = 0; i < 2; i++) {
			queue2.remove();
		}
		System.out.println("--------Queueueueu2----------");
		Iterator<String> iter = queue2.iterator();
		while (iter.hasNext()) {
			System.out.println((String) iter.next());
		}
		queue2.clear();
		System.out.println("Queue2 " + queue2.size());
		System.out.println("-----------------");
		System.out.println("Queue " + queue.size());
	}

}
