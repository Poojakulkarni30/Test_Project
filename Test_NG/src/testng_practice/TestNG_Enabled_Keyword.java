package testng_practice;

import org.testng.annotations.Test;

public class TestNG_Enabled_Keyword {
	
	
@Test(priority=0)
	
	
	public void login() {
		
		System.out.println("login method");
	}
	@Test(priority=1)
	
	
	public void HomePage() {
		
		System.out.println("HomePage open ");
	}
	
	@Test(priority=2, enabled=false)
	
	
	public void Logout() {
		
		System.out.println("logout method");
	}
}


