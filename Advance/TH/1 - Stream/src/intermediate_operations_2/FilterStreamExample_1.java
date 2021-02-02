package intermediate_operations_2;

import java.util.stream.Stream;

public class FilterStreamExample_1 {
	// Ví dụ sử dụng để lọc các số chia hết cho 3.
	public static void main(String[] args) {
		// filter() operation helps eliminate elements based on certain criteria
		Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);
	}

}
