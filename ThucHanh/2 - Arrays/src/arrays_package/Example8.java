package arrays_package;

import java.util.Arrays;
import java.util.List;

/*]
 * Phương thức **asList()** được sử dụng để tạo một danh sách từ một mảng được chỉ định.
 * Một số thao tác trong danh sách không được thực hiện trên Wrapper, 
 * như thêm hoặc loại bỏ các yếu tố khỏi danh sách, 
 * chỉ có thể đọc hoặc ghi đè lên các phần tử.
 */
public class Example8 {

	public static void main(String[] args) {
		// an array of Integer
		Integer arr[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };
		//create a wrapper list over arr[]
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		
//		list.add(10); // UnsupportedOperationException
//		list.remove(10); // UnsupportedOperationException
		
		list.set(0, 5);// overwrite the elements
		System.out.println(list);
	}

}
