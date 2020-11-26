package jasonhuggins;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailComposeCrossBrowser
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		System.out.println("Enter userid");
		String uid=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		//Open required browser
		RemoteWebDriver driver = null;
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver","operadriver.exe");
			driver=new OperaDriver();
		}
		else if(bn.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Enter correct browser name");
			System.exit(0);
		}
		//To maximize browser window
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys(uid);
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(pwd,Keys.ENTER);
		Thread.sleep(5000);
		//Click on compose & fill fields
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("shwethapraneeth09@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("My first automated program");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi Dear \nHow are you? \nI miss you. \nBye");
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String l=driver.findElement(By.xpath("//*[text()='Message sent.']")).getText();
		System.out.println(l);
		//Do logout
		driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]/child::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);		
		//Close site	
		driver.close();
	}
}
