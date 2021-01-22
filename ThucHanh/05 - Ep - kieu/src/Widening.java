
public class Widening {

	public static void main(String[] args) {
		int i = 100;
		long l = i; // không yêu cầu chỉ định ép kiểu 
		float f = l; // không yêu cầu chỉ định ép kiểu
		System.out.println("Nới rộng (wedening) - Chuyển đổi kiểu ngầm định inplicit");
		System.out.println("Gía trị int: " + i);
		System.out.println("Gía trị long " + l);
		System.out.println("Gía trị Float " + f);
		System.out.println("Thu hẹp (narrowing) - Chuyển đổi kiểu tường minh explicit");
//		Gía trị int: 100
//		Gía trị long 100
//		Gía trị Float 100.0
		double d = 1000.4;
		long l01 = (long) d; // yêu cầu chỉ định kiểu dữ liệu long
		int i01 = (int) l01;
		System.out.println("Gía trị double " + d);
		System.out.println("Gía trị Long " + l01);
		System.out.println("Gía trị Int " + i01);
//		Gía trị double 1000.4
//		Gía trị Long 1000
//		Gía trị Int 1000
		System.out.println("Ép kiểu char => số => ngầm định implicit");
		char a = 'A';
		int b = a; // imlicit (widening)
		char c = (char) b; // explicit (narrowing)
		System.out.println(b);
		System.out.println(c);
	}

}
