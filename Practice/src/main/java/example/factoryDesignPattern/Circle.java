package example.factoryDesignPattern;


public class Circle implements Area
{
	private double radius ;
	
	public void setRadius(double radius)
	{
		this.radius = radius; 
	}
	
	
	@Override
	public double computeArea()
	{
		return 3.14*radius*radius;
	}
	
	

}
