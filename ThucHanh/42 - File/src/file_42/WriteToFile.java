package file_42;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWrite = new FileWriter("fileName.txt");
			myWrite.write("Files in Java might be tricky, but it is fun enough!");
			myWrite.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
