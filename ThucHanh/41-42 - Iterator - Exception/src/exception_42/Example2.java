package exception_42;

import java.io.IOException;

public class Example2 {

	void aMethod() throws IOException { // checked
		throw new IOException("Device error");
	}

	public static void main(String[] args) {
		try {
			Example2 obj = new Example2();
			obj.aMethod();
		} catch (Exception e) {
			System.out.println("Exception handled!");
		}

		System.out.println("Hello Codelearn!");
	}

}
