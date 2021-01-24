package inheritance;

final class VehicleAnimal {
	protected String model = "Ford";
	protected String color = " Red";
	
	public void run() {
		System.out.println("Tuut, tuut");
	}
}
class Dog {
	protected String name = "Muc";
	
	public final String changeName(String name) {
		return name;
	}
	
	public void keu() {
		System.out.println("cha biet gi gi?");
	}
}
class BicycleAnimal extends Dog{

	public static void main(String[] args) {
		BicycleAnimal bAni = new BicycleAnimal();
		System.out.println(bAni.changeName("hai ha"));
	}

}
