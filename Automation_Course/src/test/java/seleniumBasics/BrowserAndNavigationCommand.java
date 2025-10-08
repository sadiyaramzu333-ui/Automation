package seleniumBasics;

public class BrowserAndNavigationCommand extends Base{
	public void browserCommand()
	{
		String title = driver.getTitle();  // getTitle method is used to get title 
		System.out.println(title);
		String source = driver.getPageSource();
		System.out.println(source);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommand command = new BrowserAndNavigationCommand();
		command.intializeBrowser();
		command.browserCommand();
		

	}

}
