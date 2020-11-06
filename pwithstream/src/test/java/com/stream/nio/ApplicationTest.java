/**
 * 
 */
package com.stream.nio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author KAIS.CH
 *
 */
class ApplicationTest {

	@Test
	void givenTransient_thenVerifyValues() throws Exception{
		 
		Book book = new Book();
		book.setId(1);
		book.setIsbn("ISBN-KAIS-2656");
		book.setPrice(25);
		book.setTitle("Java-Core");
	
		Application.serializeObject(book);
		
		Book two = Application.deserializeObject();
		
		assertEquals("Java-Core",two.getTitle());
		assertNotEquals("ISBN-KAIS-2656",two.getIsbn());
		assertNotNull(two.getPrice());
	}

	
	  @Test
	    void givenFinalTransient_thenValuePersisted() throws Exception {
	        Book book = new Book();
	        
	        Application.serializeObject(book);
	        Book book2 = Application.deserializeObject();
	        
	    	assertEquals(0,book2.getPrice());
	    }
	
	
}
