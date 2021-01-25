package date_25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {

	public static void main(String[] args) {
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateTime);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateTime.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);

		// Before formatting: 2021-01-25T11:13:34.093
		// After formatting : 25-01-2021 11:13:34

		DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// After formatting date:
		// Value(DayOfMonth,2)'-'Value(MonthOfYear,2)'-'Value(YearOfEra,4,19,EXCEEDS_PAD)
		System.out.println("After formatting date: " + myFormatDate);

	}

}
