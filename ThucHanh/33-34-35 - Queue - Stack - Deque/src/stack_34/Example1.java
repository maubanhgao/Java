package stack_34;

import java.util.Stack;

public class Example1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(stack);
		String topElement = stack.pop();
		System.out.println("" + topElement);
		System.out.println("Stack sau xoa : " + stack);
		System.out.println("Phan tu dau tien trong danh sach: " + stack.peek() );
		System.out.println(stack);
	}

}
