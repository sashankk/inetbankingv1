package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warning("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.warning("Login Passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean isAlertPresent() //user defined method created to check alert is present or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
	}
		catch(NpAlertPresentException e)
		{
			return false;
		}
	}
	@DataProvider(name="LoginData")
 String[][]getdata()
 {
	String path=System.getProperty("user.dir")+"/src/com/inetbanking/testData/LoginDetails.xlsx";
	
	int rownum = XLUtils.getRowCount(path,"Sheet1");
	int colcount = XLUtils.getCellCount(path,"Sheet1",1);
	
	String logindata[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
		{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);//1 0
		}
		}
	return logindata;
 }
}
