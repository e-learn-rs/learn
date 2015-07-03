package example.multithread;

public class PrintNumber 
{
	public static void main(String args[])
	{
	Counter counter = new Counter();
	ManageCount request1 = new ManageCount(counter, 15); 
	ManageCount request2 = new ManageCount(counter, 15); 
	ManageCount request3 = new ManageCount(counter, 15); 
	
	try
	{
	request1.thread.join();
	request2.thread.join();
	request3.thread.join();
	}
	catch(Exception e)
	{
		e.printStackTrace(); 
	}
	}
	
	
}
