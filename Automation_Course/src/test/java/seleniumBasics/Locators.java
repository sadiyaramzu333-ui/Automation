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
		
		driver.findElement(By.cssSelector("button[id='button-one']"));
		//css selector
		
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button-----absolute xpath   
		driver.findElement(By.xpath("//button[@id='button-two']"));
		
		driver.findElement(By.xpath("//button[text()='Show Message']"));   //without id ,using text
		
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));  //and
		
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//or
		
		driver.findElement(By.xpath(" //div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
