package com.core.map.opertations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reverselist extends ArrayList<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Iterator<Integer> iterator() {
		
		 int startIndex = this.size() -1;
	     List<Integer> list = this;
		 
	     Iterator<Integer> it  = new Iterator<Integer>() {
             private int currentIndex = startIndex;
             
			@Override
			public boolean hasNext() {
				return currentIndex>=0;
			}

			@Override
			public Integer next() {
				 Integer next = list.get(currentIndex);
	                currentIndex--;
	                return next;
			}
			
			
		@Override
		public void remove() {
			 throw new UnsupportedOperationException();
		}
		
		 };
		     
		
		return it;
	}
	
	
	
}
