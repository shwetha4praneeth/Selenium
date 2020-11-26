package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate element in page source
		WebElement e1=driver.findElement(By.xpath("(//div[@class='text'])[1]"));
		//Get text of the element, which is visible in page
		String x=e1.getText();
		System.out.println(x);
		//Locate element in page source
		WebElement e2=driver.findElement(By.xpath("(//div[@class='text'])[1]/following::div[2]"));
		String y=(String)driver.executeScript("return(arguments[0].textContent);",e2);
		System.out.println(y);
		//Close site
		driver.close();
	}
}
