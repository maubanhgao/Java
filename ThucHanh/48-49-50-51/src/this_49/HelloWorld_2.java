package this_49;

public class HelloWorld_2 {

	public static void main(String[] args) {
		Person_2 a = new Person_2("Chau", 21, 1.7f);
		System.out.println(a);
		System.out.println(a.getInstance());
		
		Person_2 b = a;
		Person_2 c = a.getInstance();
		
		System.out.println(b);
		System.out.println(c);

	}

}
