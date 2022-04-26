package java8Features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class GetDay {

	public static void main(String[] args) {
		
		
		//program to convert days using numbers
		
		LocalTime time = LocalTime.now();
		
		 DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		 
		 LocalDate date = LocalDate.now();
	        System.out.println("current date is :" +
	                            date); 
		 
		 LocalDateTime dateTime = LocalDateTime.now();
		 
			System.out.println(dateTime);
			
		 System.out.println(dateTime.getDayOfWeek());
		 
		 LocalDate ld=date.plus(2,ChronoUnit.DAYS);
		 System.out.println(ld);
		 
	  System.out.println("-------------------------------------------------");       
		 System.out.println(DayOfWeek.of(7-2));
			   
		
	}
}
