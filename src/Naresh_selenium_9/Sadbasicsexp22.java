package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp22 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
}
public void senddata() throws InterruptedException
{
	driver.findElement(By.cssSelector("#email")).sendKeys("9848939090");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#pass")).sendKeys("vineelkumar");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[name=login]")).click();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp22 obj=new Sadbasicsexp22();
		obj.LaunchAUT();
		obj.senddata();

	}

}
