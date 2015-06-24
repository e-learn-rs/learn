package Example.ThreadControl;

public class ThreadControlTest 
{
	public static void main(String args[])
	{
		Thread.currentThread().setName("MAIN"); 
	Counter c1 = new Counter("FistCounter"); 
	Counter c2 = new Counter("SecondCounter");
	
	try
	{
		Thread.sleep(200);
		c1.suspend();
		Thread.sleep(200); 
		c1.resume();
		Thread.sleep(200);
		c2.suspend();
		Thread.sleep(200); 
		c2.resume();
		c1.thread.join();
		c2.thread.join(); 
		System.out.println("EXITING THREAD [ "+Thread.currentThread().getName()+" ] ");  
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	


}
