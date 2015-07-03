package example.multithread;

public class HandlePrintRequest implements Runnable
{
 Thread thread;
 PrintMessage printMessageObject ; 
 String message;
 
 public HandlePrintRequest( PrintMessage printMessageObject , String message)
 {
	 this.printMessageObject =printMessageObject;
	 this.message = message;
	 thread = new Thread(this);
	 thread.start(); 
 }
 
  public void run()
 {
	  synchronized (printMessageObject) {
		  printMessageObject.printMessage(message);
	}
	  
 }
}
