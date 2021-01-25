package sortedset_28;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example3 {
	// SortedSet cung cấp cho chúng ta phương thức headSet() trả về một SortedSet
	// mới với tất cả các phần tử nhỏ hơn phần tử truyền vào.
	public static void main(String[] args) {
		SortedSet sortedSet = new TreeSet();
		sortedSet.add("a");
		sortedSet.add("b");
		sortedSet.add("c");
		sortedSet.add("d");
		sortedSet.add("e");
		SortedSet headSet = sortedSet.headSet("c");
		System.out.println(headSet);
		// [a, b] => một SortedSet mới là a và b vì a và b là nhỏ hơn giá trị c 
		SortedSet tailSet = sortedSet.tailSet("b");
		System.out.println(tailSet);
		// [b, c, d, e]

	}

}
