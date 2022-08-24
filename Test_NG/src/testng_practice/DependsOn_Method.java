package testng_practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOn_Method {

	
@Test(priority=0)
	
	
	public void login() {
		
		System.out.println("login method");
	}
	@Test(priority=1)
	
	
	public void HomePage() {
		
		System.out.println("HomePage open ");
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(true, false);
		soft.assertAll();
	}
	
	@Test(priority=2, dependsOnMethods="HomePage")
	
	
	public void Logout() {
		
		System.out.println("logout method");
	}
}
