package abstract_20;

abstract class Animal {
	private String name;
	protected int age;
	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzzzz");
	}
}

class Pig extends Animal {

	@Override
	public void animalSound() {
		System.out.println("The pig says wee wee");
	}
	
	public void newClass() {
		super.sleep();
		System.out.println("newn new new new ");
	}
}
public class MyMainClass {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		myPig.newClass();
	}

}
