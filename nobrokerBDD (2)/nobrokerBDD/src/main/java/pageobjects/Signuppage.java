package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Signuppage {

	public WebDriver driver;
	public ExtentTest test;
	
	public Signuppage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='nb__19hcF'][normalize-space()='Sign up']")
	WebElement signupButton;
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	WebElement phoneNummber;

	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement signupsubmit;

	@FindBy(xpath="//input[@id='login-signup-form__name-input']")
	WebElement name;

	@FindBy(xpath="//input[@id='login-signup-form__email-input']")
	WebElement email;

	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement submit;
	public WebElement signup_click()
	{
		return signupButton;
	}
	public WebElement phoneNo()
	{
		return phoneNummber;
	}
	public WebElement continuesignup()
	{
		return signupsubmit;

	}
	public WebElement name()
	{
		return name;

	}
	public WebElement email()
	{
		return email;

	}
	public WebElement submit()
	{
		return submit;

	}
}
