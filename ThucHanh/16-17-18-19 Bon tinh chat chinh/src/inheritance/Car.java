package inheritance;

class Vehicle{
	protected String model = "Ford";
	protected String color = "Red";
	
	public void run() {
		System.out.println("Tuut, tuut!");
	}
}

class Bicycle extends Vehicle {
	public static void main(String[] args) {
		Bicycle myBike = new Bicycle();
		myBike.run();
		System.out.println(myBike.color + " " + myBike.model);
	}
}

class Car extends Vehicle{
	private String modelName = "Mustang Car attribute";
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println(myCar.color + " " + myCar.modelName);
	}

}
