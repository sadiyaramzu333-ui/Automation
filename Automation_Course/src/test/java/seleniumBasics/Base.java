package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;     //webdriver intialization
	public void intializeBrowser()
	{
		driver = new ChromeDriver(); // launch browser
		//url up --- chrome 
		driver.get("https://selenium.qabible.in");  // url get
		driver.manage().window().maximize();  // to maximize automatically
	}
		public void  driverCloseAndQuit()
		{
			//driver.close();    //only close last window
			driver.quit();     // close All tab 
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.intializeBrowser();
		base.driverCloseAndQuit();
	}

}
