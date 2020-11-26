package jasonhuggins;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlSecuredOrNot 
{
	public static void main(String[] args) 
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.sentia.in");   //base url
		//Get current Url
		String x=driver.getCurrentUrl();   //Get converted url & check for https
		if(x.startsWith("https"))
		{
			System.out.println("Secured site");
		}
		else
		{
			System.out.println("Unsecured site");
		}
		//Close site
		driver.close();
	}
}
