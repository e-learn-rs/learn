package example.learn;

public class StaticExample 
{
	public static int i;
    public int aMethod()
    {
        i++;
        return i;
    }
    public static void main(String args[])
    {
    	StaticExample test = new StaticExample();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}