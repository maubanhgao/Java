package this_49;

public class Person {
	public String name;
	public int age;
	public float height;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this(name); // anh xa de contruct Person String name
		this.age = age;
	}

	public Person(String name, int age, float height) {
		this(name, age); // anh xa den this(name) Construct co tham so name va age
		this.height = height;
	}

	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
}