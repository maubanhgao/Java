package arrays_package;

import java.util.Arrays;

/*
 * Phương thức **equals()** được sử dụng để so sánh hai mảng có bằng nhau hay không. 
 * Phương pháp này lấy hai mảng làm tham số và trả về true nếu cả hai mảng có cùng một số phần tử và các cặp tương ứng của các phần tử của cả hai mảng đều bằng nhau.
 */
public class Example9 {

	public static void main(String[] args) {
		String[] s1 = { "java", "j2ee", "struts", "hibernate" };
		String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };
		String[] s3 = { "java", "j2ee", "struts", "hibernate" };
		String[] s4 = { "java", "struts", "j2ee", "hibernate" };

		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.equals(s1, s3));
		System.out.println(Arrays.equals(s1, s4));

		System.out.println("---------------------");
		/*
		 * Nếu bạn muốn so sánh hai mảng có cùng một số phần tử và cùng một tập hợp các
		 * phần tử, nhưng ở các vị trí khác nhau, thì bạn có thể thực hiện như sau:
		 * trước tiên sắp xếp cả hai mảng bằng cách sử dụng phương thức Arrays.sort() và
		 * sau đó so sánh bằng cách sử dụng phương thức Arrays.equals().
		 */
		String[] s1s = { "java", "j2ee", "struts", "hibernate" };
		String[] s2s = { "hibernate", "struts", "j2ee", "java" };
		System.out.println(Arrays.equals(s1s, s2s)); // false
		Arrays.sort(s1s);
		Arrays.sort(s2s);
		System.out.println(Arrays.equals(s1s, s2s));
		
	}

}
