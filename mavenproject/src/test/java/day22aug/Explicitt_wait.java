package day22aug;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitt_wait {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement hover = driver.findElement(By.linkText("Electronics"));
	
		Actions hovering = new Actions(driver);
		hovering.moveToElement(hover).perform();

		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Apple"))).click();
	driver.close();
	
	}

}
