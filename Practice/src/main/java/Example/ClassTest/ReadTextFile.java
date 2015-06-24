package Example.ClassTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTextFile 
{
	public static void main(String args[]) 
	{
		try {
			String PATH = System.getProperty("user.dir");  
			
			BufferedReader reader = new BufferedReader( new FileReader (PATH+"/RTIS_Consumer_logs")); 
		    String         line = null;
		    StringBuilder  stringBuilder = new StringBuilder();
		    String         ls = System.getProperty("line.separator");

		    while( ( line = reader.readLine() ) != null )
		    { 
		        stringBuilder.append( line );
		        stringBuilder.append( ls );
		    }
            String str = stringBuilder.toString();
            System.out.println(str); 
            Scanner scanner = new Scanner(str);
            int i =0 ;
            while (scanner.hasNextLine()) {
              String line1 = scanner.nextLine(); 
              System.out.println(" LINE :: "+i+""+line1+" ");
              if(line1.contains("BaseDir"))
              {
            	  System.out.println(line1.substring(line1.lastIndexOf("r")+1));   
            	  break;
              }
              // process the line
            }
            scanner.close();
		     
		} 
		catch (Exception e)
		{ 
			e.printStackTrace();
		}
	}
}
