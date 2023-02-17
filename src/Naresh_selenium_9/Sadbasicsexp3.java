package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp3 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	// lets wait some time
	Thread.sleep(2000);
	//active window min to max
	driver.manage().window().maximize();
	driver.close();
}
public void CloseAUT()
{
	driver.close();
}
	public static void main(String[] args) throws InterruptedException{
	
		Sadbasicsexp3 obj=new Sadbasicsexp3();
		obj.LaunchAUT();
	 	obj.CloseAUT();
		
		
		
	}

		
	}


