package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledOrDisabledElement 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser & launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		Thread.sleep(5000);
		//Locate element in page source
		WebElement e1=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(e1);
		WebElement e=driver.findElement(By.name("lname"));
		//Locate element in page
		if(e.isDisplayed())
		{
			System.out.println("Visible in page");
			//Enabled or disabled
			if(e.isEnabled())
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("Disabled");
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
