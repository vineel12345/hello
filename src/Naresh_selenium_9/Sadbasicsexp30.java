package Naresh_selenium_9;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasicsexp30 {
WebDriver driver;
Actions actobj;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(1000);
driver.manage().window().maximize();
}
public void senddata() throws InterruptedException
{
	actobj=new Actions(driver);
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	actobj.sendKeys(search,"selenium").perform();
	//actobj.sendKeys(Keys.DOWN).perform();
	//actobj.sendKeys(Keys.DOWN).perform();
	//actobj.sendKeys(Keys.DOWN).perform();
	//actobj.sendKeys(Keys.DOWN).perform();
	//actobj.sendKeys(Keys.DOWN).perform();
	for(int i=1;i<=6;i++)
	{
		actobj.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
	}
	actobj.sendKeys(Keys.ENTER).perform();
}

	public static void main(String[] args) throws InterruptedException {
		 Sadbasicsexp30  obj=new  Sadbasicsexp30 ();
		 obj.LaunchAUT();
		 obj.senddata();

	}

}
