package deque_35;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example3 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.add("first element");
		deque.add("last element");

		String firstElement = deque.peek();
		System.out.println("phan tu dau tien: " + firstElement);
		String firstElementF = deque.peekFirst();
		System.out.println("phan tu dau tien: " + firstElementF);
		String lastElement = deque.peekLast();
		System.out.println("phan tu cuoi: " + lastElement);
		String firstElementGet = deque.getFirst();
		System.out.println("phan tu dau tien: " + firstElementGet);
		String lastElementGet = deque.getLast();
		System.out.println("phan tu cuoi: " + lastElementGet);
	}

}
