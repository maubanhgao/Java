package vector_2;

import java.util.Collections;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * **Là một** **cấu trúc dữ liệu** 
		 * có thể chứa các phần tử trùng lặp. 
		 * Duy trì thứ tự của phần tử được thêm vào. 
		 * Vector là synchronized.
		 */
		Vector<String> list = new Vector<String>();
		list.add("Nguyen");
        list.add("Collection");
        list.add("Collection");
        list.add("ASCF");
        list.add("Hanh phuc");
        System.out.println(list);
        
        list.remove(1);
        list.remove(1);
        System.out.println(list);
        list.add("Meo meo");
        list.add("Hoa hoa");
//        Collections.sort(list);
        System.out.println(list);
//        System.out.println(Collections.binarySearch(list, "Nguyen"));
	}

}
