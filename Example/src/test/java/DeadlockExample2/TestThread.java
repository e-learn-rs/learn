package DeadlockExample2;

import com.sun.mail.handlers.text_html;

public class TestThread
{
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String args[])
	{
		new ThreadDemo1().start();
		new ThreadDemo2().start();
	}
	
	private static class ThreadDemo1 extends Thread
	{
		public void run()
		{
			synchronized (Lock1) {
			System.out.println("Thread 1 : Holding Lock 1");	
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace(); 
			}
			System.out.println("Thread 1 : Waiting for Lock 2");
			synchronized (Lock2) {
			System.out.println("Thread 1 : Holding lock 1 & 2");	
			}
		}
	}
	}
		
		private static class ThreadDemo2 extends Thread
		{
			public void run()
			{
				synchronized (Lock2) {
				System.out.println("Thread 2 : Holding Lock 2");	
				try
				{
					Thread.sleep(10);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace(); 
				}
				System.out.println("Thread 2 : Waiting for Lock 1");
				synchronized (Lock1) {
				System.out.println("Thread 2 : Holding lock 1 & 2");	
				}
			}
		}

}
}
