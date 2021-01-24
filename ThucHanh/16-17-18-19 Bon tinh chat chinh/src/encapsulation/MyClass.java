package encapsulation;

class Person{
	private String name;
	// private = restricted access
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
}

public class MyClass {
	public static void main(String []args) {
		Person myObj = new Person();
//		myObj.name = "John"; // Error
		myObj.setName("John");
		System.out.println(myObj.getName());
	}
}
