package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage {
  
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//elements
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement  lnkRegister;
	
	
		@FindBy(linkText="Login")//login linked add to 
		WebElement linkLogin;
		
	//Action Method 
	public void clickonmyaccount() {
		lnkMyaccount.click();
		
	}
	public void clickonregister () {
		lnkRegister.click();
	}
	public void clickonLogin() {
		linkLogin.click();
	}
	
}
