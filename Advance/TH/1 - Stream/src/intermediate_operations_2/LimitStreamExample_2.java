package intermediate_operations_2;

import java.util.Arrays;
import java.util.List;

public class LimitStreamExample_2 {

	public static void main(String[] args) {
		// limit() returns a stream consisting of the elements of this stream, truncated
		// to be no longer than maxSize in length
		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		data.stream().skip(1).limit(3).forEach(System.out::println);
	}

}
