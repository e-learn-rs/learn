package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample
{
	
	public static void main(String args[])
	{
		ArrayList<String> values = new ArrayList<String>(Arrays.asList("Robin","Singh"));
 		//va
		System.out.println(values.size());
		values.clear();
		//System.out.println(values.size());
		System.out.println(values); 
		values.add("Robin");
		values.add("Singh");
		values.add("Gill");
		System.out.println(values.size());
	}

}
