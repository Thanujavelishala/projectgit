package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class logoutpage {

	public WebDriver driver;
	public ExtentTest test;
	
	public logoutpage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='nb__3XgbA']")
	WebElement profileButton;
	@FindBy(xpath="//div[normalize-space()='Sign Out']")
	WebElement logout;

		public WebElement profile_click()
	{
		return profileButton;
	}
	public WebElement logout_click()
	{
		return logout;
	}
	}
