package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDates_Times {

	public static void main(String[] args) {
		
		//1) Création
		/*
		LocalDate ld =LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld1 = LocalDate.of(1980, 12, 10);
		System.out.println(ld1);
		LocalDate ld2 = LocalDate.of(2030, Month.APRIL, 10);
		System.out.println(ld2);
		LocalTime lt1 = LocalTime.of(14, 15);
		System.out.println(lt1);
		LocalDateTime ldt1 = LocalDateTime.of(ld2, lt1);*/
		
		//2)Manipulation
		/*
		LocalDate date = LocalDate.of(2014,1, 20);
		Period period =Period.of(2, 3, 10);
		date = date.plus(period);
		System.out.println(date);*/
		
		/*System.out.println(date);
		date = date.plusYears(2);
		System.out.println(date);*/
		
		//3)Formatting
		
		DateTimeFormatter formatFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.of(2014,1, 20);
		System.out.println(date.format(formatFull));
		DateTimeFormatter formatLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(date.format(formatLong));
		DateTimeFormatter formatMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(date.format(formatMedium));
		DateTimeFormatter formatShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(formatShort));
		System.out.println(formatShort.format(date));
		System.out.println(date);
	}

}
