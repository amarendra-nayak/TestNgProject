package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	//BeforeTest will get executed only once before the @Test, doesn't matter how many classes or test cases are there
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("Inside BeforeTestMethod");
	}
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("Inside BeforeClassMethod");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void Setup() {
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void Teardown() {
		System.out.println("Inside After Method");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("Inside AfterClassMethod");
	}
	
	//AfterTest will get executed only once after the @Test
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("Inside AfterTestMethod");
	}


}
