package lambda_55;

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionExample6 {

	public static void main(String[] args) {
		// không sử dụng từ khóa return
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// sử dụng từ khóa return
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}

}
