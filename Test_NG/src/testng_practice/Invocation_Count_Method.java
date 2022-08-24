package testng_practice;

import org.testng.annotations.Test;

public class Invocation_Count_Method {

@Test (invocationCount=5)
	
	public void dog() {
		
		System.out.println("dog is barking");
	}
	
	@Test(invocationCount=7)
	
	public void sleep() {
		
		System.out.println("dog is sleeping");
	}
}
