package java8Features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GetDay {

	public static void main(String[] args) {
		
		
		//program to convert days using numbers
		
		LocalTime time = LocalTime.now();
		
		 DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		 
		 LocalDate date = LocalDate.now();
	        System.out.println("current date is :" +
	                            date); 
	        
	        LocalDate date1 = LocalDate.now();
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int x= s.nextInt();
			if(x<=0) {
				x=x+8;
			}

			System.out.println(DayOfWeek.of(x));

			   
		
	}
}
