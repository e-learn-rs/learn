package example.multithread;

public class ThreadPriority 
{
	public static void main(String args[])
	{
		try
		{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); 
		Clicker low_priority_clicker = new Clicker(Thread.NORM_PRIORITY -2);
		Clicker high_priority_clicker = new Clicker(Thread.NORM_PRIORITY + 2); 
		
		low_priority_clicker.start();
		high_priority_clicker.start(); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block 
			System.out.println("MAIN THREAD INTERRUPTED...");
			e.printStackTrace();
		} 
		

		low_priority_clicker.stop();
		high_priority_clicker.stop(); 
		
		low_priority_clicker.getThread().join(); 
		high_priority_clicker.getThread().join(); 
		
		
		System.out.println("Number of low priority thread clicks are [ "+low_priority_clicker.getClicks()+" ] ");  
		System.out.println("Number of high priority thread clicks are [ "+high_priority_clicker.getClicks()+" ] ");  
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}

}
