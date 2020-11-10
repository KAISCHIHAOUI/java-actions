package com.core.map.opertations;

import java.util.Arrays;

public class Iterators {
	  public static void main(String[] args)
	    {
	        int table[] = { 1, 2, 3, 4, 5 };
	 
	        // 1. using boxed() for converting IntStream to Stream<Integer>
	        Iterable<Integer> iterable1 = () -> Arrays.stream(table)
	                                                .boxed()
	                                                .iterator();
	        System.out.println(iterable1);
	 
	        // 2. Using mapToObj() for converting IntStream to Stream<Integer>
	        Iterable<Integer> iterable2 = () -> Arrays.stream(table)
	                                                .mapToObj(Integer::valueOf)
	                                                .iterator();
	        iterable2.forEach(System.out::println);
	 
	        // 3. Implicit conversion from IntStream to Stream<Integer>
	        Iterable<Integer> iterable3 = () -> Arrays.stream(table)
	                                                .iterator();
	 
	        iterable3.forEach(System.out::println); 
	    }
}
