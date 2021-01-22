package stringpack;

public class Strings {

	public static void main(String[] args) {
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		String txt02 = " Hello World";
		System.out.println("LowerCase : " + txt02.toLowerCase());
		System.out.println("UpperCase : " + txt02.toUpperCase());
		String txt03 = "Please locate where 'locate' occurs!";
		System.out.println("Index at oppsite 3 : " + txt03.indexOf(3));
		System.out.println("Index at word is 'w' : " + txt03.indexOf("where"));
		String firstName = "John";
		String lastName = "Doe";
		System.out.println("Noi chuoi cach 1: " + firstName + " " + lastName);
		System.out.println("Noi chuoi cach 2: " + firstName.concat(lastName));
//		String text = " le vu" nguyen"; // Error 
		String txt04 = "le vu\" nguyen";
		System.out.println("In ký tự đặc biệt: " + txt04);
		String txt05 = "Hello\nWorld!";
		System.out.println("In ký tự đặc biệt " + txt05);
		String txt06 = "Hello\tWorld!";
		System.out.println("In ký tự đặc biệt " + txt06);
		String txt07 = "Hello\bWorld!";
		System.out.println("In ký tự đặc biệt " + txt07);
		String x = "10";
		String y = "20";
		String z = x + y;   // z là chuỗi 1020 
		System.out.println("Cong string: " + z);
	}

}
