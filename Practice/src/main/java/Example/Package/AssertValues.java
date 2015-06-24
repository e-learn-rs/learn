package Example.Package;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;
import org.testng.annotations.Test;


public class AssertValues {
	
	
  @Test
  public void assertTrueTest() 
  {
	  int a =20;
	  assertTrue("A is greater than 10", a<10);
  }
  
  @Test
  public void assertFalseTest() 
  {
	  int a =20;
	  assertTrue("No results found ",a!=0);
  }
  
  @Test
  public void assertEqualsTest() 
  {
	  int a =20;
	  int b = 20;
	  assertEquals("Values are not equal", a, b);
  }
}
