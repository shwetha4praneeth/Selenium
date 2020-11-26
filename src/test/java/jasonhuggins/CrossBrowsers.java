package jasonhuggins;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowsers 
{
	public static void main(String[] args) 
	{
		//Open any browser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		RemoteWebDriver driver;
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\guitesting248\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\guitesting248\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","D:\\guitesting248\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver","D:\\guitesting248\\IEDriverServer_x64_3.150.1\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.close();
	}
}
