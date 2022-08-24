package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("sydney");
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
