package example.multithread;

public class NewThread implements Runnable
{
  private Thread thread;
  private String threadName;
  
  public NewThread(String threadName)
  {
	  this.threadName = threadName;
	  if(thread == null)
	  {
		  thread = new Thread(this, threadName);
	  }
	  System.out.println("Starting thread [ "+threadName+" ] ");  
	  thread.start();
  }
  
  public void run()
  {
	 System.out.println("Running thread [ "+threadName+ " ] ");
	 for( int i = 0 ; i < 5 ; i++)
	 {
		 System.out.println("Thread Name [ "+threadName+" ]. Value of i [ "+i+" ]  ");  
		 try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread [ "+threadName+" ]  interrupted ");
 			e.printStackTrace();
		}
	 }
	 System.out.println("Exiting thread from child....");
  }

 
	
}
