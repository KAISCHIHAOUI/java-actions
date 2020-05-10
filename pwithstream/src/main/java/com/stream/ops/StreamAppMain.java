package com.stream.ops;

public class StreamAppMain {

	public static void main(String[] args) {

		StreamSorted sapp = new StreamSorted();

		System.out.println(":: JAVA_STATIC_MAIN_TEST ::");

		sapp.sortedListFunc("A", "1", "E", "C", "3", "2", "B", "F").forEach((System.out::println));
		System.out.println("-> :: result :: JAVA 8_11_14");

		sapp.reverseOrderFunc("A", "1", "E", "C", "3", "2", "B", "F").forEach(System.out::println);
		System.out.println("-> :: result :: JAVA 8_11_14");

		sapp.sortedTrainerByAge(new Trainer("kais", 30), new Trainer("Jessy", 22), new Trainer("Ahmed", 25),
				new Trainer("kONE", 29)).forEach(System.out::println);

	}

}
