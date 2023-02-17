package Naresh_selenium_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp31 {


WebDriver driver;
JavascriptExecutor jse;
public void LaunchAUT()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=in");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

}
public void username()
{
	jse=(JavascriptExecutor)driver;
	WebElement we=driver.findElement(By.id("username"));
	jse.executeScript("arguments[0].value='vineeltesting@gmail.com';",we);
	
}
public void clicklogin()
{ 
	jse=(JavascriptExecutor)driver;
	WebElement L_click=driver.findElement(By.id("Login"));
	jse.executeScript("arguments[0].click();", L_click);
}
public void password()
{
	jse=(JavascriptExecutor)driver;
	WebElement pass=driver.findElement(By.id("password"));
	jse.executeScript("arguments[0].value='kumarmandapati';", pass);
}

	public static void main(String[] args) {
		Sadbasicsexp31  obj=new Sadbasicsexp31 ();
		obj.LaunchAUT();
		obj.username();
		obj.password();
		obj.clicklogin();
	}

}
