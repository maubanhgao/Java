package interface_20;

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
	
	public void changeName();
	// interface method (does not have a body)
}

class DemoClass implements FirstInterface, SecondInterface {

	@Override
	public void myOtherMethod() {
		System.out.println("Some text ....");
	}

	@Override
	public void myMethod() {
		System.out.println("Some other text ......");
	}

	@Override
	public void changeName() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}
