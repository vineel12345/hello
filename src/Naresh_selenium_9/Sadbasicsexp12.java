package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp12 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
}
public void senddata(String username,String password) throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys( username);
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.id("Login")).click();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp12 obj=new Sadbasicsexp12();
		obj.LaunchAUT();
		obj.senddata("vineel12@gmail.com", "naidu123");
		obj.senddata("kumar1234@gmail.com", "kumar56777");
		obj.senddata("kalyan23@gmail.com", "kalyan7890");

	}

}
