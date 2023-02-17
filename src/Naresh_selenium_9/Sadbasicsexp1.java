package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp1 {
	public void LaunchAUT()
	{
		// intillze driver path
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
		// need to create common object 
		WebDriver driver=new ChromeDriver();
		
	}
	public static void main(String[] args) {
		Sadbasicsexp1 obj=new Sadbasicsexp1();
		obj.LaunchAUT();

	}

}
