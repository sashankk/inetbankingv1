package ThisSuper;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestThis extends Parent{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sasha\\Desktop\\Selenium practice\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mynme is sashank");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		ts.getScreenshotAs(OutputType.FILE);
		
		
		
		
		driver.quit();
	}

}
