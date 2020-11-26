package jasonhuggins;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		//Get title
		String x=driver.getTitle();
		System.out.println(x);
		//Get page source
		String y=driver.getPageSource();
		System.out.println(y);
		//Get Current Url
		String z=driver.getCurrentUrl();
		System.out.println(z);
		driver.close();
	}
}
