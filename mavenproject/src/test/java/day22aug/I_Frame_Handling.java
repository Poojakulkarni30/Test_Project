package day22aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_Frame_Handling {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			driver.manage().window().maximize();
		
			
		driver.switchTo().frame("iframeResult");
		//driver.findElement(By.id("iframeResult")).click();
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
