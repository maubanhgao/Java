package get_set_50;

public class PersonMethodClone {
	public String name;
	private int age;
	public float height;

	public PersonMethodClone(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}

	public PersonMethodClone clone() {
		PersonMethodClone other = new PersonMethodClone(this.name, this.age, this.height);
		return other;
	}
	
	public void getInfo() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
	
	public static void main(String[] args) {
		PersonMethodClone p = new PersonMethodClone("Nguyen", 21, 1.7f);
		p.getInfo();
	}
}
