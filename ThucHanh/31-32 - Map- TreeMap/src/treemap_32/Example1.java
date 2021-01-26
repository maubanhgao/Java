package treemap_32;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(100, "Amit");
		treeMap.put(102, "Ravi");
		treeMap.put(101, "Vijay");
		treeMap.put(103, "Rahul");
		for(Integer key : treeMap.keySet()) {
			System.out.println(key);
		}
		System.out.println("------------");
		for(String val : treeMap.values()) {
			System.out.println(val);
		}
		System.out.println("------------");
		for(Map.Entry m:treeMap.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}

}
