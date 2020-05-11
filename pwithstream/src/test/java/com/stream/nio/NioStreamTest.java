package com.stream.nio;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class NioStreamTest {

	@Test
	void testReadFile() throws IOException{
	NioStream n = new NioStream();
	assertNotNull(n.readFile("src/test/resources/SimleFIle.txt"));
	}

}
