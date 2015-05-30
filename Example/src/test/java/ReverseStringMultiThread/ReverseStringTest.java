package ReverseStringMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReverseStringTest
{
	public static String getRandomString(int n)
	{
		String randomString = "";
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int spaceLength = 0;
		char c;
		for (int i = 0; i < n; i++) {			
			if(spaceLength==15)
			{
		    sb.append(' ');
			spaceLength = 0;
			}
			else
			{
		     c = chars[random.nextInt(chars.length)];
		     sb.append(c);
			}
			spaceLength++;
		    
		}
		randomString = sb.toString();
		return randomString;
	}
	
	public static void main(String args[])
	{

		ReverseString rs = new ReverseString();
		int number = 100;
		List<String> strings = new ArrayList<String>(); 
		for(int i = 0 ; i < number ; i++)
		{
			strings.add(getRandomString(50)); 
		}
		for(String s : strings)
		{
			 
			new ReverseStringThread(rs, s);   
		}
	
	}
	

}
