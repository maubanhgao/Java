package super_57;

class Vehicle1 {
	int speed = 50;
}

public class Example1 extends Vehicle1 {
	int speed = 100;

	void display() {
		// System.out.println(this.speed);
		System.out.println(super.speed);
	}

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.display();
	}

}
