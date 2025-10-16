package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	public void verifyDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdowns = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropdowns);
		//select.selectByIndex(2);
		//select.selectByValue("c#");	
		select.selectByVisibleText("SQL");
	}
	public void verifyCheckBox()
	
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkboxes = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkboxes.click();
	}
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
		System.out.println(radio.isSelected());

	}

	public static void main(String[] args) {
		// TODO Auto-generated  stub
		HandlingDropDown drop = new HandlingDropDown();
		drop.intializeBrowser();
		//drop.verifyDropDown();
		//drop.verifyCheckBox();
		drop.verifyRadioButton();

	}

}
