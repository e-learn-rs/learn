package Example.Chat;

public class Chat 
{
	Boolean didThreadOneSay = false;
	
	void threadOne(String msg)  
	{
		if(didThreadOneSay)
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
		System.out.println("Thread One : [ "+msg+" ] ");
		didThreadOneSay = true;
		notify(); 
 	}
	 
	void threadTwo(String msg) 
	{
		if(!didThreadOneSay)
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
		System.out.println("Thread Two :  [ "+msg+" ] ");
		didThreadOneSay  = false;
		notify(); 
 	}

}
