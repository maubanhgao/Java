package toantu2cham_54;

public class App {

	/*
	 * Xử lý giá trị của tham số a và b. Lúc này chúng ta chưa biết hàm accept(a,b)
	 * trả về giá trị gì, vì nó chỉ là một hàm trừu tượng chưa có thân hàm. Chúng ta
	 * sẽ cung cấp thân hàm cho phương thức MyFunction.accept() trong hàm main().
	 */
	public int action(int a, int b, MyFunction func) {
		return func.accept(a, b);
	}

	public static void main(String[] args) {
		App app = new App();
		// tạo đối tượng nặc danh addFunc và cung cấp thân hàm cho hàm accept()
		// bây giờ hàm accept() sẽ có thân hàm giống như hàm MyUtils.add().
		// nghĩa là hệ thống copy hàm MyUtils.add() như một bản cài đặt
		// cho hàm accept()
		MyFunction addFunc = MyUtils::add;
		int c1 = app.action(10, 2, addFunc);
		System.out.println("Tong cua 2 so: " + c1);
		
		MyFunction minusFunc = MyUtils::minus;
		int c2 = app.action(10, 2, minusFunc);
		System.out.println("Hieu cua 2 so : " + c2);
		
		MyFunction minFunc = Math::min;
		int c3 = app.action(10, 2, minFunc);
		System.out.println("Min: " + c3);
		
		MyFunction maxFunc = Math::max;
		int c4 = app.action(10, 2, maxFunc);
		System.out.println("Max : " + c4);
	}

}
