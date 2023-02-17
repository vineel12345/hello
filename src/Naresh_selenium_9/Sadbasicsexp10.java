package Naresh_selenium_9;

import java.util.Scanner;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sadbasicsexp10 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter valid application url");
	String url=sc.nextLine();
	System.out.println("please enter expected result");
	String exp_title=sc.nextLine();
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage() .window().maximize();
	driver.get(url);
	String act_title=driver.getTitle();
	System.out.println(act_title);
	driver.close();
	if(exp_title.equalsIgnoreCase(act_title))
	{
		System.out.println("the test case pass");
		Thread.sleep(2000);
	}
	else
	{
		System.out.println("the test case fail");
		
	
	}
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp10  obj=new Sadbasicsexp10 ();
		obj.LaunchAUT();

	}

}
