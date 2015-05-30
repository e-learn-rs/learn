package MultiThreadExamples;

public class ThreadDemo
{
	
	public static void main(String args [])
	{
		new NewThread("CHILD-THREAD"); 
		Thread.currentThread().setName("MAIN-THREAD");
		for( int i = 0 ; i < 5 ; i++ )
		{
			System.out.println("Thread [ "+Thread.currentThread().getName()+" ]. Value [ "+i+" ] ");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch blocks
				System.out.println("Thread [ "+Thread.currentThread().getName()+" ] interrupted.");
				e.printStackTrace();
			}
		}
		System.out.println("Exiting thread from main...");
	}

}
