package com.qa.automation1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility1.ExcelUtility1;

//import com.qa.utility1.ExcelUtility1;



public class AmazonSignIn extends TestBase1{
	

	@Test(dataProvider="getData")
	public void AmazonCreateAccount(String name,String phno,String mail,String pass) throws InterruptedException, IOException

	{
		
		captureScreenshot(driver,"AmazonCreateAccount");
		WebElement ele=AmazonOR.getaccountHover();
		act.moveToElement(ele).build().perform();
		
		AmazonOR.getstarthere().click();
		
		String title=driver.getTitle();
		SAssert.assertEquals(title, "Amazon Registration");
		
		Reporter.log(title, true);
	
		AmazonOR.getUsernameBox().sendKeys(name);
		AmazonOR.getphnoBox().sendKeys(phno);
		AmazonOR.getemailBox().sendKeys(mail);
		AmazonOR.getpasswordBox().sendKeys(pass);
		AmazonOR.getcontinueBtn().click();
		Thread.sleep(3000);
		
		String title1=driver.getTitle();
		SAssert.assertEquals(title1, "Authentication required");
		
		Reporter.log(title1,true);
		SAssert.assertAll();
		System.out.println("Registration Successful");
		
	}
	
	
	@DataProvider
	public String[][] getData() throws Exception
	{
	
	
		String xlPath="C:\\Users\\puspi\\eclipse-workspace\\MyApplication\\src\\test\\java\\com\\qa\\Testdata3\\TestData3.xlsx";
		String xlSheet="Sheet1";
		int rowCount= ExcelUtility1.GetRowCount(xlPath, xlSheet);
		
		int cellCount= ExcelUtility1.GetCellCount(xlPath, xlSheet, rowCount);
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility1.GetCallData(xlPath, xlSheet, i, j);
			}
		}
		return data;
	
	
	
	}
}
