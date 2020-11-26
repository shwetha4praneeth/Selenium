package jasonhuggins;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAndHandles
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Get window handle
		String x=driver.getWindowHandle();
		System.out.println();
		//Click on gmail link & then click on "sign in" link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(5000);
		//Get all browser windows or tabs handles
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		//Close active browser window & related browser windows/tabs
		driver.quit();
	}
}
