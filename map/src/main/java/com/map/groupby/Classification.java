package com.map.groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Classification {

	public static void main(String[] args) {
	
		 List<Item> items = Arrays.asList(
	                new Item("Apple", 10, new BigDecimal("9.99")),
	                new Item("Banana", 20, new BigDecimal("19.99")),
	                new Item("Orang", 10, new BigDecimal("29.99")),
	                new Item("Watermelon", 10, new BigDecimal("29.99")),
	                new Item("Papaya", 20, new BigDecimal("9.99")),
	                new Item("Apple", 10, new BigDecimal("9.99")),
	                new Item("Banana", 10, new BigDecimal("19.99")),
	                new Item("Apple", 20, new BigDecimal("9.99"))
	        );
		 
		 Map<String, Long> counting = items.stream()
				 .collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
		          counting.forEach((K,V)-> System.out.println("["+K+","+V+"]"));
		    
		 Map<String, Integer> sum = items.stream()
				 .collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));  
		 sum.forEach((K,V)-> System.out.println("["+K+","+V+"]"));
		 
		 Map<String, IntSummaryStatistics> stat = items.stream()
				 .collect(Collectors.groupingBy(Item::getName,Collectors.summarizingInt(Item::getQty)));  
		 stat.forEach((K,V)-> System.out.println("["+K+","+V+"]"));

	}

}
