package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.TestNGBase;
import pages.LoginPage;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyUserLoginWithValidCredentials()
	{
		//WebElement usernamefeild = driver.findElement(By.id("user-name"));
		//usernamefeild.sendKeys("standard_user");
		//WebElement passwordfeild = driver.findElement(By.id("password"));
		//passwordfeild.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//loginbutton.click();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnLoginButton();
		
				
		
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword()
	{
		WebElement usernamefeild = driver.findElement(By.id("user-name"));
		usernamefeild.sendKeys("standard_userss");
		WebElement passwordfeild = driver.findElement(By.id("password"));
		passwordfeild.sendKeys("secret_sauce");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();

	}
	@Test
	public void VerifyUserLoginWithValidUsernameAndInvalidPassword()
	{
		WebElement usernamefeild = driver.findElement(By.id("user-name"));
		usernamefeild.sendKeys("standard_user");
		WebElement passwordfeild = driver.findElement(By.id("password"));
		passwordfeild.sendKeys("secret_sauces");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();

	}
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	{
		WebElement usernamefeild = driver.findElement(By.id("user-name"));
		usernamefeild.sendKeys("standard_users");
		WebElement passwordfeild = driver.findElement(By.id("password"));
		passwordfeild.sendKeys("secret_sauces");
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();
	}

}
