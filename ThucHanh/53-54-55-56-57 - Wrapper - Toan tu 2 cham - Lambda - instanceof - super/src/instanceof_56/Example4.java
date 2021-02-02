package instanceof_56;

class Animal_4 {
}

public class Example4 extends Animal_4 {

	static void method(Animal_4 a) {
		if (a instanceof Example4) {
			Example4 d = (Example4) a; // downcasting
			System.out.println("downcasting is ok");
		}
	}

	public static void main(String[] args) {
		// Animal4 là cha của Example4
		Animal_4 a = new Example4();
		Example4.method(a);
	}

}
