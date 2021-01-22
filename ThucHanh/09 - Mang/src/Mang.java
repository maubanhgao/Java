
public class Mang {

	public static void main(String[] args) {
		String[] cars01;
		String[] cars02 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars02);
		// [Ljava.lang.String;@7852e922
		System.out.println(cars02[3]);
		//Mazda
		cars02[1] = "Nguyen";
		System.out.println(cars02[1]);
//		Nguyen
		for (int i = 0; i < cars02.length; i++) {
			System.out.println(cars02[i]);
		}
		System.out.println("-------------");
		for (String i : cars02) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		int[][] number = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0 ; i < number.length; i++) {
			for (int j = 0 ; j < number[i].length; j++) {			
				System.out.println(number[i][j]);
			}
		}
		
	}

}
