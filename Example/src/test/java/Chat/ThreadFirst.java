package Chat;

public class ThreadFirst implements Runnable
{
	Chat chat;
	String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
	public ThreadFirst(Chat chat)
	{
		this.chat = chat;
		new Thread(this, "Question").start(); 
	}
	
	public void run()
	{
		for(int i =0 ; i < s1.length ; i++)
		{
			synchronized (chat) 
			{
				chat.threadOne(s1[i]); 
			}
			
			
		}
	}

}
