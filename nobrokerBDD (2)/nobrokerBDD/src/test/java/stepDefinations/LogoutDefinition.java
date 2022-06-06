package stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.logoutpage;
import utilities.BaseTest;
import utilities.ReadConfig;

public class LogoutDefinition extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	
	public String excellocation=readconfig.Excel();
	
	@Given("user on Home Page")
	public void user_on_home_page() throws InterruptedException
	{
		logoutpage lp = new logoutpage(driver,test);
		log.info("website is opened");
		test.info("website is opened");
	}
	@When("click on profile")
	public void click_on_proifle() throws InterruptedException {
		logoutpage lp = new logoutpage(driver,test);
		lp.profile_click().click();
		log.info("prfile menu is opened");
		test.info("profile menu is opened");
		Thread.sleep(2000);
	}
	@When("click on logout")
	public void click_on_sigin() throws InterruptedException {
		logoutpage lp=new logoutpage(driver,test);
		lp.logout_click().click();
		log.info("logged out successfully");
		test.info("logged out successfully");
		Thread.sleep(3000);
	}

	//	}

}
