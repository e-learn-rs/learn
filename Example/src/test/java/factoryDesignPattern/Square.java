package factoryDesignPattern;

public class Square implements Area
{
	
	public double side;
	
	@Override
	public double computeArea()
	{
		return side*side; 
	}
	
	public void setSide(double side)
	{
		this.side = side; 
	}

}
