package com.qa.automation1;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import org.testng.annotations.Test;


public class AmazonLogin extends TestBase1{
	
	@Test
	public void login() throws InterruptedException
	{
		WebElement ele=AmazonOR.getaccountHover();
		act.moveToElement(ele).build().perform();
		
		AmazonOR.getsigninBtn().click();
		AmazonOR.getusernameBox().sendKeys("puspita110070@gmail.com");
		AmazonOR.getcontinuesignBtn().click();
		AmazonOR.getpasswordsignBox().sendKeys("Pass@123");
		
		boolean selected=AmazonOR.getKeepmesignedinBox().isSelected();
		SAssert.assertEquals(selected, true);
		
			Reporter.log("The check box is selected",true);
			AmazonOR.getKeepmesignedinBox().click();
			Thread.sleep(3000);
		AmazonOR.getloginBtn().click();
		Thread.sleep(2000);
		//System.out.println("Login Successful");
		Reporter.log("Login Successful", true);
	
		
		
		AmazonOR.getcategories().sendKeys("Books");
		AmazonOR.getsearchBox().sendKeys("Harry Potter");
		AmazonOR.getsearchBtn().submit();
		WebElement harry=AmazonOR.getharryLink();
		Js.executeScript("window.scrollBy(0,500)",harry);
		harry.click();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String childtab:windowHandles)
		{
			driver.switchTo().window(childtab);
		}
		//String title=driver.getTitle();
		//SAssert.assertEquals(title,true);
		System.out.println(driver.getTitle());
		AmazonOR.getaddtocartBtn().click();
		Thread.sleep(2000);
		AmazonOR.getaddtocartLink().click();
		System.out.println("Item added to cart");
		driver.navigate().back();
		AmazonOR.getproceedtobuyBtn().click();
		System.out.println("Inside buyer authetication page");
		}
		
	
	/*@DataProvider
	public String[][] getData1() throws Exception
	{
	
	
		String xlPath="C:\\Users\\puspi\\eclipse-workspace\\MyApplication\\src\\test\\java\\com\\qa\\Testdata3\\TestData3.xlsx";
		String xlSheet="Sheet2";
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
		return data;*/
	

	}	
		
		
	


