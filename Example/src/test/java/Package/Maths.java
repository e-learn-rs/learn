package Package;


enum Maths
{
 PI("Archimedes' constant" , 3.14159), E("Euler's number" ,2.71828) , ALPHA("Apéry's constant", 2.5029) , THETA("The golden ratio" , 4.6692);
 
 private double value;
 private String name;
 private Maths( String name , double value )
 {
	 this.value = value;
	 this.name = name;
 }
 
 public double getValue()
 {
	 return value;
 }
 
 public String getDesc()
 {
	 return name;
 }
 


}
