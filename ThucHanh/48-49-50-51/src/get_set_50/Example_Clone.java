package get_set_50;

public class Example_Clone {
	private int[] array;

	public void setArray(int[] array) {
		this.array = array.clone();
	}
	
	public int[] getArray() {
		return this.array.clone();
	}

	public void displayArray() {
		for (int a : this.array) {
			System.out.print(a);
		}
		System.out.println();
	}
}
