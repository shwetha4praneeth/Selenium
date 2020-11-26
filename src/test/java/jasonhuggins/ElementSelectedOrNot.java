package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSelectedOrNot 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser & launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		//Locate element in page source
		WebElement e=driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]"));
		//Locate element in page
		if(e.isDisplayed())
		{
			System.out.println("Visible in page");
			//Element selected or not
			if(e.isSelected())
			{
				System.out.println("Selected");
			}
			else
			{
				System.out.println("Not selected");
			}
		}
		else
		{
			System.out.println("Hidden");
		}
		//Close site
		driver.close();
	}
}
