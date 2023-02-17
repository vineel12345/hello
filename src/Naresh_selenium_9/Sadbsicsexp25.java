package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbsicsexp25 {
WebDriver driver;
Actions actobj;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.manage().window().maximize();
actobj=new Actions(driver);
actobj.sendKeys(Keys.ESCAPE).build().perform();
}
public void senddata() throws InterruptedException 
{
	 WebElement search=driver.findElement(By.name("q"));
	 actobj=new Actions(driver);
	 //Type 2 process
	 actobj.sendKeys(search,"java with selenium").perform();
	 Thread.sleep(1000);
	 actobj.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
}
public void get_pageSRC()
{
	String data=driver.getPageSource();
	if(data.contains("java with selenium"))
	{
		System.out.println("is there");
	}
	else
	{
		System.out.println("is not there");
		
	}	
	}
	public static void main(String[] args) throws InterruptedException {
	
		Sadbsicsexp25 obj=new Sadbsicsexp25();
		obj.LaunchAUT();
		obj.senddata();
		obj.get_pageSRC();
	}

}
