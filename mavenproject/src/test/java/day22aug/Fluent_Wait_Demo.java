package day22aug;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait_Demo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement hover = driver.findElement(By.linkText("Electronics"));
	
		Actions hovering = new Actions(driver);
		hovering.moveToElement(hover).perform();
		
	Wait  <WebDriver>wait=new FluentWait <WebDriver> (driver).
				withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(5)).
				ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Apple"))).click();

		driver.close();
		
	}

}
