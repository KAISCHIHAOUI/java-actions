package com.stream.nio;

public class TestFiles {

	public static void main(String[] args) {

		NioStream read = new NioStream();
		read.readFile("src/main/resources/SimpleFile.txt").forEach(System.out::println);
		
	}

}
