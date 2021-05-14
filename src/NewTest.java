import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	@BeforeMethod
	void thisIsBeforeMethod() {
		System.out.println ("This is before method");
	}
  @Test
  public void f() {
	  
	  System.out.println("This is the Atual test");
  }
  
  @Test
  public void f1() {
	  
	  System.out.println("This is the Atual test");
  
  }
  
  void justMethod() {
	  
	  System.out.println("This is just a Method");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("This is the before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This is the after class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This is the before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("This is the After test");
  }

}
