package lambda_55;

// Khong xu dung lambda
interface Drawable {
	public void draw();
}

public class LambdaExpressionExample1 {
	public static void main(String[] args) {
		int width = 10;
		// không sử dụng biểu thức lambda, 
        // phải sử dụng lớp nặc danh để cài đặt phương thức draw() cho Drawable
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		
		d.draw();
	}
}
