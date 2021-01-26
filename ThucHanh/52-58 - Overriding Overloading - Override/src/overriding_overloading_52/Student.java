package overriding_overloading_52;

public class Student extends Person {

	public String universityName;

	// co thua ke bat buoc co construct co tham so
	public Student(String name, int age, float height, String universityName) {
		super(name, age, height); // bat buoc
		this.universityName = universityName;
	}

	@Override 
	/*
	 * Overridding : giong ten method, tham so truyen vao
	 * So luong tham so truyen vao
	 */
	public void getInfo() {
		super.getInfo();
		System.out.println("University Name:" + this.universityName);
	}
}
