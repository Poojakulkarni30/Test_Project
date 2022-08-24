package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Alll_Links {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		 		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		
List <WebElement> tags=		driver.findElements(By.tagName("a"));
		System.out.println("total tags are "+ tags.size() );
		
		for(int i=0;i<tags.size();i++) {
			
			//System.out.println("Links On the page are = "+tags.get(i).getAttribute("href"));
			System.out.println("Links on the page are "+ tags.get(i).getText());
			driver.quit();
			
		
		}
	}

}
