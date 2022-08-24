package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SugarCrm_Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
	WebElement test1=	driver.findElement(By.xpath("//input[@placeholder='How did you hear about us?']"));
		Actions action = new Actions(driver);
		action.moveToElement(test1);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		WebElement test = driver.findElement(By.xpath("//*[@id=\"interest_market_c0\"]"));
		test.click();
		driver.findElement(By.xpath("//*[@id=\"interest_sell_c0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"interest_serve_c0\"]")).click();
		System.out.println(test.isDisplayed());
		System.out.println(test.isSelected());
		driver.close();
	}

}
