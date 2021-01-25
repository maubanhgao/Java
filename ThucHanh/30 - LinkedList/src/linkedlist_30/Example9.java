package linkedlist_30;

import java.util.LinkedList;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// linkedlist_30.Student@7852e922
	// linkedlist_30.Student@4e25154f
	// linkedlist_30.Student@70dea4e

	 @Override
	 public String toString() {
	 return "Student@[name=" + name + ", age=" + age + "]";
	 }
}

public class Example9 {
	public static void main(String[] args) {
		LinkedList<Student> listStudent = new LinkedList<>();

		Student student1 = new Student("Bac", 17);
		Student student2 = new Student("Nam", 20);
		Student student3 = new Student("Trung", 19);

		// Add objects to listStudent
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		// Show listStudent
		for(Student student : listStudent) {
			System.out.println(student.toString());
		}
	}
}
