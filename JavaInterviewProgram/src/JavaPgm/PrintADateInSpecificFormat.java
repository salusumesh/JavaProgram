package JavaPgm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintADateInSpecificFormat {
//22. How do you print a date in specific format in Java?
	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date); // 06-23-2020
	}
	 
}
