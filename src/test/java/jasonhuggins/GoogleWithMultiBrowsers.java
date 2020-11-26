package jasonhuggins;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleWithMultiBrowsers 
{
	public static void main(String[] args) 
	{
		//Open google site using firefox or edge browser
		System.setProperty("webdriver.gecko.driver","D:\\guitesting248\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","D:\\guitesting248\\msedgedriver.exe");
		EdgeDriver driver2=new EdgeDriver();
		driver1.get("https://www.google.com/");
		driver2.get("https://www.google.com/");
	}
}
