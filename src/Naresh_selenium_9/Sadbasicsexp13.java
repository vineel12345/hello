package Naresh_selenium_9;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sadbasicsexp13 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	}
public void compare()
{
	String pageSRC=driver.getPageSource();
	System.out.println(pageSRC);
	if(pageSRC.contains("please enter username and password!.............."))
	{
		System.out.println("the test case pass");
	}
	else
	{
		System.out.println("the testcase fail");
	}
	
		
	}
public void senddata() throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys("vineel123@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("kumar12345");
	Thread.sleep(2000);
	driver.findElement(By.id("Login")).click();
}
public void Screenshot() throws InterruptedException, IOException
{
	//how to take screenshot
	Thread.sleep(2000);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\HP\\Desktop\\vineel\\VINEEL.png");
	FileHandler.copy(src, des);
}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Sadbasicsexp13 obj=new Sadbasicsexp13();
		obj.LaunchAUT();
		obj.compare();
		obj.senddata();
		obj.Screenshot();

	}

}
