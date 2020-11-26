package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibleOrHiddenElement 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and Launch
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Locate element in page source
		WebElement e=driver.findElement(By.name("hiddenPassword"));
		//Locate element in page
		if(e.isDisplayed())
		{
			System.out.println("Visible in page");
		}
		else
		{
			System.out.println("Hidden Element");
		}
		//Close site
		driver.close();
	}
}
