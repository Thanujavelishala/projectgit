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
import pageobjects.loginpage;
import utilities.BaseTest;
import utilities.ReadConfig;

public class LoginDefinition extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	
	public String excellocation=readconfig.Excel();
	
	@Given("user lands in Home Page")
	public void user_lands_in_Home_Page() throws InterruptedException
	{
		loginpage lp = new loginpage(driver,test);
		log.info("website is opened");
		test.info("website is opened");
	}
	@When("click on login")
	public void click_on_login() throws InterruptedException {
		loginpage lp = new loginpage(driver,test);
		lp.login().click();
		log.info("login page is displayed");
		test.info("login page is dissplayed");
		Thread.sleep(2000);
	}
	@Then("enter the phone number")
	public void enter_the_phone_number() throws InterruptedException {
		loginpage lp = new loginpage(driver,test);
		
	}
	@When("click on continue")
	public void click_on_continue() throws InterruptedException  {
		loginpage lp = new loginpage(driver,test);
		lp.click_continue().click();
		log.info("continue the login process is displayed");
		test.info("continuetion of loginc pocess is displayed");
		Thread.sleep(3000);
		
	}
	@And("select the password from radio button")
	public void select_the_password_from_radio_button() throws InterruptedException {
		loginpage lp=new loginpage(driver,test);
		lp.chosePassword().click();
		log.info("password input is displayed");
		test.info("password input is displayed");
		Thread.sleep(3000);
	}

	@When("Enter the password from excel")
	public void enter_the_password_from_excel() throws IOException, InterruptedException {
		loginpage lp=new loginpage(driver,test);
		File scr1=new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		lp.password().sendKeys(password);
		log.info("password entered successfully");
		test.info("password entered successfully");
		lp.login().click();
		Thread.sleep(2000);
	}

	//@Then("Logout button verification")
	//public void logout_button_verification() {
		//log.info("Verifying the Signout button");
		//test.info("Verifying the Signout button");
		//Loginpage lp=new Loginpage(driver,test);
		//Assert.assertTrue(lp.Logout_validate().isDisplayed());
		
	
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		String expectedTitle = "Challenge– Bigsmall.in";
//		assertEquals(expectedTitle,actualTitle);

//	}

}
