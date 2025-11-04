package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="user-name") WebElement usernamefeild ;
	@FindBy(id="password")WebElement passwordfeild;
	@FindBy(id="login-button")WebElement loginbutton;
	
	
	
	
	
	public void enterUsernameOnUsernameField()
	{
		usernamefeild.sendKeys("standard_user");

	}
	public void enterPasswordOnPasswordField()
	{
		passwordfeild.sendKeys("secret_sauce");

	}
	public void clickOnLoginButton()
	{
		loginbutton.click();

	}

}
