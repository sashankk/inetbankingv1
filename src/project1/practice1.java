package project1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sasha\\Desktop\\Selenium practice\\chromedriver.exe");
	                WebDriver driver = new ChromeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
					driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
					driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
					
					if(driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")).isDisplayed()) 
						
					{
						System.out.println("Successfully logged in");
						
						
					}
					
					driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
					
					
					
					driver.quit();
					
	}
}
