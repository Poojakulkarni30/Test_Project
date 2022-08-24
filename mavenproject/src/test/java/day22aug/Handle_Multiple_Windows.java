package day22aug;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Multiple_Windows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
		
		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);

		Iterator<String> switches = handles.iterator();
		String parent = switches.next();
		System.out.println("parent window handle " + parent);
		String child = switches.next();
		
		System.out.println("child window handle "+child);
		
		driver.switchTo().window(child);
		driver.findElement(By.name("UserFirstName")).sendKeys("ABC");
		driver.findElement(By.name("UserLastName")).sendKeys("XYZ");
		driver.switchTo().window(parent);

		driver.quit();
	}

}
