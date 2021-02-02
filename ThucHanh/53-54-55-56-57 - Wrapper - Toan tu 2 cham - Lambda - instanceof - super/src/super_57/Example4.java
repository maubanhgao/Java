package super_57;

class Person {
	void message() {
		System.out.println("Welcome");
	}
}

public class Example4 extends Person {

	void message() {
		System.out.println("Welcome to java");
	}

	void display() {
		message();// lop hien tai
		System.out.println("----------------");
		super.message(); // lop cha
	}

	public static void main(String[] args) {
		Example4 ex = new Example4();
		ex.display();
	}

}
