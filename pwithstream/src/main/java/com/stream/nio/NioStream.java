package com.stream.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioStream  {

	//Read file with stream into-try
	public List<String> readFile(String absolutePath) {
		
		String uri = absolutePath;
		List<String> list = new ArrayList<>();
	
		try (Stream<String> stream = Files.lines(Paths.get(uri))){
			  
			list = stream.filter(l -> !l.startsWith(" "))
					.map(String::toString)
					.collect(Collectors.toList());

		} catch (IOException e) {
			e.getStackTrace();
		}
		return list;
	}
	
	
	
	
}
