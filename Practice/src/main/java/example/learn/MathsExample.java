package example.learn;

public class MathsExample 
{
	public static void main(String args [])
	{
		MathsExample me = new MathsExample();
		me.displayAllConstantValues();
		
	}
	
	public void displayAllConstantValues()
	{
		for(Maths m : Maths.values())
		{
			System.out.println("Name of Constant [ "+m.getDesc()+" ] . Value is [ "+m.getValue()+" ] ");  
		}
	}

}
