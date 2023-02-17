 package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp11 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void senddata() throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys("vineelnaidutesting");
	driver.findElement(By.id("password")).sendKeys("vknaidu1234");
	Thread.sleep(2000);
	driver.findElement(By.id("Login")).click();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp11 obj=new Sadbasicsexp11();
		obj.LaunchAUT();
		obj.senddata();

	}

}
 