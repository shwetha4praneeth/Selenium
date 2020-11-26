package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmailAccount 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.silentOutput","true");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Create account']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[text()='For myself']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Shwetha");
		driver.findElement(By.name("lastName")).sendKeys("Praneeth");
		driver.findElement(By.name("Username")).sendKeys("shwpraguddu");
		driver.findElement(By.name("Passwd")).sendKeys("pran_143");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("pran_143");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("9986007114");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
