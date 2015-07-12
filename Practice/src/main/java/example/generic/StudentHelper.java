package example.generic;

import java.util.Random;

public class StudentHelper 
{
	static Random random = new Random();
	
	public static int[] getRandomNumbers(int numbers) 
	{
		int arr[] = new int[numbers];
		int value = 1;
		for (int i = 0; i < numbers; i++) {
			arr[i] = value++;
		}
		for (int i = numbers; i > 0; i--) 
		{ 
			int randomNumber = random.nextInt(i);
			int temp = arr[randomNumber];
			arr[randomNumber] = arr[i - 1];
			arr[i - 1] = temp;
		}
		return arr;
	} 
	
	public static String getRandomStringOfAlphabets(int n) {
		String randomString = "";
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int spaceLength = 0;
		char c;
		for (int i = 0; i < n; i++) {
			if (spaceLength == 15) {
				sb.append(' ');
				spaceLength = 0;
			} else {
				c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			spaceLength++;

		}
		randomString = sb.toString();
		return randomString;
	}


}
