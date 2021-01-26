package list_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Nguyen ");
		list.add("Java ");
		list.add("Collection List ");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
	}

}
