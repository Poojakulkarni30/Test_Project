package testng_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Soft_Assertion {

	
	public static WebDriver driver;
	
	@BeforeTest()

	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win2\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}
	
	@Test(priority = 0)

	public void geturl() {

	String url= driver.getCurrentUrl();
	
	Assert.assertEquals(url, "https://www.saucedemo.com/");
	System.out.println("the expected url is");

}
	@Test(priority=1)
	
	public void gettitle() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@AfterTest()
	
	public void closebrowser() {
		
		driver.quit();
	}
}
