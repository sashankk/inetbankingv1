package project1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;



public class DataPrvdr {
	
	@DataProvider (name="authentication")
	public Object[][] name(){
		
		String t[][] = {{"id","password"},{"id2","password2"}};
		
		return t;
	}
	
	
  @Test(dataProvider="authentication", description = "This is my description")
  public void f(String username, String password) {
	  
	  System.out.println("The user name is" +username);
	  System.out.println("The password is " +password);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
