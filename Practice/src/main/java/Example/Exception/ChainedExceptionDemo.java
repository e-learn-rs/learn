package Example.Exception; 

public class ChainedExceptionDemo 
{
	public void runDemo() 
	{
		NullPointerException e = new NullPointerException("Value is null");
		e.initCause(new ArithmeticException("Actually value entered is 0"));
		throw e;
	}
	
	public static void main(String args[])
	{
		try
		{
			ChainedExceptionDemo demo = new ChainedExceptionDemo();
			demo.runDemo();
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception :: "+e);
			System.out.println("Cause :: "+e.getCause()); 
		}
	}
	
	

}
