package com.qa.automation1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages1.AmazonPages;

public class TestBase1 {
	
	WebDriver driver;
	Actions act;
	JavascriptExecutor Js;
	AmazonPages AmazonOR;
	SoftAssert SAssert;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Webdriver_selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Webdriver_selenium\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("Internet Explorer"))
		{
			System.setProperty("webdriver.InternetExplorer.driver", "C:\\Program Files\\Webdriver_selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		AmazonOR= new AmazonPages(driver);
		act= new Actions(driver);
		Js=(JavascriptExecutor)driver;
		driver.get(Url);
		SAssert=new SoftAssert();
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(Source, target);
		System.out.println("Screenshot captured");
	}

}



