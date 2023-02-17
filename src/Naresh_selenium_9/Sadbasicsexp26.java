package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasicsexp26 {
WebDriver driver;
Actions actobj;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();	
 driver.get("https://jqueryui.com/droppable/");
 Thread.sleep(1000);
 driver.manage().window().maximize();
 
	
}
public void drag_down() throws InterruptedException
{
	driver.switchTo().frame(0);
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement des=driver.findElement(By.id("droppable"));
	actobj=new Actions(driver);
	actobj.dragAndDrop(src, des).perform();
	Thread.sleep(1000);
	
	
}
public void count_frame()
{
	int count=driver.findElements(By.tagName("iframe")).size();
	System.out.println(count);
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp26 obj=new Sadbasicsexp26();
		obj.LaunchAUT();
		obj.drag_down();
		obj.count_frame();

	}

}
