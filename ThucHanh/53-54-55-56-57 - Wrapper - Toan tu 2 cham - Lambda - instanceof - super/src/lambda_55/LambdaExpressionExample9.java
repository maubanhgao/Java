package lambda_55;

public class LambdaExpressionExample9 {

	public static void main(String[] args) {
		// ví dụ Thread không sử dụng biểu thức lambda
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread1 is running...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		// ví dụ Thread sử dụng biểu thức lambda
		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
