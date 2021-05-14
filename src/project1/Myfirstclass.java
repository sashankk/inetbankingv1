package project1;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myfirstclass


{


	public static void main(String[] args) throws InterruptedException 
	{
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sasha\\Desktop\\Selenium practice\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.canadiantire.ca");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("global-atlas-search__input"));
		search.click();
		search.sendKeys("Celing fan");
		
		//WebElement search = driver.findElement(By.name("q"));
		//search.sendKeys("canadain tire");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@id='global-search_submit']")));
		
	//Thread.sleep(3000);
		
		//driver.quit();
	}
	
	
	
	
	
}
