
public class MyClass {
	static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	public static void main(String[] args) {
		myMethod(); // I just got executed!
		myMethod();
		myMethod();
		myMethod();
	}

}
