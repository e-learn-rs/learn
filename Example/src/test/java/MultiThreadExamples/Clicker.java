package MultiThreadExamples;

public class Clicker implements Runnable
{
	private int clicks = 0;
	private Thread thread;
	private volatile Boolean running = true;
	
	public Clicker(int level)
	{
		thread = new Thread(this);
		thread.setPriority(level);
	}
	
	public void run()
	{
		while(running)
		{
			clicks++;
		}
	}
	
	public void stop()
	{
		running = false;
	}
	
	public void start()
	{
		thread.start(); 
	}
	
	public Thread getThread()
	{
		return thread;
	}
	
	public int getClicks()
	{
		return clicks; 
	}
	
	
	

}
