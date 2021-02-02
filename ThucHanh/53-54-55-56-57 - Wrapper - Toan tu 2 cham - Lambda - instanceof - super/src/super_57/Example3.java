package super_57;

class Vehicle3 {
	public Vehicle3() {
		System.out.println("Vehicle is created");
	}
}

public class Example3 extends Vehicle3 {

	int speed;

	public Example3(int speed) {
		this.speed = speed;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		Example3 ex = new Example3(10);
	}

}
