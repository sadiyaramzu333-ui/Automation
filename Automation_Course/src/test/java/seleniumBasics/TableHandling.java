package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement tables = driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(tables.getText());
		WebElement tablerow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tables = new TableHandling();
		tables.intializeBrowser();
		tables.verifyTable();
		

	}

}
