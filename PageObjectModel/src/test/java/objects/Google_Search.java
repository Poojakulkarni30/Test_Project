package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_Search {

	WebDriver driver;


	// Create a Constructor

	public Google_Search(WebDriver driver) {

		this.driver = driver;

	}

	By search_box = By.xpath("//input[@title='Search']");
	By search_btn = By.xpath("(//input[@tabindex='0'])[1]");
	By FaceBook_Link = By.xpath("//a//h3[text()='Facebook - log in or sign up']");

	

	
	public void searchongoogle(String searchinput) {

		try {
			driver.findElement(search_box).sendKeys(searchinput);
			driver.findElement(search_btn).click();
			Thread.sleep(2000);


		} catch (Exception e) {

			System.out.println("Exception catched " + e.getMessage());
		}

	}
	

	public void Facebook_Click() {
		try {
			
			driver.findElement(FaceBook_Link).click();
			Thread.sleep(2000);
		}
			
		catch (Exception e) {
			
			System.out.println("Exception catched " + e.getMessage());

		}
	}
		
		
	
}