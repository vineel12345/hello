package Naresh_selenium_9;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp24 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.nopcommerce.com/en/demo");
Thread.sleep(2000);
driver.manage().window().maximize(); 
}
public void multiwindow() throws InterruptedException
{
	String prerent_window=driver.getWindowHandle();
	driver.findElement(By.xpath("//span[text()='Admin area']")) .click();
	Set<String>allwindows=driver.getWindowHandles();
	for(String handle:allwindows)
	{
		if(!handle.equals(prerent_window))
		{
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("Email")).sendKeys("vineel@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("vineel34");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Log in']"));
		}
	}
}
		public void closeAUT()
		{
		driver.quit();	

		}
	

	public static void main(String[] args) throws InterruptedException {
		 Sadbasicsexp24 obj=new  Sadbasicsexp24();
		 obj.LaunchAUT();
		 obj.multiwindow();
		 obj.closeAUT();

	}

}
