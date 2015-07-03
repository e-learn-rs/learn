package example.interthread;

public class Q 
{
	int n;
	boolean isValuePut = false; 
	
	synchronized int get()
	{ 
		if(!isValuePut)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace(); 
			}
		}
		System.out.println("Got [ "+n+" ] ");
		isValuePut = false;
		notify(); 
		return n;
	}
	
	synchronized void put(int n)
	{ 
		if(isValuePut)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace(); 
			}
		}
		this.n= n; 
		System.out.println("Put [ "+n+" ] "); 
		isValuePut = true;
		notify();
	}

}
