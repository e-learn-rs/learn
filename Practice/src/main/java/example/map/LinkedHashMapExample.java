package example.map;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapExample 
{
	public static void main(String args[])
	{
		LinkedHashMap studentPercentage = new LinkedHashMap() ; 
		studentPercentage.put(5, 90.2); 
		studentPercentage.put(4, 88.2);
		studentPercentage.put(1, 94.2);
		studentPercentage.put(3, 55.8);
		studentPercentage.put(2, 72.5); 
		
		Set studentEntries = studentPercentage.entrySet();
		
		for(Object studentEntry : studentEntries) 
		{
			Entry studentMapEntry = (Entry)studentEntry;
			System.out.println("Key :: "+studentMapEntry.getKey()); 
			System.out.println("Value :: "+studentMapEntry.getValue());  
		}
		
		/* Double threePercentage = (Double)studentPercentage.get(3);
		
		studentPercentage.put(3, threePercentage-5.2);
		
	    studentEntries = studentPercentage.entrySet();
		
		Iterator studentEntriesIterator = studentEntries.iterator();
		while(studentEntriesIterator.hasNext())
		{
			Entry mapEntry = (Entry) studentEntriesIterator.next();
			System.out.println("Key :: "+mapEntry.getKey());
			System.out.println("Value :: "+mapEntry.getValue()); 
		} 
		
		/* Set keys = studentPercentage.keySet();
		for(Object key : keys)
		{
			System.out.println("Key :: "+key);
			System.out.println("Values :: "+studentPercentage.get(key)); 
 		} */
		
		/* Collection percentages = studentPercentage.values();
		Iterator collIterator = percentages.iterator();
		while(collIterator.hasNext())
		{
			System.out.println(collIterator.next()); 
		}
		
		System.out.println("Values in map are :: "+studentPercentage.values()); */
 		
	}

}
