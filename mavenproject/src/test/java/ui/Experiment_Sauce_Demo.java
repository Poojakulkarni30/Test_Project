package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Experiment_Sauce_Demo {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@data-test='login-button']")).click();

		String handle1 = driver.getWindowHandle();
		System.out.println(handle1);
		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();

		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("//a[@href='https://www.sugarcrm.com/au/request-demo/']")).click();
		Set<String> a = driver.getWindowHandles();
		System.out.println(a);
	}

}
