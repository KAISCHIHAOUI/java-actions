package com.stream.ops;

import java.util.Arrays;

/*
 * STREAM-REDUCE OPS
 */
public class StreamReduce {

	int numbers[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	String[] strings = {"a", "b", "c", "d", "e","f","g","h"};

	/*SUM
	 * int sum = Arrays.stream(numbers).reduce(0,Integer::sum)
	 */
	public int sumOps() {

		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		return sum;
	}
	
	/* MIN-MAX operation
	 * int sum = Arrays.stream(numbers).reduce(0,Integer::min)
	 * int sum = Arrays.stream(numbers).reduce(0,Integer::max)
	 */
	public int minOps() {
		int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);
		return min;
	}

	public int maxOps() {

		int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
		return max;
	}
	/*
	 *  java 8 better String join = String.join(" ",strings)
	 */
	public String joinOps() {
        String join = Arrays.stream(strings).reduce("", (a,b) -> a + " " +b);
        		return join;
	}
}
