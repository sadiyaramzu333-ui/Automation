package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement choosefile = driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys("C:\\Users\\sadiy\\git\\Automation\\Automation_Course\\src\\test\\resources\\copiolot.pdf");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitbtn = driver.findElement(By.id("submitbutton"));
		submitbtn.click();
		
		}
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
		WebElement submitfile = driver.findElement(By.id("pickfiles"));	
		submitfile.click();
		StringSelection selection = new StringSelection("C:\\Users\\sadiy\\git\\Automation\\Automation_Course\\src\\test\\resources\\copiolot.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		
		
		
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload file = new HandlingFileUpload();
		
		file.intializeBrowser();
		//file.fileUploadUsingSendKeys();
		try {
			file.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
