  package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp6 {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void current_url()
{
	String url=driver.getCurrentUrl();
	System.out.println("the current url is:"+url);
}
public void getpageSRC()
{
	String page_src=driver.getPageSource();
	System.out.println(page_src);
	
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp6 obj=new Sadbasicsexp6();
		obj.LaunchAUT();
		obj.getpageSRC();
		obj.current_url();

	}

}
