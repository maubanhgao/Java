package get_set_50;

public class Example {

	private int[] array;

	public void setArray(int[] array) {
		this.array = array;
	}

	public void displayArray() {
		for (int a : this.array) {
			System.out.print(a);
		}
		System.out.println();
	}
}
