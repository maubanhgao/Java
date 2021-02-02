package arrays_package;

import java.util.Arrays;

/*
 * Phương thức **fill()** được sử dụng để gán giá trị xác định cho mỗi phần tử của một mảng. 
 * Phương thức này hữu ích trong việc khởi tạo tất cả các phần tử của một mảng với một giá trị.
 */
public class Example5 {

	public static void main(String[] args) {
		// an array of int
		int[] i = new int[5];
		Arrays.fill(i, 10);
		// assigns 10 to each element of the array
		System.out.println(Arrays.toString(i));

		// an array of double
		double[] d = { 12.5, 14.8, 45.9, 23.5 };
		Arrays.fill(d, 53.5);
		// assignes 53.5 to each element of the array
		System.out.println(Arrays.toString(d));

		// An array of boolean
		boolean[] bln = new boolean[5];
		Arrays.fill(bln, true);
		// Assigns true to each element of the array
		System.out.println(Arrays.toString(bln));

		// An array of char
		char[] c = new char[10];
		Arrays.fill(c, 'P'); // Assigns P to each element of the array
		System.out.println(Arrays.toString(c));

		// An array of String
		String[] str = { "Java", "Concepts", "basic java", "Arrays Class" };
		Arrays.fill(str, "value"); // Assigns value to each element of the array
		System.out.println(Arrays.toString(str));
	}

}
