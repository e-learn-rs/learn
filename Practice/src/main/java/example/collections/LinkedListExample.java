package example.collections;

import java.util.*;

public class LinkedListExample {
	
	public static void main(String args[])
	{
		LinkedList names = new LinkedList();
		names.add("Robin");
		names.add("Salman");
		for(Object name : names)
		{
			System.out.println((String)name);  
		}
	}

}
