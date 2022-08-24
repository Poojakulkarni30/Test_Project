package day22aug;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		WebElement lisa = driver.findElement(By.xpath(
				"//div[39]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1] "));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("window.scrollBy(0,700)");

		// js.executeScript("window.scrollBy(0,-500)");

		js.executeScript("arguments[0].scrollIntoView()", lisa);

		Thread.sleep(20000);
		lisa.click();
	
		System.out.println(lisa);

	}

}
