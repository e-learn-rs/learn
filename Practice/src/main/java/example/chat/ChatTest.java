package example.chat;

public class ChatTest 
{
	public static void main(String args[])
	{
	Chat chat = new Chat();
	new ThreadFirst(chat);  
	new ThreadSecond(chat); 
	}
	

}
