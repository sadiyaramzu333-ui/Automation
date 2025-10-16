package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("sadiya");
		
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		showmessagebutton.click();
		
		WebElement yourtext = driver.findElement(By.xpath("//div[@id='message-one']"))	;
		System.out.println(yourtext.getText()); //getText
		
		WebElement gettotalbutton = driver.findElement(By.id("button-two"));
		System.out.println(gettotalbutton.getTagName());//getTagName
		
		System.out.println(showmessagebutton.getCssValue("background-color")); //getCssValue
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands = new WebElementCommands();
		commands.intializeBrowser();
		commands.verifyCommands();
		

	}

}
