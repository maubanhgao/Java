package streamprimitive_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Tạo Stream sang các cấu trúc dữ liệu khác
public class ConvertFromStreamExample_03 {

	// Get Collection using stream.collections.toList()
	public static void getCollectionUsingStreamCollection() {
		Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
		List<String> languages = stream.collect(Collectors.toList());
		System.out.println(languages);
	}

	// Get arrays using stream.toArray(EntryType::new)
	public static void getArrayUsingStreamToArray() {
		Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
		String[] languages = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(languages));
	}

	public static void main(String[] args) {
		getCollectionUsingStreamCollection();
		System.out.println("----------------");
		getArrayUsingStreamToArray();
	}

}
