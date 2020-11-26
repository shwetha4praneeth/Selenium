package jasonhuggins;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver","C:\\Users\\Gaurav\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
	}
}
