package comparable;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		
	}

	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	/*
	 	comparable.Student@7852e922
		comparable.Student@4e25154f
		comparable.Student@70dea4e
		comparable.Student@5c647e05
	 */

	@Override
	public String toString() {
		return "Student @id=" + id + ", name=" + name + ", age=" + age + ", address=" + address;
	}

	@Override
	public int compareTo(Student student) {
		return this.getName().compareTo(student.getName());
	}
	

}
