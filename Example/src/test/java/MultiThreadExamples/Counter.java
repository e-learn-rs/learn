package MultiThreadExamples;

public class Counter 
{
	public void countNumbers(int number)
	{
		for(int i = 0 ; i < number ; i++)
		{
			System.out.println(i); 
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
