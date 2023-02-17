package Naresh_selenium_9;

import org.openqa.selenium.By;
     
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sadbasicsexp20 {
WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	Thread.sleep(1000);
	driver.manage().window().maximize();
}
public void File_information() throws InterruptedException 
{
	driver.findElement(By.name("UserFirstName")).sendKeys("pavan");
	Thread.sleep(1000);
	driver.findElement(By.name("UserLastName")).sendKeys("kalyan");
	Thread.sleep(1000);
	driver.findElement(By.name("UserEmail")).sendKeys("pavan123@gmail.com");
	Thread.sleep(1000);
}
public void job_title_drop_down() throws InterruptedException
{
	driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
	driver.findElement(By.name("CompanyName")).sendKeys("wells");
	Thread.sleep(1000);
}
public void employees_drop_down() throws InterruptedException
	{
		driver.findElement(By.name("UserPhone")).sendKeys("7887978879");
		Thread.sleep(1000);
		WebElement we=driver.findElement(By.name("CompanyEmployees"));
		Select slcobj=new Select(we);
		slcobj.selectByIndex(3);
		Thread.sleep(1000);
		slcobj.selectByValue("250");
		Thread.sleep(1000);
	}

public void county_region() throws InterruptedException
{
	WebElement we2=driver.findElement(By.name("CompanyCountry"));
	Select slcobj2=new Select(we2);
	slcobj2.selectByIndex(98);
	Thread.sleep(1000);
	slcobj2.selectByValue("IN");
	driver.findElement(By.className("checkbox-ui")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("start my free trial")).click();
	Thread.sleep(1000);
}

	public static void main(String[] args) throws InterruptedException {
		Sadbasicsexp20  obj=new Sadbasicsexp20 ();
		obj.LaunchAUT();
		obj.File_information();
		obj.job_title_drop_down();
		obj.employees_drop_down();
obj.county_region();
	}

}
