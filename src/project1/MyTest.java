package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest 
{

	public static void main(String[] args) 
	
	{
			
			//	System.setProperty("webdriver.chrome.driver","C:\\Users\\sasha\\Desktop\\chrome\\chromedriver.exe");
			//	WebDriver driver =new ChromeDriver();
				//driver.get("https://www.kijiji.ca/");
				//driver.manage().window().maximize();
				//driver.findElement(By.xpath("//*[@id=\"MainContainer\"]/div[1]/div/header/div[3]/div[1]/div/div[2]/div/div[2]/div/a[2]")).click();
				//driver.get("https://opensource-demo.orangehrmlive.com/");
				
				MyTest C1= new MyTest();
				C1.add();
				C1.SUB();
			int storenum=	C1.AddingBIG();
			System.out.println("MyAdditionBig is "+storenum);
			
		String MyNameIs=	C1.MyName();
		System.out.println("My Name is " +MyNameIs);

	}
	
	public void add()
	{
		
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println("My Addition is "+c);
		
		
	}
	

	public void SUB()
	{
		
		int D=10;
		int E=2;
		int F=D-E;
		System.out.println("My SUBSTRACTION is "+F);
		
	}
	
	public int AddingBIG() 
	{
		
		int i,j,k;
		 i =1000;
		 j=2000;
		 k =i+j;
		return k;
		
	}
	public String MyName() {
		
		
		String N="Shashank";
		return N;
	}
	

}
