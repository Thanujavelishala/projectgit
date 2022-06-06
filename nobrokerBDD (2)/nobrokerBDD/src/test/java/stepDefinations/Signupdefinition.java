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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.BaseTest;
import utilities.ReadConfig;

public class Signupdefinition extends BaseTest {
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	
	public String excellocation=readconfig.Excel();
	
	@Given("user lands on Home Page")
	public void user_lands_on_Home_Page() throws InterruptedException
	{
		Signuppage lp = new Signuppage(driver,test);
		log.info("website is opened");
		test.info("website is opened");
	}
	@When("click on signup")
	public void click_on_proifle() throws InterruptedException {
		Signuppage lp = new Signuppage(driver,test);
		lp.Signup_click().click();
		log.info("signup page is displayed");
		test.info("sign up page is displayed");
		Thread.sleep(2000);
	}
	@When("give phone number   ")
	public void click_on_sigin() throws InterruptedException {
		Loginpage lp=new Loginpage(driver,test);
		lp.Login_click().click();
		log.info("to move to next step");
		test.info("maove to next step");
		Thread.sleep(3000);
	}

	@When("Enter the email and name from excel")
	public void enter_the_email_and_password_from_excel() throws IOException, InterruptedException {
		Signuppage lp=new Signuppage(driver,test);
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
		lp.Email().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");
		lp.Password().sendKeys(password);
		log.info("name entered successfully");
		test.info("name entered successfully");
		lp.Sign_in().click();
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
