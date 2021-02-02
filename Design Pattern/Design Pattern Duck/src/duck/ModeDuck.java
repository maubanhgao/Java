package duck;

public class ModeDuck extends Duck {
	public ModeDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Tôi là vịt mẫu");
	}
}
