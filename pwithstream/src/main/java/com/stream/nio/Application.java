package com.stream.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {

	static String fileName = "application.txt";


	public static void serializeObject(Book book) throws Exception

	{
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(book);
		objectOutputStream.close();
		fileOutputStream.close();
	}
	public static Book deserializeObject() throws Exception {
	    FileInputStream file = new FileInputStream(fileName);
	    ObjectInputStream in = new ObjectInputStream(file);
	    Book book = (Book) in.readObject();
	    in.close();
	    file.close();
	    return book;
	}

}


