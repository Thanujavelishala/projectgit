package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class contactuspage {
	public WebDriver driver;
	public ExtentTest test;
	public contactuspage(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body/div[@id='app']/div[contains(@class,'app-wrapper')]/div[@class='nb__14gx9']/header[@id='navheaderContainer']/nav[@id='navHeader']/div[@class='tp:hidden flex nb__34X7q']/div[@class='nb__31B79']/div[@id='main-menu']/div[1]//*[name()='svg']")
	WebElement menu;
	@FindBy(xpath="//span[@class='cursor-pointer']")
	WebElement contactus;
	
	public WebElement Menubar() {
		return menu;
	}
	public WebElement contactus() {
		return contactus;
	}
	}
