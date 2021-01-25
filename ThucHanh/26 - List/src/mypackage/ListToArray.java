package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");
		//Chuyển tập hợp ArrayList thành tập hợp Array bằng phương thức toArray
		Object[] objects = list.toArray();
		System.out.println(objects);
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Object) {
				System.out.println("Kieu obj " + objects[i]);
			} else if (objects[i] instanceof String) {
				System.out.println("Kieu string " + objects[i]);
			} else
				System.out.println("chua biet");
		}
		
		//Chuyển Array thì một ArrayList bằng phương thức asList
		String[] values = new String[] {"one", "two", "three" };
		
		List<String> arrayList = (List<String>) Arrays.asList(values);
		
		// Chuyển một ArrayList sang Set bằng phương thức addAll
		
		List<String> arrList = new ArrayList<>();

		arrList.add("element 1");
		arrList.add("element 2");
		arrList.add("element 3");
		arrList.add("element 3");
		
		Set<String> set = new HashSet<>();
		set.addAll(arrList);
	}

}
