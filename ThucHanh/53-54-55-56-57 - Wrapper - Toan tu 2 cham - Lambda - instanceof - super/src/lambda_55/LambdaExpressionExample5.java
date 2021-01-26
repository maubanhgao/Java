package lambda_55;

interface Operation {
	public int add(int a, int b);
}

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		Operation operation = (a, b) -> {
			return a + b;
		};

		// Operation operation2 = (int a, int b) -> {
		// return a + b;
		// };
		System.out.println("a + b = " + operation.add(10, 20));
		// System.out.println("a + b = " + operation2.add(10, 20));
	}

}
