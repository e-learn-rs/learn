package Example.MultiThreadExamples;


public class RunnableThreadExample implements Runnable
{
	public Thread thread;
	public String threadName;
	public RunnableThreadExample(String threadName )
	{
		this.threadName = threadName;
	}
	
	public void run()
	{
		System.out.println("Running thread [ "+threadName+" ] "); 
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Thread Name [ "+threadName+" ]. Value of i is [ "+i+" ] ");  
			System.out.println("WAIT FOR SOME TIME....");
			try
			{
			Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread [ "+threadName+" ] interrupted");  
			}
		}
		System.out.println("Exiting thread [ "+threadName+" ] ........  ");
	}
	
	public void start()
	{
		System.out.println("Starting Thread [ "+threadName+" ] ");
		if(thread == null)
		{
			thread = new Thread(this, threadName);
			thread.start(); 
		}
	}
	
	public static void main(String args[])
	{
		try
		{
		RunnableThreadExample RTE1 = new RunnableThreadExample("THREAD-ONE");
		RTE1.start();
		
		RunnableThreadExample RTE2 = new RunnableThreadExample("THREAD-TWO");
		RTE2.start();
		
		RunnableThreadExample RTE3 = new RunnableThreadExample("THREAD-THREE");
		RTE3.start();
		
		
		System.out.println("RTE1 alive status before join [ "+RTE1.thread.isAlive()+" ]"); 
		System.out.println("RTE2 alive status before join [ "+RTE2.thread.isAlive()+" ]");
		System.out.println("RTE3 alive status before join [ "+RTE3.thread.isAlive()+" ]"); 
		
		RTE1.thread.join();
		RTE2.thread.join();
		RTE3.thread.join();
		
		System.out.println("RTE1 alive status after join [ "+RTE1.thread.isAlive()+" ]"); 
		System.out.println("RTE2 alive status after join [ "+RTE2.thread.isAlive()+" ]");
		System.out.println("RTE3 alive status after join [ "+RTE3.thread.isAlive()+" ]"); 
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

	
