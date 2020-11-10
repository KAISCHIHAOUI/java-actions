package com.core.map.opertations;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class Conditionalifelse {

	public static void main(String[] args) {

		List<Integer> listone = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		List<Integer> listtwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		// even odd without filter
		listone.stream().forEach(y -> {
			if (y.intValue() % 2 == 0) {
				System.out.println(y + " : even number");
			} else {
				System.out.println(y + " : odd number");
			}

		});

		// even odd with filter
		Stream<Integer> evenIntegers = listtwo.stream().filter(i -> i.intValue() % 2 == 0);
		Stream<Integer> oddIntegers = listtwo.stream().filter(i -> i.intValue() % 2 != 0);

		evenIntegers.forEach(System.out::println);
		oddIntegers.forEach(System.out::println);
		
	}

}
