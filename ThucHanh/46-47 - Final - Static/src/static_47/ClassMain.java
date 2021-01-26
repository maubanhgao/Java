package static_47;

public class ClassMain {

	public static void main(String[] args) {
		Student a = new Student("Chau", 21, 1.7f);
		System.out.println("University from class: " + Student.universityName);
		System.out.println("University fron instance: " + a.universityName);
		System.out.println("Total from class: " + Student.total);
		Student b = new Student("Long", 24, 1.7f);
		System.out.println("Total from instance: " + b.total);
		Student.getInfoUniversity();
	}

}
