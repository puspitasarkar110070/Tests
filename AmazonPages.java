package com.qa.pages1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	
	WebDriver driver;

	public AmazonPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement accountHover;
	
	public WebElement getaccountHover()
	{
		return accountHover;
	}
	
	@FindBy(linkText="Start here.")
	WebElement starthere;
	
	public WebElement getstarthere()
	{
		return starthere;
	}
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement UsernameBox;
	
	public WebElement getUsernameBox()
	{
		return UsernameBox;
	}
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement phnoBox;
	
	public WebElement getphnoBox()
	{
		return phnoBox;
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailBox;
	
	public WebElement getemailBox()
	{
		return emailBox;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordBox;
	
	public WebElement getpasswordBox()
	{
		return passwordBox;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	public WebElement getcontinueBtn()
	{
		return continueBtn;
	}
	
	@FindBy(linkText="Sign in")
	WebElement signinBtn;
	
	public WebElement getsigninBtn()
	{
		return signinBtn;
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement usernameBox;
	
	public WebElement getusernameBox()
	{
		return usernameBox;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuesignBtn;
	
	public WebElement getcontinuesignBtn()
	{
		return continuesignBtn;
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwordsignBox;
	
	public WebElement getpasswordsignBox()
	{
		return passwordsignBox;
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginBtn;
	
	public WebElement getloginBtn()
	{
		return loginBtn;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")
	WebElement KeepmesignedinBox;
	
	public WebElement getKeepmesignedinBox()
	{
		return KeepmesignedinBox;
	}
	
	@FindBy(id="searchDropdownBox")
	WebElement categories;
	public WebElement getcategories()
	{
		return categories;
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	public WebElement getsearchBox()
	{
		return searchBox;
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchBtn;
	
	public WebElement getsearchBtn()
	{
		return searchBtn;
	}
	
	@FindBy(xpath="//span[contains(text(),'Harry Potter and the Goblet of Fire – Gryffindor E')]")
	WebElement harryLink;
	
	public WebElement getharryLink()
	{
		return harryLink;
	}
	
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]")
	WebElement computerLink;
	
	public WebElement getcomputerLink()
	{
		return computerLink;
	}
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocartBtn;
	
	public WebElement getaddtocartBtn()
	{
		return addtocartBtn;
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[4]/div[1]/div[5]/div[7]/div[2]/a/span[1]")
	WebElement buynow1;
	
	public WebElement getbuynow1()
	{
		return buynow1;
	}
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement addtocartLink;
	
	public WebElement getaddtocartLink()
	{
		return addtocartLink;
	}
	
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	WebElement proceedtobuyBtn;
	
	public WebElement getproceedtobuyBtn()
	{
		return proceedtobuyBtn;
	}
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	WebElement signoutLink;
	
	public WebElement getsignoutLink()
	{
		return signoutLink;
	}

}


