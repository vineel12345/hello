package Naresh_selenium_9;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp21 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
 	}
	public void clickok() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}
	public void clickon_cancel() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
	}
	public void senddata() throws InterruptedException
	{
	driver.findElement(By.linkText("Reset")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("vineel23@gamil.com");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	}
	public void get_text() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(3000);
		String data=driver.switchTo().alert().getText();
		System.out.println(data);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	public void closeAUT()
	{
   		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp21 obj=new Sadbasicsexp21();
		obj.LaunchAUT();
		obj.clickok();
		obj.clickon_cancel();
		obj.senddata();
		obj.get_text();
		obj.closeAUT();

	}

}
