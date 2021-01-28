package streamprimitive_1;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamExample_01 {

	public static void main(String[] args) {
		// Tạo Stream cho những kiểu primitive
		IntStream.range(1, 4).forEach(System.out::println);
		System.out.println("------------------------");
		IntStream.range(1, 2).forEach(System.out::println);
		System.out.println("------------------------");
		DoubleStream.of(1, 2, 3).forEach(System.out::println);
		System.out.println("------------------------");
		LongStream.range(1, 4).forEach(System.out::println);
		System.out.println("------------------------");
		LongStream.of(1, 2, 3).forEach(System.out::println);
	}

}
