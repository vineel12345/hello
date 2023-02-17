package Naresh_selenium_9;

import java.time.Duration;

  
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sadbasicsexp32 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
public void Explicity_wait()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account & Lists']")));	
we.click();

}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp32  obj=new Sadbasicsexp32 ();
		obj.LaunchAUT();
		obj.Explicity_wait();
	}

}
