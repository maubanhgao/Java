import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Example5 {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();

		deque.add("element 0");
		deque.add("element 1");
		deque.add("element 2");

		Iterator<String> iterator = deque.iterator();
		while(iterator.hasNext()){
		  String element = iterator.next();
		  System.out.println(element);
		}
		System.out.println("------------------");
		for(String element : deque) {
		    System.out.println(element);
		}
	}

}
