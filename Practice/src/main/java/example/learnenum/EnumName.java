package example.learnenum;

public class EnumName 
{
	public static void main(String args[])
	{
		Day[] days = Day.values();
		for(int i =0 ; i < days.length ; i++)
		{
			System.out.println(days[i].name());  
		}
	}
}
