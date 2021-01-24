package abstraction;

abstract class AnimalAbstract {
	public abstract void animalSound();
	public void sleep() {
		System.out.println("ZZZZZ");
	}
}

class Pig extends AnimalAbstract {
	public void animalSound() {
		System.out.println("The heo says: weee wee");
	}
}

public class MyMainClass {

	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
	}

}
