package com.stream.ops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

	
	public List<Trainer> sortedTrainerByAge(Trainer...object){
		List<Trainer> trainers = Arrays.asList(object);
		
		List<Trainer> trainersSorted = trainers.stream()
				.sorted(Comparator.comparingInt(Trainer::getAge))
				.collect(Collectors.toList());
		
		return trainersSorted;
	}
	
	
	public List<String> sortedListFunc(String... a) {
		List<String> list = Arrays.asList(a);
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		return sortedList;
	}

	public List<String> reverseOrderFunc(String... b) {

		List<String> list = Arrays.asList(b);
		List<String> reverseList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		return reverseList;
	}

}
