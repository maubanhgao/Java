package override_58;

public class Bike2 extends Vehicle {

	@Override
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();
	}

}
