package lambda_55;

// xu dug lambda

//tùy chọn, nó đánh dấu lớp Drawable chỉ được có 1 method trừu tượng
@FunctionalInterface
interface DrawableFunc {
	public void draw();
}

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		int width = 10;

		// sử dụng biểu thức lambda
		DrawableFunc d2 = () -> {
			System.out.println("Drawing " + width);
		};
		
		d2.draw();
	}

}
