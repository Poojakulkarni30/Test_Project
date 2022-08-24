package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Multiple_Option {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.anhtester.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Input Forms']")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();

		WebElement test = driver.findElement(By.id("multi-select"));

		Select demo = new Select(test);
		demo.selectByIndex(1);
		demo.selectByValue("Ohio");
		List<WebElement> ref = demo.getAllSelectedOptions();
		System.out.println(ref.size());
		demo.deselectAll();
		
		
		

	}

}
