package com.core.map.opertations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Welcome {
	
	static List<Integer> first = Arrays.asList(1,2,3,4,5,6);
	
    
	public static void main(String[] args) {
		// OP1

		System.out.println("Original list :" + first);
		List<Integer> after = first.stream().map(e -> e * 10).collect(Collectors.toList());
		System.out.println("After Operation" + after);

		// OP2

		List<Integer> list = new Reverselist();
		list.addAll(after);
		System.out.println("Reverse list :" + list);
		
		//

		
		
		

	}
	

}
