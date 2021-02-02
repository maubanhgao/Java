package properties_60;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample1 {

	public static void main(String[] args) throws IOException {
		// create reader object
		FileReader reader = new FileReader("db.properties");
		// create properties object
		Properties properties = new Properties();
		properties.load(reader);
		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("password"));
	}

}
