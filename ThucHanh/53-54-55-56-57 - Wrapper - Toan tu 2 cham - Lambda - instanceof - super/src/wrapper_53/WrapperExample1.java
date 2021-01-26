package wrapper_53;

public class WrapperExample1 {

	public static void main(String[] args) {
		// Đổi int thành Integer
		int a = 20;
		// đổi int thành Integer
		Integer i = Integer.valueOf(a);
		// autoboxing, tự động đổi int thành Integer trong nội bộ trình biên dịch
		Integer j = a;
		System.out.println(a + " " + i + " " + j);
	}

}
