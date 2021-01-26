package file_42;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File myObj = new File("myfile.txt");
		try {
			if(myObj.createNewFile()) {
				System.out.println("Create file: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
