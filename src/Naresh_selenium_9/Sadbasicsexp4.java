package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp4 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	// lets wait some time
	Thread.sleep(2000);
	// active window min to max
	driver.manage().window().maximize();
}
public void gettile()
{
	String title=driver.getTitle();
	System.out.println(title);
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp4 obj=new Sadbasicsexp4();
		obj.LaunchAUT();
		obj.gettile();
         
	}

}
