package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base {
	public void verifyLocators()
	{
		driver.findElement(By.id("button-one")); 
		//By is a abstract class and id belongs to  that class.  id is a locator ,id is always unique
		driver.findElement(By.className("btn btn-primary"));
		//className is a locator. its not unique
		driver.findElement(By.tagName("button"));
		//tagname is a locator,not unique.
		driver.findElement(By.name("viewport"));
		//name is a locator,not unique.
		driver.findElement(By.linkText("Checkbox Demo"));
		//its a link text .
		driver.findElement(By.partialLinkText("Checkbox"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
