package test_scenario;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Facebook_Page;
import objects.Google_Search;
import objects.Page_Factory_Model;

public class Test_Methods {

	WebDriver driver;
	Google_Search objectrepo;
	Facebook_Page objectrepo1;
	
	Page_Factory_Model pfm;

	@BeforeTest

	public void browserlaunch() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

	}

	@Test(priority = 0)

	public void SearchOperation() {

		//Google_Search page = new Google_Search(driver);
	//	page.searchongoogle("facebook");

		
		pfm= new Page_Factory_Model(driver);
		pfm.searchongoogle("facebook");
		

	}

	@Test (priority = 1,enabled=false)

	public void VerifyFbAccess() {

		objectrepo = new Google_Search(driver);
		objectrepo.Facebook_Click();
	}

	@Test (priority = 2, enabled=false)

	public void logintoFB() {
		
		objectrepo1 =new Facebook_Page(driver);
		objectrepo1.Enter_Username();
		objectrepo1.Enter_Password();
		objectrepo1.Login_FB();

	}

	@AfterTest

	public void TearDown() {

		driver.quit();
	}

}
