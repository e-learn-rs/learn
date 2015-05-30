package MultiThreadExamples;

public class ThreadExample extends Thread 
{
	private Thread thread;
	private String threadName;
	
	public ThreadExample(String threadName)
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
			Thread.sleep(50);
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
		if(thread == null)
		{
			thread = new Thread(this, threadName); 
			thread.start();
		}
	}
	
	public static void main(String args[])
	{
		RunnableThreadExample RTE1 = new RunnableThreadExample("THREAD-ONE");
		RTE1.start();
		
		RunnableThreadExample RTE2 = new RunnableThreadExample("THREAD-TWO");
		RTE2.start();
		
		RunnableThreadExample RTE3 = new RunnableThreadExample("THREAD-THREE");
		RTE3.start();
		
	}
}
