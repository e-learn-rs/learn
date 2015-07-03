package example.singletondesignpattern;

public class Customer 
{
   public static void main(String args[])
   {
   SingletonClass singletonObject = SingletonClass.getInstance();
   singletonObject.showMessage("Robin"); 
   }
   
   

}
