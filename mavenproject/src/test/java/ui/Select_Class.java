package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@data-test='login-button']")).click();

		WebElement drop = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select selectt = new Select(drop);
		
 	selectt.selectByIndex(3);
       Thread.sleep(2000);
	selectt.selectByValue("lohi");
	Thread.sleep(2000);
		selectt.selectByVisibleText("Name (Z to A)");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
