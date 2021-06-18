package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Date/Time App");
		
		//p.443 
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current dateTime: " +currentTimestamp);
		System.out.println();
		System.out.println("Current Date: " +currentDate);
		
		LocalDate halloween = LocalDate.of(2021, 10, 31);
		System.out.println();
		System.out.println("Halloween: " +halloween);
		System.out.println();
		LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
		System.out.println("Christmas: " +christmas);
		System.out.println();
		LocalDate july4th = LocalDate.parse("2021-07-04");
		System.out.println("July 4th: " +july4th);
		System.out.println();
		LocalDateTime laborDay = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day: " +laborDay);
		System.out.println();
		
		//p.445
		System.out.println("Get dot operators");
		System.out.println("getYear(): " +currentTimestamp.getYear());
		System.out.println("getMonth(): " +currentTimestamp.getMonth());
		System.out.println("getMonthValue(): " +currentTimestamp.getMonthValue());
		System.out.println("getDayOfMonth(): " +currentTimestamp.getDayOfMonth());
		System.out.println("getDayOfYear(): " +currentTimestamp.getDayOfYear());
		System.out.println("getDayOfWeek(): " +currentTimestamp.getDayOfWeek());
		System.out.println("getHour(): " +currentTimestamp.getHour());
		System.out.println("getMinute(): " +currentTimestamp.getMinute());
		System.out.println("getSecond(): " +currentTimestamp.getSecond());
		System.out.println("getNano(): " +currentTimestamp.getNano());
		
		System.out.println();
		if (currentTimestamp.isBefore(laborDay)) {
			System.out.println("Yep. " +currentTimestamp+ " is before " +laborDay);
			System.out.println();
		}
		if (christmas.isAfter(halloween)) {
			System.out.println("What are you, dumb? Yep, it's after.");
			System.out.println();
		}
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));
		System.out.println();
		
		//p.449
		//new date 1 month from today
		LocalDateTime monthLaterThanToday = currentTimestamp.withMonth(7);
		System.out.println(monthLaterThanToday);
		System.out.println();
		
		//p.451 10 weeks from today
		LocalDateTime tenWeeks = currentTimestamp.plusWeeks(10);
		System.out.println(tenWeeks);
		System.out.println();
		
		long daysUntilHalloween = currentDate.until(halloween, ChronoUnit.DAYS);
		System.out.println("Days until Halloween: " +daysUntilHalloween);
		System.out.println();
		long daysBetween = ChronoUnit.DAYS.between(july4th, laborDay);
		System.out.println("Days between: " +daysBetween);
		System.out.println();
		
		//p.453
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM);
		System.out.println(formatter.format(currentTimestamp));
		
		System.out.println("Goodbye. Your time is up.");
	}

}
