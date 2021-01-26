package get_set_50;

public class ClassMainExample_Clone {

	public static void main(String[] args) {
		Example_Clone a = new Example_Clone();
		int[] mang = { 1, 2, 3 };
		a.setArray(mang);
		a.displayArray();
		mang[1] = 3;
		a.displayArray();
	}

}
