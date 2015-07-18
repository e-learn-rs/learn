package example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
	
	public static void main(String args[])
	{
		Set set1 = new HashSet();
		String str = "Element 1";
		set1.add(str);
		System.out.println(set1.contains(str)); 
	}

}
