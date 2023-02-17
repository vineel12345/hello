package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasicsexp18 {
WebDriver driver;
String bro1="chrome";
String bro2="Firefox";
public void LaunchAUT() throws InterruptedException 
{
	Sadbasicsexp18 obj=new Sadbasicsexp18(); 
	if(obj.bro1.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new  ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
	 
	}

	
	 if(obj.bro2.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Data\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();	
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
	}
	else
	{
		System.out.println("the browser not found");
		
	}
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp18  obj=new Sadbasicsexp18 ();
		obj.LaunchAUT();

	}

}
