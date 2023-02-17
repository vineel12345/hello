package Naresh_selenium_9;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasicsexp28 {
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
public void right_click()
{
	actobj=new Actions(driver);
	WebElement we=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
	actobj.contextClick(we).build().perform();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp28 obj=new Sadbasicsexp28();
		obj.LaunchAUT();
		obj.right_click();
	}

}
