package example.exception;

public class DivisionByZero 
{
	
	public static void divideByZero()
	{
		try
		{
		int num = 0;
		int div = 15/num;
		System.out.println("Div [ "+div+" ] "); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e);  
			System.out.println("Message [ "+e.getMessage()+" ] "); 
			e.printStackTrace();
		
		} 
		
	}
	
	public static void main(String args[])
	{
		System.out.println("Number of args [ "+args.length+" ] ");  
		for(int i = 0 ; i < args.length ; i++)
		{
			System.out.println(args[i]);  
		}
		divideByZero();  
		System.out.println("After division...");  
	}

}
