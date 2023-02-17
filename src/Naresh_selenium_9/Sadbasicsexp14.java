package Naresh_selenium_9;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasicsexp14 {
WebDriver driver;
public void LaunchAUT()
{
	System. setProperty("webdriver.gecko.driver","D:\\Selenium Data\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();	
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
}
public void senddata() throws InterruptedException
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}
public static void main(String[] args) throws InterruptedException  {
	Sadbasicsexp14 obj=new Sadbasicsexp14();
	obj.LaunchAUT();
	obj.senddata();

	}

}
