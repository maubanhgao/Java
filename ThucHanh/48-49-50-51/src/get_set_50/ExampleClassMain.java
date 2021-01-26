package get_set_50;

public class ExampleClassMain {

	public static void main(String[] args) {
		Example a = new Example();
		int[] mang = { 1, 2, 3 };
		a.setArray(mang);
		a.displayArray();
		mang[1] = 3;
		a.displayArray();
	}

}
