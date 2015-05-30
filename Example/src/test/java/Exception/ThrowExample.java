package Exception;

public class ThrowExample 
{
	public static void printArguements(String args[]) 
	{
		if(args.length == 0 )
		{
			throw new NullPointerException("Please put some arguements..");
		}
	}
	

	
	public static void main(String args[])
	{
		try
		{
			printArguements(args);
		}
		catch(NullPointerException e)
		{ 
			System.out.println("Exception :: "+e);
			e.printStackTrace();
		}
		
	}

}
