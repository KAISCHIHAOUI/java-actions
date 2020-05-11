package com.date.ops;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateOps {
	public static void main(String[] args) {
		/**
		 * JSR 310
		 */	
         pWithDateApi();

	}


     public static void pWithDateApi()
     {
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
