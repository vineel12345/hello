package Naresh_selenium_9;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp2 {
public void LaunchAUT()
{
	// intillze driver path
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe" );
   // need to create common object
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
	public static void main(String[] args) {
		Sadbasicsexp2 obj=new Sadbasicsexp2();
		obj.LaunchAUT();

	}

}
