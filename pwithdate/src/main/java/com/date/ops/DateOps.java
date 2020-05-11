package com.date.ops;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOps {
	public static void main(String[] args) {
		/**
		 * JSR 310
		 */
		pWithDateApi();
		pWithDuration();
		pWithPeriod();

	}

	private static void pWithPeriod() {
		System.out.println("---------------------------------------");

		Period periodOfTwentyDays = Period.ofDays(20);
		System.out.println("this is a period(days) : " + periodOfTwentyDays.getDays());

		// chronology ISO
		Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
		System.out.println("this is a period(days) : " + oneYearTwoMonthsThreeDays.getDays());
		System.out.println("this is a period(months) : " + oneYearTwoMonthsThreeDays.getMonths());
		System.out.println("this is a period(year) : " + oneYearTwoMonthsThreeDays.getYears());

		//Application : count age 
		LocalDate startDateInclusive = LocalDate.of(1923, 5, 12);
		LocalDate endDateExclusive = LocalDate.of(2020, 5, 12);

		Period between = Period.between(startDateInclusive, endDateExclusive);
		System.out.println("Person's age : "+between.getYears());

	}

	public static void pWithDuration() {
		System.out.println("---------------------------------------");
		// create duration ...

		Duration oneHoure = Duration.ofHours(1);
		System.out.println("Seconds : " + oneHoure.getSeconds());

		Duration minutes = Duration.ofMinutes(1);
		System.out.println("Seconds : " + minutes.getSeconds());

		Duration oneHoure1 = Duration.of(1, ChronoUnit.DAYS);
		System.out.println("Seconds : " + oneHoure1.getSeconds());

		// count seconds between dates ...

		LocalDateTime tempS = LocalDateTime.of(2020, Month.JANUARY, 1, 12, 01);
		LocalDateTime tempE = LocalDateTime.of(2020, Month.FEBRUARY, 1, 12, 01);

		Duration between = Duration.between(tempS, tempE);

		System.out.println("Seconds between start datetime : " + tempS + " and end datetime : " + tempS);
		System.out.println("equals : " + between.getSeconds());

	}

	public static void pWithDateApi() {
		System.out.println("---------------------------------------");
		System.out.println("[CURRENT TIME ]");
		System.out.println(LocalTime.now());

		System.out.println("[CURRENT DATE ]");
		System.out.println(LocalDate.now());

		System.out.println("[CURRENT DATETIME]");
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now(ZonedDateTime.now().getZone()));
		System.out.println(LocalDateTime.now(Clock.systemUTC()));

		System.out.println("[CURRENT WITH FORMATTER ]");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime current = LocalDateTime.now();

		System.out.println(dtf.format(current));

	}
}
