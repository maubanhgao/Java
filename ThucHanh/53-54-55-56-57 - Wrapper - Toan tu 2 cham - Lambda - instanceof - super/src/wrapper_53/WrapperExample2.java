package wrapper_53;

public class WrapperExample2 {

	public static void main(String[] args) {
		// đổi Integer thành int
		Integer a = new Integer(3);
		// đổi Integer thành int
		int i = a.intValue();
		// unboxing, tự động đổi Integer thành int trong nội bộ trình biên dịch
		int j = a;
		System.out.println(a + " " + i + " " + j);
	}

}
