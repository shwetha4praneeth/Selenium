package jasonhuggins;

import org.openqa.selenium.opera.OperaDriver;

public class GoogleWithOpera 
{
	public static void main(String[] args) 
	{
		//Open google site using opera browser
		System.setProperty("webdriver.opera.driver","C:\\Users\\Gaurav\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("http://www.google.co.in");
	}
}
