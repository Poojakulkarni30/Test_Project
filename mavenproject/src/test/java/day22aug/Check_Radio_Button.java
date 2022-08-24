package day22aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Radio_Button {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		WebElement test= driver.findElement(By.id("redeemFlights"));
		
		test.click();
		System.out.println(test.isDisplayed());
		System.out.println(test.isEnabled());
		System.out.println(test.isSelected());
		driver.close();
	}

}
