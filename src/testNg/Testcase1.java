package testNg;


import org.testng.annotations.Test;


public class Testcase1 extends BaseClass{
	
	
	
	//"description" is used to mention the description about a test case
	@Test(priority=2,description ="This test case is use to test the Home Loan Functionality")
	public void HomeLoanTest() {
		System.out.println("Inside HomeLoanTest");
	}
	
	@Test(priority=1)
	public void HomeLoanTest1() {
		System.out.println("Inside HomeLoanTest1");
	}
	
	//If we use "enable (i.e. enabled =false)", we can specify if we want to execute a particular test case or not
	//To mention multiple features we can use ',' in between. And all these features are optional so we may or may not mention it.
	@Test(priority=0,groups= {"Sanity"}, description="This test case is use to test the Car Loan Functionality")
	public void CarLoanTest() {
		System.out.println("Inside CarLoanTest");
	}
	
	
}
