package example.collections;

import java.util.*;

public class HashSetExample 
{
	
	public static void main(String args[])
	{
		HashSet aplhabetsSet = new LinkedHashSet();
		aplhabetsSet.add("A"); 
		aplhabetsSet.add("B");
		aplhabetsSet.add("C" );
		aplhabetsSet.add("D"); 
		aplhabetsSet.add("E");
		aplhabetsSet.add("F" );
		
		System.out.println("SIZE :: "+aplhabetsSet.size()); 
		for(Object o : aplhabetsSet)
		{
			System.out.println((String)o);   
		}
	}

}
