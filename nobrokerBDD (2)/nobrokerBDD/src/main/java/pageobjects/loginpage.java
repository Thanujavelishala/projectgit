




package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class loginpage {

	public WebDriver driver;
	public ExtentTest test;
	
	public loginpage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='nb__19hcF'][normalize-space()='Log in']")
	WebElement login;
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	WebElement phoneno;

	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement logincontinue;

	@FindBy(xpath="//label[@for='login-signup-form-login-radio-password']")
	WebElement selectpassword;

	@FindBy(xpath="//input[@id='login-signup-form__password-input']")
	WebElement password;

	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement submit;
	public WebElement tologin()
	{
		return login;
	}
	public WebElement enter_number()
	{
		return phoneno;
	}
	public WebElement click_continue()
	{
		return logincontinue;

	}
	public WebElement chosePassword()
	{
		return selectpassword;

	}
	public WebElement password()
	{
		return password;

	}
	public WebElement login()
	{
		return submit;

	}
}
