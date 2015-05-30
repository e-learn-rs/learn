package Exception;

public class FinallyExample {

	public static void funcA() {
		try {
			System.out.println("Inside function A");
			throw new RuntimeException("Run time error..");
		} finally {
			System.out.println("In finally of function A");
		}
	}

	public static void funcB() {
		try {
			System.out.println("Inside function B");
			return;
		} finally {
			System.out.println("In finally of funcB");
		}
	}

	public static void funcC() {
		try {
			System.out.println("Inside function C");
		} finally {
			System.out.println("Inside finally of func C");
		}
	}
	
	public static void funcD()
	{
		try
		{
			int a = 15/0;
		}
		finally
		{
			System.out.println("Inside finally of D");  
		}
	}

	public static void main(String args[]) 
	{
		funcB();
		funcC();
		funcD();
		System.out.println("After all..");
	}

}
