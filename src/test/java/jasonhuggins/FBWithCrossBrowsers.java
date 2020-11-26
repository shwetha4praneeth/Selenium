package jasonhuggins;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FBWithCrossBrowsers 
{
	public static void main(String[] args) 
	{
		//Launch facebook site using chrome browser or ie browser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		RemoteWebDriver driver;   //declare object
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver","D:\\guitesting248\\IEDriverServer_x64_3.150.1\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get("https://www.facebook.com/");
	}
}
