package seleniumBasics;

public class BrowserAndNavigationCommand extends Base{
	public void browserCommand()
	{
		String title = driver.getTitle();  // getTitle method is used to get title 
		System.out.println(title);
		String source = driver.getPageSource();  //Get full HTML source of the current page
		System.out.println(source);
		String url = driver.getCurrentUrl();  // Get the current page URL
		System.out.println(url);
		String handle_id = driver.getWindowHandle();
		System.out.println(handle_id);     //handle id get
		

	}
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommand command = new BrowserAndNavigationCommand();
		command.intializeBrowser();
		//command.browserCommand();
		command.navigationCommand();
		
		

	}

}
