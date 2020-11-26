package jasonhuggins;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser
{	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\guitesting248\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}	
}
