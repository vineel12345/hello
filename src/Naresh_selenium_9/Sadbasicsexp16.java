package Naresh_selenium_9;

import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasicsexp16 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter browser name");
	// chrome
	String browser=sc.nextLine();
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("fire"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Data\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("browser not found");
		
	}
	driver.get("https://www.salesforce.com/in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	
}
	public static void main(String[] args) throws InterruptedException {
	Sadbasicsexp16 obj=new Sadbasicsexp16();
	obj.LaunchAUT();

	}

}
