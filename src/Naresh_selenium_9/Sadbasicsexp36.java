package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sadbasicsexp36 {
WebDriver driver;
JavascriptExecutor jse;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
}
public void Refresh()
{
	jse=(JavascriptExecutor)driver;
	jse.executeScript("history.go(0);");
	
}
public void Alert() throws InterruptedException
{
	jse=(JavascriptExecutor)driver;
	jse.executeScript("alert('welcome to amzon mr vineel naidu');");
	Thread.sleep(1000);
	
	
}
public void Click_Expected()
{
	jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000);");
	WebElement we=driver.findElement(By.xpath("//img[@alt='Fresh']"));
	we.click();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp36 obj=new Sadbasicsexp36();
		obj.LaunchAUT();
		obj.Refresh();
	   obj.Alert();
	//obj.Click_Expected();
		

	}

}
