package Example.ReverseStringMultiThread;

public class ReverseStringThread implements Runnable
{
	ReverseString rs;
	String input; 
	String output ; 
	
	public ReverseStringThread(ReverseString rs , String input)
	{
		this.input = input ; 
		this.rs = rs ; 
		new Thread(this).start();
	}
	
	
	
	public void run() 
	{
			synchronized (rs) {
			System.out.println(" \nInput String [ "+input+" ]"); 
			output = rs.getReversedString(input); 
			System.out.println("output [ "+output+" ] ");  
			}
	} 

}
