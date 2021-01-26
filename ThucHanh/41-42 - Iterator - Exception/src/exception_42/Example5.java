package exception_42;

public class Example5 {
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 * Về finalize, nó là một phương thức được sử dụng để thực hiện dọn dẹp xử lý ngay trước khi đối tượng là rác được thu thập.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalze() is called!");
	}

	public static void main(String args[]) {
		Example5 f1 = new Example5();
		f1 = null;
		System.gc();
	}
}
