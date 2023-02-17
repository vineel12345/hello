package Naresh_selenium_9;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp7 {
public void LaunchAUT() throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("mr.vineel please provide any url in console");
	String url=sc.nextLine();
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
	public static void main(String[] args) throws InterruptedException {
		
		Sadbasicsexp7 obj=new Sadbasicsexp7();
		obj.LaunchAUT();
	}

}
