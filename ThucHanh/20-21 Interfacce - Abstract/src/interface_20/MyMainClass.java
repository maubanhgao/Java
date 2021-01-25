package interface_20;

interface Animal { // khong the de public interface
	public void animalSound();
	public void sleep();
}

class Pig implements Animal {

	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzzzzzzzz");
	}
	
}

public class MyMainClass {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}
