package get_set_50;

public class HelloWorld {

	public static void main(String[] args) {
		Person a = new Person("Chau", 21, 1.7f);
		System.out.println(a.getAge());
		a.setAge(22);
		System.out.println(a.getAge());
		a.setAge(-5);
		System.out.println(a.getAge());
	}

}
