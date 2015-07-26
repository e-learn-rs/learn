package example.map;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample 
{
	
	public static void main(String args[])
	{
		TreeMap studentTM = new TreeMap();
		studentTM.put(5, 89.5);
		studentTM.put(3, 56.2);
		studentTM.put(4, 45.1);
		studentTM.put(1, 99);
		
		Set studentEntries = studentTM.entrySet();
		
		for(Object studentEntry : studentEntries) 
		{
			Entry studentMapEntry = (Entry)studentEntry;
			System.out.println("Key :: "+studentMapEntry.getKey()); 
			System.out.println("Value :: "+studentMapEntry.getValue());  
		}
		
	}

}
