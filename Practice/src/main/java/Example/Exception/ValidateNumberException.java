package Example.Exception; 

public class ValidateNumberException extends Exception
{
	private static final long serialVersionUID = 1L; 
	
	private int number;
	
	public ValidateNumberException(int number)
	{
		this.number = number;
	}
	
	public String toString()
	{
		String str = "Number entered by you [ "+number+" ]  is greater than 100";  
		return str; 
	} 

}
