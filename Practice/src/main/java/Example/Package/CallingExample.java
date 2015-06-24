package Example.Package;

public class CallingExample 
{
	
	public void increase(int a)
	{
		a = a+10;
	}
	public static void main(String args[])
	{
		CallingExample example = new CallingExample();
		int a = 10;
		example.increase(a);
		System.out.println(a); 
	}

}
