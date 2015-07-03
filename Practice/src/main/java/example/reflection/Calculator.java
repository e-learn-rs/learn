package example.reflection;

public class Calculator implements Calcinterface 
{
	
	public int a;
	public int b;
	
	public Calculator()
	{
		
	}
	
	public Calculator(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int add()
	{
		return a+b; 
	}
	
	/* (non-Javadoc)
	 * @see Reflection.Calcinterface#add(int, int)
	 */
	@Override
	public int add(int a , int b)
	{
		return a + b ;
	}

}
