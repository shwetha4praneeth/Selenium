package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAndCSSValue 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Locate search box element
		WebElement e=driver.findElement(By.name("q"));
		//Get html attribute value
		String x=e.getAttribute("Maxlength");
		System.out.println("Maxlength value is "+x);
		//Get CSS attribute value
		String y=e.getCssValue("background-color");
		System.out.println("Background color is "+y);
		//Close site
		driver.close();
	}
}
