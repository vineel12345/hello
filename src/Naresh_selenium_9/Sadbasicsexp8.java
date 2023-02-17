package Naresh_selenium_9;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasicsexp8 {
public void LaunchAUT() throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter expected number");
	int count=sc.nextInt();
	for(int i=0;i<=count;i++)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
	}
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp8 obj=new Sadbasicsexp8();
		obj.LaunchAUT();

	}

}
