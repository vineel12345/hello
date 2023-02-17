 package Naresh_selenium_9;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sadbasicsexp15 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.edge.driver","D:\\Selenium Data\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
    driver.manage().window().maximize();


}
public void senddata() throws InterruptedException
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
	Thread.sleep(5000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}

	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp15  obj=new Sadbasicsexp15();
		obj.LaunchAUT();
		obj.senddata();

	}

}
