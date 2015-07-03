package example.deadlock;

public class B 
{
	synchronized void bar(A a)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name [ "+name +" ]. Entered B.bar"); 
		try
		{ 
			System.out.println("WAIT IN B");
			Thread.sleep(1000); 
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		System.out.println("Calling last of A from B ");
		synchronized (a) { 
			a.last(); 
		}
		
				
	}
	
	 void last()
	{
		System.out.println(" Entered in last of class B");
	}

}
