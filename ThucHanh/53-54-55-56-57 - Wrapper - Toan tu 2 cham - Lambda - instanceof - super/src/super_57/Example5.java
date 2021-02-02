package super_57;

class Person5 {
	void message() {
		System.out.println("Welcome");
	}
}

public class Example5 extends Person5 {

	void display() {
		message();
		// will invoke parent class message() method
	}

	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.display();
	}

}
