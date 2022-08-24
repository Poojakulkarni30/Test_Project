package objects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory_Model {
	
	WebDriver driver;


	// Create a Constructor

	public Page_Factory_Model(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@title='Search']") WebElement search_box;
	@FindBy(xpath="(//input[@tabindex='0'])[1]") WebElement search_btn;
	@FindBy(xpath="//a//h3[text()='Facebook - log in or sign up']") WebElement FaceBook_Link;
	

	

	
	public void searchongoogle(String searchinput) {

		try {
			search_box	.sendKeys(searchinput);
			search_btn.click();
			Thread.sleep(2000);


		} catch (Exception e) {

			System.out.println("Exception catched " + e.getMessage());
		}

	}
	

	public void Facebook_Click() {
		try {
			
			FaceBook_Link.click();
			Thread.sleep(2000);
		}
			
		catch (Exception e) {
			
			System.out.println("Exception catched " + e.getMessage());

		}
	}
		
		
	

}
