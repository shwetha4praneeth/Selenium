package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSSValue 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Locate gmail link element
		WebElement e=driver.findElement(By.linkText("Gmail"));
		//Before focusing on element
		String x1=e.getCssValue("text-decoration");
		String y1=e.getCssValue("opacity");
		System.out.println("Before focus:");
		System.out.println(x1+ " " +y1);
		//Move focus on to the element
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(5000);
		//After focusing on element
		String x2=e.getCssValue("text-decoration");
		String y2=e.getCssValue("opacity");
		System.out.println("After focus:");
		System.out.println(x2+ " " +y2);
		
		//Test case:1
		if(x2.startsWith("underline"))
		{
			System.out.println("Element text was underlined after getting focused");
		}
		else
		{
			System.out.println("Element text was not underlined after getting focused");
		}
		
		//Test case:2	
		float f=Float.parseFloat(y2); //Type conversion from string to float
		if(f<1)
		{
			System.out.println("Element color was shaded after getting focused");
		}
		else
		{
			System.out.println("Element color was not shaded after getting focused");
		}
		//Close site
		driver.close();
	}
}
