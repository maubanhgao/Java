package vidu;

class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}
public class Example3 {
	public static void main(String[] args) {
		Student nguyen = new Student(1,  "Nguyen");
		Student mai = new Student(2, "Mai");
		Student hong = new Student(1,  "Nguyen");
		
		System.out.println("Hash code Nguyen" + nguyen.hashCode());
		System.out.println("Hashcode Mai" + mai.hashCode());
		System.out.println(hong.hashCode());
	}
}
