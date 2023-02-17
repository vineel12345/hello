package Naresh_selenium_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp5 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");


//lets wait some time    
Thread.sleep(2000);
// active window min to max
driver.manage().window().maximize();
}
public void gettile()
{
	String Act_result=driver.getTitle();
 	// system.out.println(act_result)
	String exp_result="online shopping site for mobiles,electronices,furniture,grocery,lifestyle,booking more";
	if(Act_result.equalsIgnoreCase(exp_result))
	{
		System.out.println("the test case pass");
	}
	else
	{
		System.out.println("the testcase fail");
		
		
		
	}
		
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp5 obj=new Sadbasicsexp5();
		obj.LaunchAUT();
obj.gettile();
	}

}
