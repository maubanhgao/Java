package exception_42;

public class Example6 {
	public static void main(String[] args) {
		// Về finally, nó là một khối được sử dụng cùng try, catch để đặt mã quan trọng,
		// nó sẽ được thực thi cho dù ngoại lệ có được xử lý hay không.
		try {
			int a = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Doesn't div by zero!");
		} finally {
			System.out.println("Finally block!");
		}
	}
}
