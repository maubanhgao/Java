package lambda_55;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("C++");
		list.add("Python");
		list.forEach(element -> System.out.println(element));
		System.out.println("------------------------");

	}

}
