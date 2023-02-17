package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasicsexp17 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	String[]browsers= {"chrome","firefox"};
	
	for(String browser:browsers)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();	
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.close();
	}
		else if(browser.equalsIgnoreCase("Firefox"))	
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Data\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("the browser not found");
		}
	}
			
		}

	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp17 obj=new Sadbasicsexp17();
		obj.LaunchAUT();

	}

}
