package Naresh_selenium_9;

import java.io.File;
   
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sadbasicsexp33 {
WebDriver driver;
JavascriptExecutor jse;
public void LaunchAUT() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
}
public void click() throws InterruptedException
{
	WebElement login_click=driver.findElement(By.id("Login"));
	jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", login_click);
	Thread.sleep(1000);
}
public void senddata() throws InterruptedException
{
	WebElement unname=driver.findElement(By.id("username"));
	jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='vineelnaidu@gmail.com';", unname);
	Thread.sleep(1000);
	WebElement pass=driver.findElement(By.id("password"));
	jse.executeScript("arguments[0].value='9090909090';", pass);
	 Thread.sleep(1000);
	
}
public void Highlight()
{
	WebElement pass=driver.findElement(By.id("password"));
	jse.executeScript("arguments[0].style='border:5px solid yellow';", pass);
}
public void Screenshot() throws InterruptedException, IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des= new File("C:\\Users\\HP\\Desktop\\og\\OG.png");
	FileHandler.copy(src, des);
	Thread.sleep(1000);
	
}
	 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Sadbasicsexp33 obj=new Sadbasicsexp33();
		obj.LaunchAUT();
		obj.senddata();
		obj.click();
		obj.Highlight();
		obj.Screenshot();
	}

}
