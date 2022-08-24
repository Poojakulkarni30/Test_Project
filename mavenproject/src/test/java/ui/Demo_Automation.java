package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Automation {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\New_ChromeDriver\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		
		
}
}