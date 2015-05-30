package ThreadControl;

public class Counter implements Runnable
{
	Thread thread;
	Boolean isSuspended = false;
	String ThreadName;
	
	public Counter(String ThreadName)
	{
		this.ThreadName = ThreadName;
		thread = new Thread(this,this.ThreadName);
		thread.start(); 
	}
	
	public void run()
	{
		try
		{
		for(int i = 0 ; i < 20 ; i++)
		{
			System.out.println("Thread [ "+ThreadName+" ]. Counter [ "+ i +" ]");  
			Thread.sleep(50); 
			synchronized (this) {
				while(isSuspended)
				{
					wait(); 
				}
			}
			
			
		}
		System.out.println("EXITING THREAD [ "+ThreadName+" ] ");  
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
	public void suspend()
	{
		System.out.println("Suspending thread [ "+ThreadName+" ] ");  
		isSuspended = true;
	}
	
	synchronized void resume()
	{
		try
		{
			System.out.println("Resuming thread [ "+ThreadName+" ] ");  
			isSuspended = false;
			notify(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
