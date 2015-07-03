package example.multithread;

public class PrintMessage 
{
	public void printMessage(String message)
	{
		System.out.print(" [ "+message); 
		try 
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]"); 
		
	}

}
