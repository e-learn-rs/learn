package example.comparator;

import java.util.*;

public class ReverseStringComparator implements Comparator 
{
	
	public int compare(Object o1 , Object o2)
	{
		String o1Str = (String)o1;
		String o2Str = (String)o2;
		
		return o1Str.compareTo(o2Str);
	}

}
