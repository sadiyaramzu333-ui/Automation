package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutor extends Base{
	public void verifyJsExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']")); 
 		 
	 		JavascriptExecutor js = (JavascriptExecutor)driver; //casting process
	 		js.executeScript("arguments[0].click();", showMessageButton);//clicking  button
	 		js.executeScript("window.scrollBy(0,350)", "");  //scroll down  
	  		//js.executeScript("window.scrollBy(0,-350)", "");//scroll up
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsExecutor executor = new JsExecutor();
		executor.intializeBrowser();
		executor.verifyJsExecutor();
		

	}

}
