package day22aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_MouseAction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));
		
		Actions draganddrop=new Actions(driver);
		draganddrop.dragAndDrop(drag, drop).build().perform();
	}

}
