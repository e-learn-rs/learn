package example.collections;

import java.util.*;

public class ArrayListExample 
{
	public static void main(String args[])
	{
		ArrayList names = new ArrayList();
		System.out.println(names.size()); 
		names.add("Robin");
		names.add("Salman");
		Object[] namesArray = names.toArray();
		
		for(int i = 0 ; i < namesArray.length ; i++)
		{
			System.out.println(namesArray[i]);  
		}
	}

}
