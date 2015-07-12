package example.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String args[])
	{
		HashMap<Long, ArrayList<String>> map = new HashMap<Long, ArrayList<String>>();
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Cricket");
		hobbies.add("Football");
		Long roll1 = 10l;
		map.put(roll1, hobbies);
	
		Long roll2 = 20l;
		if(map.containsKey(10l))
		{
			ArrayList<String> hobb10 = map.get(10l);
			hobb10.add("Hockey");
			map.put(roll1, hobb10);
		}
		ArrayList<String> hobb10 = map.get(10l);
		for(String h : hobb10)
		{ 
			System.out.println(h);
		}
	}

}
