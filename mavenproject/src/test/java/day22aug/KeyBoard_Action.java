package day22aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();

		WebElement key1 = driver.findElement(By.xpath("//div[@id='dropZone']//div[@class='CodeMirror-sizer']"));

		Actions copy = new Actions(driver);

		copy.keyDown(key1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		WebElement key2 = driver.findElement(By.xpath("//div[@id='dropZone2']//div[@class='CodeMirror-scroll']"));
				
		
		copy.keyDown(key2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		driver.close();
	}

}
