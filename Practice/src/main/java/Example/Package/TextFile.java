package Example.Package;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFile 
{

	public static void main(String args[])
	{
		try
		{
		ArrayList<String> places = new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
		PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		for(String place : places)
		{
			writer.println(place);
		}
		writer.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
}
