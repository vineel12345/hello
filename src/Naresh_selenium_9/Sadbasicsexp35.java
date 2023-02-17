package Naresh_selenium_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp35 {
WebDriver driver;
JavascriptExecutor jse;
public void LaunchAUT()
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
public void Get_Title()
{
	jse=(JavascriptExecutor)driver;
	String title=jse.executeScript("return document.title").toString();
	System.out.println(title);
}
public void PageSRC()
{
	jse=(JavascriptExecutor)driver;
	String pagesrc=jse.executeScript("return document.documentElement.innerText;").toString();
	System.out.println(pagesrc);
}
	public static void main(String[] args) {
		Sadbasicsexp35 obj=new Sadbasicsexp35();
		obj.LaunchAUT();
		obj.Get_Title();
		obj.PageSRC();

	}

}
