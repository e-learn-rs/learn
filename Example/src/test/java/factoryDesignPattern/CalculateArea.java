package factoryDesignPattern;

public class CalculateArea 
{
	
	public static void main(String args[])
	{
		AreaFactory areaFactory = new AreaFactory();
		areaFactory.setShape("Circle");
		System.out.println("Area of circle of radius 15.5 is  [  "+areaFactory.getArea(15.5)+" ] ");  
		
		areaFactory.setShape("Rectangle");
		System.out.println("Area of rectangle of length [ 10 ] and breadth [ 20 ] is [ "+areaFactory.getArea(10, 20)+" ] ");  
		
		areaFactory.setShape("Square");
		System.out.println("Area of square of side [ 10 ]  is [ "+areaFactory.getArea(10)+" ] ");   
	}
	

}
