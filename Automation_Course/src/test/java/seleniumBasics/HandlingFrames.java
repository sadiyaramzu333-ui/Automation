package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());//total crames finding 
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1); // switch control to frame
		
		WebElement frameheading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		
		driver.switchTo().defaultContent();//switch back
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frame = new HandlingFrames();
		frame.intializeBrowser();
		frame.verifyFrames();

	}

}
