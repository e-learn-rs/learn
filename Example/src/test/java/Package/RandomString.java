package Package;
import java.util.Random;


public class RandomString 
{
	
	public static void main(String args[])
	{
		System.out.println(getRandomString(10));
		System.out.println(getRandomString(100));
		System.out.println(getRandomString(500));
 	}
	
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

}
