package polymorphism;

class Animal {
	public void makeSound() {
		System.out.println("Dong vat keu");
	}
}

class Pig extends Animal{
	public void makeSound() {
		System.out.println("The pig says: un in");
	}
}

class Dong extends Animal {
	public void makeSound() {
		System.out.println("The dog says: gau gau");
	}
}
public class MyMainClass {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dong();
		myAnimal.makeSound();
		myDog.makeSound();
		myPig.makeSound();
	}

}
