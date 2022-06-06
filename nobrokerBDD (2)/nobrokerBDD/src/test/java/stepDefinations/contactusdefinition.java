package stepDefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.contactuspage;
import utilities.BaseTest;

public class contactusdefinition  extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	
	@When("click on menu bar")
	public void click_on_menu_bar() {
		contactuspage cp=new contactuspage(driver,test);
		cp.Menubar().click();
		log.info("menu bar is loaded");
		test.info("menubar is loaded");
	}

	@When("Enter the contactus")
	public void Enter_the_contactus() throws InterruptedException {
		contactuspage cp=new contactuspage(driver,test);
		cp.contactus().click();
		log.info("contact us displayed at the right colonel");
		test.info("contact us is dipslayed at the right colonel");
		Thread.sleep(3000);
	}

	}
