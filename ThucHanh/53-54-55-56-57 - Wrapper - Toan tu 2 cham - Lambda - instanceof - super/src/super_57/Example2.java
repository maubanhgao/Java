package super_57;

class Vehicle2 {
	public Vehicle2() {
		System.out.println("Vehicle is created");
	}
}

public class Example2 extends Vehicle2 {
	
	public Example2() {
		super();
		System.out.println("Example2 is created");
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();
	}

}
