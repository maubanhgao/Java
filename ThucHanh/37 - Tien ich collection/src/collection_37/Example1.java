package collection_37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// Phuong thuc addAll();

		List<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "element 1", "element 2", "element 3");
		System.out.println(list1);
		System.out.println("----------------------");

		List<String> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		Collections.sort(list2); // phai sort truoc khi su dung binarySearch
		int index = Collections.binarySearch(list2, "four");
		System.out.println(index); // 1 = true

		System.out.println("--------------------");
		try {
			// creating object of Source list and destination List
			List<String> srclst = new ArrayList<String>(3);
			List<String> destlst = new ArrayList<String>(3);
			// Adding element to srclst
			srclst.add("Ram");
			srclst.add("Gopal");
			srclst.add("Verma");

			// Adding element to destlst
			 destlst.add("1");
			 destlst.add("2");
			 destlst.add("3");
			// copy element into destlst
			Collections.copy(destlst, srclst);

			// printing the srclst
			System.out.println("Value of source list: " + srclst);

			// printing the destlst
			System.out.println("Value of destination list: " + destlst);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
	}

}
