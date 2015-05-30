package ReverseStringMultiThread;

public class ReverseString 
{
	Boolean isStringReversed = false;  
	
    public String getReversedString(String input)
      { 
    	  String reversedString = "";
    	  StringBuffer str = new StringBuffer();
    	  str.append(input);
    	  reversedString = str.reverse().toString(); 
    	  return reversedString ; 
      }
      
}
