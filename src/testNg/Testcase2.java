package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends BaseClass{
	
	@Test(groups= {"Sanity"}, dependsOnMethods="CCTest")
	public void CreditCardTest() {
		System.out.println("Inside CreditCardTest");
	}
	
	@Test(groups= {"Sanity"})
	public void CCTest() {
		System.out.println("Inside CCTest");
	}
	

}
