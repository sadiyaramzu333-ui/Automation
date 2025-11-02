package automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;     //webdriver intialization
	
	@BeforeMethod
	public void intializeBrowser()
	{
		driver = new ChromeDriver(); // launch browser
		//url up --- chrome 
		driver.get(" https://www.saucedemo.com/v1/");  // url get
		driver.manage().window().maximize();  // to maximize automatically
	}
	@AfterMethod
		public void  driverCloseAndQuit()
		{
			//driver.close();    //only close last window
			//driver.quit();     // close All tab 
		}

}
