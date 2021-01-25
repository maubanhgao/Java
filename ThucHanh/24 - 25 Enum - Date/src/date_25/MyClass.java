package date_25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class MyClass {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		//create a date object
		System.out.println(myObj); // 2021-01-25
		// display the current date
		LocalTime time = LocalTime.now();
		System.out.println(time); // 11:05:28.732
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime); //2021-01-25T11:06:35.471
		
	}

}
