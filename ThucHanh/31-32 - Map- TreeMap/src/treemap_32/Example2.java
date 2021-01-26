package treemap_32;

import java.util.Map;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Before invoking remove() method");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
		map.remove(102);
		System.out.println("--------------");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}

}
