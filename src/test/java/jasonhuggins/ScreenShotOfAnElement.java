package jasonhuggins;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfAnElement 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		//Locate an element in page source
		WebElement e=driver.findElement(By.xpath("(//*[text()='Mobiles'])[1]"));
		//Get element screenshot as file
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\myscreenshot.png");
		FileHandler.copy(src,dest);
		//Close site
		driver.close();
	}
}
