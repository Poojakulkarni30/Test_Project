package day22aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(iframe);

		WebElement silder1 = driver.findElement(
				By.xpath("//div[@id='red']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		WebElement silder2 = driver.findElement(
				By.xpath("//div[@id='green']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		WebElement silder3 = driver.findElement(
				By.xpath("//div[@id='blue']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		
		Actions slider=new Actions(driver);
		slider.dragAndDropBy(silder1, -100, 111).perform();
		slider.dragAndDropBy(silder2, -85, 90).perform();
		slider.dragAndDropBy(silder3, -70, 45).perform();
		
		driver.close();
	}

}
