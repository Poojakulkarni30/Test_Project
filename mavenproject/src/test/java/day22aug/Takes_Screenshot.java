package day22aug;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takes_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scrn= (TakesScreenshot)driver;
		
		File Src= scrn.getScreenshotAs(OutputType.FILE);
		File des= new File("F:\\SOFTWRE TESTING-  POOJAK\\Seleniummmm\\ScreenShot_Capture\\abc.png");
		
		FileHandler.copy(Src, des);
		driver.close();
	}

}
