package arrays_package;

import java.util.Arrays;

/*
 * Phương thức **deeprequals()** được sử dụng để so sánh hai **mảng hai chiều** có bằng nhau hay không
 *  thay vì phương thức equals(). 
 * Bởi vì, deepEquals() thực hiện so sánh tất cả các phần tử của mảng con của cả hai mảng.
 */
public class Example10 {

	public static void main(String[] args) {
		String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
		String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
		System.out.println(Arrays.equals(s1, s2)); // false
		System.out.println(Arrays.deepEquals(s1, s2)); // true
	}

}
