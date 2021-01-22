
public class MyClassParam {
	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	static int myMethod(int x) {
		return 5 + x;
	}
	public static void main(String[] args) {
		myMethod("Liam", 5 );
		myMethod("Jenny", 8);
	    myMethod("Anja", 31);
	    /*
	     * Liam is 5
	     * Jenny is 8
	     * Anja is 31
	     */
	    System.out.println(myMethod(3)); //8
	    
	    
	}

}
