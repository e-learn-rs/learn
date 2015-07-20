package example.collections;

import java.util.*;

public class ListIteratorExample 
{
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		
		ArrayList names = new ArrayList();
		names.add("abc");
		names.add("def");
		names.add("ghi");
		names.add("jkl");
		
		System.out.println("Names initialised ::"); 
		Iterator iterator = names.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());    
		}
		
		ListIterator listIterator = names.listIterator(); 
		while(listIterator.hasNext())
		{
			String name = (String)listIterator.next();
			listIterator.set(name + " added");
  		}
		
		System.out.println("After modification :: ");  
		iterator = names.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());  
		}
		
		System.out.println("Reversal of list::");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous()); 
		}
		
	}

}
