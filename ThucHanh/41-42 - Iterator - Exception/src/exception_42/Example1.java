package exception_42;

public class Example1{
	
	public static void ageValid(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age not valid!"); // uncheck
		} else {
			System.out.println("Welcome!");
		}
	}

	public static void main(String[] args) {
		ageValid(19);
		System.out.println("------");
		ageValid(17);
		System.out.println("------------");
	}

}
