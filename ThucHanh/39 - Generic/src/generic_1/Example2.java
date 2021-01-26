package generic_1;

class GenericMethodTest {
	public static <E> void printArrayGeneric(E[] inputArrayGeneric) {
		// display array element
		for (E elementGeneric : inputArrayGeneric) {
			System.out.printf("%s ", elementGeneric);
		}
		System.out.println();
	}
}

public class Example2 {

	public static void main(String[] args) {
		GenericMethodTest exeee = new GenericMethodTest();
		// Create arrays of Integer, Double and Character
		Integer[] intArrayGeneric = { 2, 4, 6, 8, 10 };
		Double[] doubleArrayGeneric = { 2.1, 3.2, 4.3, 5.4 };
		Character[] charArrayGeneric = { 'L', 'E', 'V', 'U', 'O' };
		
		 System.out.println("Array intArrayGeneric contains:");
		 exeee.printArrayGeneric(intArrayGeneric);   // pass an Integer array

         System.out.println("\nArray doubleArray contains:");
         exeee.printArrayGeneric(doubleArrayGeneric);   // pass a Double array

         System.out.println("\nArray characterArray contains:");
         exeee.printArrayGeneric(charArrayGeneric); 
	}

}
