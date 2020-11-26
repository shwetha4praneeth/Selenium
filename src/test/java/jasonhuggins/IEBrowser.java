package jasonhuggins;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","D:\\guitesting248\\IEDriverServer_x64_3.150.1\\iedriverserver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}
}
