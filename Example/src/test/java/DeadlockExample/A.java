package DeadlockExample;

public class A 
{
	synchronized void foo(B b)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name [ "+name +" ]. Entered A.foo");
		try
		{
			Thread.sleep(1000); 
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		System.out.println("Calling last of B from A ");
		synchronized (b) {
			b.last(); 
		}
		
				
	}
	
	void last()
	{
		System.out.println(" Entered in last of class A");
	}

}
