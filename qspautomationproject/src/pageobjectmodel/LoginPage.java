package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration 

	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="KeepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement Logo;
	@FindBy(id="licenseLink") private WebElement licenseLink;


	//initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLogo() {
		return Logo;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}

	//generic reusable method

	public void actiTimevalidLogin(String validUsername,String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(2000);
	}
	public void actiTimeinvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
	}
}

//operational method


