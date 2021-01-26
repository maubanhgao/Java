package stack_34;

import java.util.Iterator;
import java.util.Stack;

public class Example2 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("1");
		stack.push("2");
		stack.push("3");
		int index = stack.search("3");
		System.out.println(stack.search("4")); // -1
		System.out.println(index); // 1
		System.out.println(stack.contains("3")); // true
		System.out.println("Kich thuoc : " + stack.size());
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}

}
