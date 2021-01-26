package map_31;

import java.util.HashMap;
import java.util.Map;

enum Test {
	
}
public class Example1 {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
	    // Add keys and values (Country, City)
		hashMap.put("England", "London");
		hashMap.put("Germany", "Berlin");
		hashMap.put("Norway", "Oslo");
		hashMap.put("USA", "Washington DC");
	    System.out.println(hashMap);
	    String el1 = hashMap.get("USA");
	    System.out.println(el1);
	    
	    Map<String, String> mapA = new HashMap<>();
	    mapA.put("key1", "value1");
	    mapA.put("key2", "value2");
	    Map<String, String> mapB = new HashMap<>();
	    mapB.putAll(mapA);
	    System.out.println(mapB);
	    hashMap.remove("England");
	    System.out.println(hashMap);
	    System.out.println(hashMap.size());
	    for(String el : hashMap.keySet()) {
	    	System.out.println(el);
	    }
		
	    boolean hasKey = hashMap.containsKey("Germany");
	    boolean hasValue = hashMap.containsValue("Berlin");
	    System.out.println(hasKey);
	    System.out.println(hasValue);
	    
	    System.out.println("MapB: ");
	    System.out.println(mapB);
	    mapB.put(null, "New York");
	    System.out.println(mapB);
	    System.out.println("------------");
	    for(String key : mapB.keySet()) {
	    	System.out.println(key);
	    }
	    System.out.println("---------------");
	    for(String val : mapB.values()) {
	    	System.out.println(val);
	    }
	    System.out.println("-----------");
	    for(Map.Entry m:mapB.entrySet()) {
	    	System.out.println(m.getKey() + ": " + m.getValue());
	    }
	}

}
