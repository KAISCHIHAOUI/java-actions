package com.core.map.opertations;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Iteratemap {

	public static void main(String[] args) {

		Map<String, String> booksmap = new HashMap<>();
		booksmap.put("Spring boot", "ISBN-000");
		booksmap.put("Spring Integration", "ISBN-111");
		booksmap.put("Sring Reactive", "ISBN-222");
		booksmap.put("Spring Cloud", "ISBN-333");
		booksmap.put("Spring Security", "ISBN-444");

		// forEach(action) method to iterate map
		booksmap.forEach((k,V) -> System.out.println("[" + k + "," + V + "]"));

		String result = booksmap.entrySet().stream().filter(k -> "ISBN-444".equals(k.getValue())).map(Map.Entry::getValue)
				.collect(Collectors.joining());
		System.out.println("-> String | " + result);

		Map<String, String> msfm = booksmap.entrySet().stream().filter(x -> "Spring Security".equals(x.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		msfm.forEach((k, V) -> System.out.println("[" + k + "," + V + "]"));

	}

}
