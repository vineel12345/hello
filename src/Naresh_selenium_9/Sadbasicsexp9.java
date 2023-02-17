package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp9 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.manage().window().maximize();
}
public void senddata() throws InterruptedException
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
}
	public static void main(String[] args) throws InterruptedException {
		 Sadbasicsexp9 obj=new  Sadbasicsexp9();
		 obj.LaunchAUT();
		 obj.senddata();
	}

}
