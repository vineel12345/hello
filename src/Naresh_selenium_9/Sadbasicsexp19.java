package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp19 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
}
public void Navigate() throws InterruptedException
{
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp19 obj=new Sadbasicsexp19 ();
		obj.LaunchAUT();
		obj.Navigate();

	}

}
