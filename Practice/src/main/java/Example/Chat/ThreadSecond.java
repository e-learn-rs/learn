package Example.Chat;

public class ThreadSecond implements Runnable
{
	Chat chat;
	String[] s2  = { "Hi", "I am good, How Are you?", "Great!!" };
	public ThreadSecond(Chat chat)
	{
		this.chat = chat;
		new Thread(this, "Answer").start(); 
	}
	
	public void run()
	{ 
		for(int i =0 ; i < s2.length ; i++)
		{
			synchronized (chat) 
			{ 
				chat.threadTwo(s2[i]); 
			}
			
			
		}
	}

}


