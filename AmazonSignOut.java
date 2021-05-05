package com.qa.automation1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonSignOut extends TestBase1{
		
	
		
		@Test(priority=1)
		public void signout() throws InterruptedException, IOException
		{
			
			captureScreenshot(driver,"signout");
			
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
		}
			
			@Test(priority=2)
			public void signout1() throws InterruptedException, IOException
			{
			captureScreenshot(driver,"signout1");
			WebElement ele1=AmazonOR.getaccountHover();
			act.moveToElement(ele1).build().perform();
			AmazonOR.getsignoutLink().click();
			Thread.sleep(3000);
			System.out.println("Sign Out Successful");
			}
			
			
		}
		
		
		


