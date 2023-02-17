package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasicsexp29 {
WebDriver driver;
Actions actobj;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
}
public void mouse_Actions() throws InterruptedException 
{
	WebElement src=driver.findElement(By.xpath("//a[text()='Desktops']"));
	WebElement des=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	actobj=new Actions(driver);
	Thread.sleep(2000);
	actobj.moveToElement(src).moveToElement(des).click().build().perform();
	Thread.sleep(1000);
	
	
	
}

	public static void main(String[] args) throws InterruptedException {
		
		Sadbasicsexp29 obj=new Sadbasicsexp29();
		obj.LaunchAUT();
		obj.mouse_Actions();
	}

}
