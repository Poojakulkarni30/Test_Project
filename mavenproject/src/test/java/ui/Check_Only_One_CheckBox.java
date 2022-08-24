package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Only_One_CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='btn btn-light active']")).click();
		WebElement test	=driver.findElement(By.xpath("(//span[@class='rct-title'])[1]"));
		
		test.click();

		System.out.println(test.isDisplayed());
		System.out.println(test.isEnabled());
		System.out.println(test.isSelected());
		driver.close();
	}

}
