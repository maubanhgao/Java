package collection_37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		try { 
			  
            // creating object of List<String> 
            List<String> list = new ArrayList<String>(); 
  
            // populate the list 
            list.add("A"); 
            list.add("B"); 
            list.add("A"); 
            list.add("C"); 
  
            // printing the list 
            System.out.println("Initial Vector :" + list); 
  
            // replacing value 
            // using replaceAll() method 
            Collections.replaceAll(list, "A", "TAJMAHAL"); 
  
            System.out.println("Vector after replace :" + list); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
	}
}
