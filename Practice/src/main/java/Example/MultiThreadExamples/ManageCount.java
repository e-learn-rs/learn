package Example.MultiThreadExamples;

public class ManageCount implements Runnable
{
	int number;
	Counter counter;
	Thread thread;
	
	public ManageCount( Counter counter, int number) {
		// TODO Auto-generated constructor stub
		this.counter = counter; 
		this.number = number; 
		thread= new Thread(this);
		thread.start(); 
	}
	
	public void run()
	{
		synchronized (counter) {
			counter.countNumbers(number);
		} 
		
	}

}
