package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Cases {

	@Test(priority=1)
	public void testCase1() {
		System.out.println("1st running");
	}
	
	@Test(priority=2)
	public void TestCase2() {
		System.out.println("2nd running");
	}

   @Test(priority=3)
   
   public void testcase3() {
	   
	   Reporter.log("checking Reporter", true);
   }
}


