package streamprimitive_1;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//Tạo Stream từ các cấu trúc dữ liệu khác
public class ConvertToStreamExample_02 {

	// Generate streams from Arrays using stream or Stream.of
	public static void streamFromArray() {
		String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };

		// Get Stream using the Arrays.stream
		Stream<String> testStream1 = Arrays.stream(languages);
		testStream1.forEach(x -> System.out.println(x));

		System.out.println("\n---------");
		// Get Stream using the Stream.of
		Stream<String> testStream2 = Stream.of(languages);
		testStream2.forEach(x -> System.out.println(x));
	}

	// Generate Streams from Collections
	public static void streamUsingGenerate() {
		Stream<String> stream = Stream.generate(() -> "gbcoder abc").limit(3);
		String[] testStrArr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(testStrArr));
	}

	public static void streamUsingIterate() {
		Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
		iterateNumbers.forEach(System.out::println);
	}

	public static void main(String[] args) {
		String str = "Welcome,to,gpcoder";
		Pattern.compile(",").splitAsStream(str).forEach(System.out::println);
		System.out.println("--------------------");
		streamFromArray();
		System.out.println("--------------------");
		streamUsingGenerate();
		System.out.println("--------------------");
		streamUsingIterate();
	}

}
