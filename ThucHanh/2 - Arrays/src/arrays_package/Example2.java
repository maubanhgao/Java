package arrays_package;

import java.util.Arrays;

/**
 * Phương thức Arrays.deepToString ()
 *  được sử dụng để nhận được biểu diễn chuỗi của các mảng đa chiều. 
 *  Phương thức này trả về nội dung sâu của mảng được chỉ định. 
 */
public class Example2 {

	public static void main(String[] args) {
		// one dimensional array
		// String[] oneArray = { "welcome", "to", "gpcdoer" };
		String[] oneArray = new String[] { "ONE", "TWO", "THREE", "FOUR", "FIVE" };
		System.out.println("One Dinensional Array : ");
		// printing one dimensional array contents using deepToString() method
		System.out.println(Arrays.toString(oneArray));
		System.out.println(Arrays.deepToString(oneArray));

		String[][] twoDArray = new String[][] { { "ONE", "TWO", "THREE", "FOUR" }, { "FIVE", "SIX", "SEVEN" },
				{ "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" } };
		System.out.println("Two Dimensional Array : ");
		// Printing two dimensional array contents using deepToString() method
		// System.out.println(Arrays.toString(twoDArray)); Error tham chieu
		System.out.println(Arrays.deepToString(twoDArray));
		String[][][] threeDArray = new String[][][] { { { "ONE", "TWO", "THREE" }, { "FOUR", "FIVE", "SIX", "SEVEN" } },
				{ { "EIGHT", "NINE", "TEN", "ELEVEN" }, { "TWELVE", "THIRTEEN", "FOURTEEN" } },
				{ { "FIFTEEN", "SIXTEEN" }, { "SEVENTEEN", "EIGHTEEN", "NINETEEN" }, { "TWENTY", "TWENTY ONE" } } };
		System.out.println("Three Dimensional Array : ");
		// Printing three dimensional array contents using deepToString() method
		System.out.println(Arrays.deepToString(threeDArray));
	}

}
