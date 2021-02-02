package properties_60;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample2 {

	public static void main(String[] args) {
		// get system properties
		Properties properties = System.getProperties();
		Set set = properties.entrySet();
		// show system properties
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
