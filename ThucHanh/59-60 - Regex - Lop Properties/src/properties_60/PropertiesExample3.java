package properties_60;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample3 {

	public static void main(String[] args) throws IOException {
		// create properties object
		Properties properties = new Properties();
		// add property into file properties object
		properties.setProperty("user", "admin");
		properties.setProperty("password", "admin123");
		// write properties to a file
		properties.store(new FileWriter("into.properties"), "File properties");
		System.out.println("save success");
	}

}
