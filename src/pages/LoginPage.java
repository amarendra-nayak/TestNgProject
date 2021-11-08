package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	//===============WebElements========================
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(name="user_pwd")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Rememeber;
	
	@FindBy(name="btn_login")
	WebElement LoginButton;
	
	@FindBy(id="msg_box")
	WebElement Error;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//================Methods========================
	public void Login(String UName, String pwd) {
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Successfully clicked the Link");
		UserName.sendKeys(UName);
		test.log(LogStatus.PASS, "Enter UserName : " +UName, "Successfully Entered the Name");
		Password.sendKeys(pwd);
		test.log(LogStatus.PASS, "Enter Password : " +pwd, "Successfully Entered the Password");
        Rememeber.click();
		LoginButton.click();
		test.log(LogStatus.PASS, "Click Login Button", "Successfully clicked the Button");
	}
	
	public void ErrorCheck() {
		    
		String ActualMsg=Error.getText();
		String ExpectedMsg="The email or password you have entered is invalid.";
			
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualMsg, ExpectedMsg);
		soft.assertAll();	
	}

}
