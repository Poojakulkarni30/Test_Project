package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_Page {

	WebDriver driver;

	// Create a Constructor

	public Facebook_Page(WebDriver driver) {

		this.driver = driver;

	}

	By Facebook_UserName = By.xpath("//input[@id='email']");
	
	By Facebook_Password = By.xpath("//input[@placeholder='Password']");
	
	By FB_Click = By.xpath("//button[@value='1']");

	public void Enter_Username() {

		driver.findElement(Facebook_UserName).clear();

		driver.findElement(Facebook_UserName).sendKeys("poojakulkarni352gmail.com");
	}

	public void Enter_Password() {
		
		driver.findElement(Facebook_Password).clear();
		
		driver.findElement(Facebook_Password).sendKeys("Harangulkd97@");

	}

	public void Login_FB() {

		driver.findElement(FB_Click).click();
		String title= driver.getTitle();
		assertEquals(title, "Facebook – log in or sign up");
	}

}
