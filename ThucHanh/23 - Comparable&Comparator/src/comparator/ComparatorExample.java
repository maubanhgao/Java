package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// create list student
		List<Student> listStudents = new ArrayList<Student>();
		// add students to list
		listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 24, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASc");
        Collections.sort(listStudents, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
        
        //show lists students
        for (Student student : listStudents) {
        	System.out.println(student);
        }
        
        // sort list student by it's age ASC
        System.out.println("sort list student by it's age ASX");
        
        Collections.sort(listStudents, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() > o2.getAge() ? 1 : -1;
			}}
        );
        // show list students
        for (Student student : listStudents) {
        	System.out.println(student.toString());
        }
	}

}

/*
 sort list student by it's name ASc
Student [id=2, name=Hoa, age=24, address=Hanoi]
Student [id=3, name=Phu, age=20, address=Hanoi]
Student [id=4, name=Quy, age=22, address=Hanoi]
Student [id=1, name=Vinh, age=19, address=Hanoi]
sort list student by it's age ASX
Student [id=1, name=Vinh, age=19, address=Hanoi]
Student [id=3, name=Phu, age=20, address=Hanoi]
Student [id=4, name=Quy, age=22, address=Hanoi]
Student [id=2, name=Hoa, age=24, address=Hanoi]
 */
