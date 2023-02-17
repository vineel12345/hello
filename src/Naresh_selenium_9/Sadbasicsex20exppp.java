package Naresh_selenium_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sadbasicsex20exppp {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	Thread.sleep(1000);
	driver.manage().window().maximize();
}
public void Fill_information() throws InterruptedException
{
	driver.findElement(By.name("UserFirstName")).sendKeys("vineel");
	Thread.sleep(1000);
	driver.findElement(By.name("UserLastName")).sendKeys("kumar");
	Thread.sleep(1000);
	driver.findElement(By.name("UserEmail")).sendKeys("vineel2345@gmail.com");
	Thread.sleep(1000);
}
public void job_title_drop_down() throws InterruptedException
{
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select slcobj=new Select(we);
		slcobj.selectByVisibleText("IT Manger");
		Thread.sleep(1000);
		slcobj.selectByIndex(3);
		driver.findElement(By.name("CompanyName")).sendKeys("wells");
		Thread.sleep(1000);
	}
	public void Employees_drop_down()throws InterruptedException
	{
	
		WebElement we2=driver.findElement(By.name("CompanyEmployees"));
		Select slcobj1=new Select(we2);
		slcobj1.selectByIndex(3);
		Thread.sleep(1000);
		slcobj1.selectByValue("950");
		Thread.sleep(1000);
		driver.findElement(By.name("UserPhone")).sendKeys("9889790000");
		Thread.sleep(1000);
		
	}
	public void county_region() throws InterruptedException
	{
		WebElement we3=driver.findElement(By.name("CompanyCountry"));
		Select slcobj2=new Select(we3);
		slcobj2.selectByIndex(98);
		Thread.sleep(1000);
		slcobj2.deselectByValue("IN");
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("start my free trial")).click();
		Thread.sleep(1000);
	
		
	
	}
	public static void main(String[] args) throws InterruptedException {
		Sadbasicsex20exppp  obj=new Sadbasicsex20exppp ();
		obj.LaunchAUT();
		obj.Fill_information();
		obj.job_title_drop_down();
		obj.Employees_drop_down();
		obj.county_region();

	}

}
