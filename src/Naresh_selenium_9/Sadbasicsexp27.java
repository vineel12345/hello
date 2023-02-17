package Naresh_selenium_9;

import org.openqa.selenium.By;

   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasicsexp27 {
WebDriver driver;
Actions actobj;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
Thread.sleep(1000);
driver.manage().window().maximize();
}
public void double_click() throws InterruptedException
{
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	actobj=new Actions(driver);
	WebElement we=driver.findElement(By.xpath("//p[contains(text (),'Double-click this paragraph to trigger a function.')]"));
	actobj.doubleClick(we).build().perform();
}
public void print_text()
{
	String data=driver.findElement(By.xpath("//p[contains(text(),'Hello World ')]")).getText();
	System.out.println(data);
}
	public static void main(String[] args) throws InterruptedException {
		
		 Sadbasicsexp27 obj=new  Sadbasicsexp27 ();
		 obj.LaunchAUT();
		 obj.double_click();
		 obj.print_text();
	}

}
