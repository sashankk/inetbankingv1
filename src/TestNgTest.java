



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgTest {
	
	WebDriver driver;
	
  @BeforeClass
  public void openBrowser() {
	  
	  System.out.println("This is my first test case");
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sasha\\Desktop\\Selenium practice\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=Lesh9vqfUnU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJvYXV0aF9rZXkiOiJMZXNoOXZxZlVuVSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjE5NTYyNDg4LCJpYXQiOjE2MTk1NjEyODgsImp0aSI6IjhhYjlhMmJmLWE1YzItNDI5MC1iMTRhLTdhNTJlNzU3YmFkOSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.vWWL9_rd9doNRccgrKAARC_BKPCO7Dc39rQYgP13I9c8Hnk1BzwzHupeJfeSNtOQYVgwCaJVsMtxxGqqF3anegWRusK7eyPTyNyAQmvIDLH11M_NPQwNOCIeCwxs63I98nbC0jcLJBlPA9V6A4JDRTxwvrEag0whtYthxiJvKYM7IFVadzaGrK_gEAlfldTjIru0V3WyTOEwlqzZVH7J_p7baynzlV7SBBBVpQlGRn24OXF_i0G68ZuGEJuvt08JL9032d0AelVqd7YoHfqz82YXn5faK6S3rusZx7sBqk79OhETv8S3nOG4DMm6At4j11yQSWwfmakfsFhCkcpBmQ&preferred_environment=");
  }

  @Test
  public void firstTest() throws InterruptedException {
	  
	  System.out.println("This is my first test case wrong credentials");
	  driver.findElement(By.xpath("//input[@id='usernameInput-input']")).sendKeys("fake id");
	  driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys("fake password");
	  driver.findElement(By.xpath("//*[@id=\"signIn\"]/span")).click();
	  
	  Thread.sleep(3000);
	  
	  WebElement err_msg = driver.findElement(By.xpath("//*[@id=\"globalError\"]/div/div[2]"));
	  
	  Assert.assertTrue(err_msg.isDisplayed());
	  
	  System.out.println("The test case is failed");
	  
	  
}
  @Test
  public void gopiTest() {
	  
	  System.out.println("This is my second test case");
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//	  driver.quit();
	  
  }
}


