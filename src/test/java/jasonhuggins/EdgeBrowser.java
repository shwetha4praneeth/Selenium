package jasonhuggins;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","D:\\batch248\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	}
}
