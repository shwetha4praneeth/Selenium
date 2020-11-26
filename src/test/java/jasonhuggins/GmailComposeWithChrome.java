package jasonhuggins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailComposeWithChrome 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser & launch site
		System.setProperty("webdriver.chrome.driver","D:\\guitesting248\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http:www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("shwethapraneeth09");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("pran_143");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("shwethapraneeth9@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Automating mail");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi, \n My automated mail \n Bye");
		driver.findElement(By.xpath("(//div[starts-with(@aria-label,'Send')])[2]")).click();
		Thread.sleep(5000);
		String op=driver.findElement(By.xpath("//*[@class='vh']/span")).getText();
		System.out.println(op);
		driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]/child::*")).click();
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
