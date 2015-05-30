package MultiThreadExamples;

public class Message
{
	public static void main(String args[])
	{
	PrintMessage printMessage  = new PrintMessage(); 
	HandlePrintRequest request1 = new HandlePrintRequest(printMessage,"Robin"); 
	HandlePrintRequest request2 = new HandlePrintRequest(printMessage ,"Singh");
	HandlePrintRequest request3 = new HandlePrintRequest(printMessage ,"Gill");
	try
	{
	request1.thread.join();
	request2.thread.join();
	request3.thread.join();
	}
	catch(Exception e)
	{
		e.printStackTrace(); 
	}
	}
	

}
