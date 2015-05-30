package factoryDesignPattern;

public class Rectangle implements Area
{
	
	private double length;
	private double breadth;
	
   @Override
   public double computeArea()
   {
	   return length * breadth ;
   }
   
   public void setLengthAndBreadth(double length , double breadth)
   {
	   this.length = length;
	   this.breadth = breadth;
   }
}
