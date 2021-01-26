package final_46;

final class Student {
	public int age = 12;

	final void show() {
		System.out.println("final nek");
	}
}

//class Employee extends Student { // final class khong the extends
//	final void show() { // final method khong the Override
//		
//	}
//}

public class Example1 {

	public static void main(String[] args) {
		final double PI = 3.1415926535897;
		int r = 3;
		System.out.print(2 * r * PI);
		Student st = new Student();
		System.out.println(st.age);
		st.show();
	}

}
