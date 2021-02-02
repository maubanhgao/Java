package arrays_package;

import java.util.Arrays;

/*
 * Phương thức **copyOfRange()** được sử dụng để sao chép một phần của một mảng vào mảng khác cùng kiểu. 
 * Trong khi sao chép mảng mới có thể được cắt ngắn hoặc đệm với các giá trị mặc định để có được chiều dài yêu cầu.
 */
public class Example7 {

	public static void main(String[] args) {
		// an array of int
		int[] i = { 1, 21, 15, 48, 79 };
		// copying some part of array i into array il;
		int[] il = Arrays.copyOfRange(i, 2, 7);
		System.out.println(Arrays.toString(il));

		// An array of double
		double[] d = { 12.5, 45.8, 56.2, 47.9, 23.6, 89.5 };
		// Copying some part of array d into array d1
		double[] dl = Arrays.copyOfRange(d, 2, 5);
		System.out.println(Arrays.toString(dl));

		// An array of boolean
		boolean[] bln = { true, false, true, true, false };
		// Copying some part of array bln into array bln1
		boolean[] bln1 = Arrays.copyOfRange(bln, 1, 8);
		System.out.println(Arrays.toString(bln1));

		// An array of char
		char[] c = { 'X', 'B', 'Z', 'H', 'I', 'J' };
		// Copying some part of array c into array c1
		char[] c1 = Arrays.copyOfRange(c, 2, 4);
		System.out.println(Arrays.toString(c1));

		// An array of String
		String[] str = { "java", "j2ee", "struts", "hibernate" };
		// Copying some part of array str into array str1
		String[] str1 = Arrays.copyOfRange(str, 4, 8);
		System.out.println(Arrays.toString(str1));

	}

}
