package this_49;

public class Person_2 {
	public String name;
	public int age;
	public float height;

	public Person_2(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person_2 [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	public Person_2 getInstance() {
		return this;
	}
}
