package jasonhuggins;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}	
}
