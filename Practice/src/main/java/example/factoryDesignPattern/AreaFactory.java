package example.factoryDesignPattern;

public class AreaFactory 
{
	private String shape ; 
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public double getArea(double a)
	{
		
		if(shape.equalsIgnoreCase("circle"))
		{
			Circle circle = new Circle();
			circle.setRadius(a);
			return circle.computeArea(); 
		}
		else if(shape.equalsIgnoreCase("square"))
		{
			Square square = new Square();
			square.setSide(a);
			return square.computeArea();
		}
		return -1;
	}
	
	public double getArea(double a , double b)
	{
		
		if(shape.equalsIgnoreCase("rectangle"))
		{
			Rectangle rectangle = new Rectangle();
			rectangle.setLengthAndBreadth(a, b); 
			return rectangle.computeArea();
		}
		return -1;
	}
	

}
