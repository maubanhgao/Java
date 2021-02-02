package arrays_package;

import java.util.Arrays;

/*
 * Phương thức **binarySearch()** được sử dụng để tìm vị trí của phần tử trong mảng bằng phương thức tìm kiếm nhị phân (**binary search**).
 *  **Các phần tử trong mảng phải được sắp xếp trước khi gọi phương thức này**. 
 * Nếu chưa sắp xếp, kết quả sẽ không chính xác.
 */
public class Example4 {

	public static void main(String[] args) {
		// An array of int
		int[] i = { 24, 13, 45, 37, 84, 13, 28 };
		// Sorting the int array
		Arrays.sort(i);
		// Printing sorted array
		System.out.println(Arrays.toString(i));

		// searching the value
		System.out.println(Arrays.binarySearch(i, 37));
		System.out.println(Arrays.binarySearch(i, 13));
		System.out.println(Arrays.binarySearch(i, 1));
		System.out.println(Arrays.binarySearch(i, 55));

		// An array of char
		char[] c = { 'X', 'n', 'F', 's', 'D', 'J', 'j', 'F' };

		// Sorting the char array
		Arrays.sort(c);

		// Printing Sorted array
		System.out.println(Arrays.toString(c));
		// Searching the character
		System.out.println(Arrays.binarySearch(c, 'F'));
		System.out.println(Arrays.binarySearch(c, 'J'));
		System.out.println(Arrays.binarySearch(c, 'H'));
		System.out.println(Arrays.binarySearch(c, 'Z'));

		// An array of String
		String[] str = { "First", "second", "Third", "second", "Four", "fifth" };

		// Sorting the String array
		Arrays.sort(str);

		// Printing Sorted array
		System.out.println(Arrays.toString(str));
		// Searching the string in the array
        System.out.println(Arrays.binarySearch(str, "Third"));
        System.out.println(Arrays.binarySearch(str, "second"));
        System.out.println(Arrays.binarySearch(str, "One"));
        System.out.println(Arrays.binarySearch(str, "sixth"));
	}

}
