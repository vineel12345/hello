package Naresh_selenium_9;


import org.openqa.selenium.JavascriptException;
  import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp34 {
WebDriver driver;
JavascriptExecutor jse;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
}
public void scroll_to_top_to_bottom() throws InterruptedException
{
	jse=(JavascriptExecutor)driver;
      jse.executeScript ("window.scrollTo(0,document.body.scrollHeight)");
 Thread.sleep(1000);
 jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
 
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp34  obj=new Sadbasicsexp34 ();
		obj.LaunchAUT();
		obj.scroll_to_top_to_bottom();
	}

}
