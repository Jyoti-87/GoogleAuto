package Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSingup{
	
public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "E://SEL//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);

		driver.get("https:/www.google.com/");
	
	//	Thread.sleep(2000);
	//	driver.switchTo().alert().dismiss();
	//	driver.findElement(By.linkText("Create an account"));
		
		//driver.close();
	//	driver.findElement(By.xpath(".//a[@text='NO, THANKS']"));
//		if (
//				driver.findElement(By.xpath(".//a[text()='NO, THANKS']")).isDisplayed())
//				driver.findElement(By.xpath(".//a[text()='NO, THANKS']")).click();
//		else System.out.println("No pop up found");
		
	
				
		driver.findElement(By.linkText("Gmail")).click();
		String parentpage=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create an account')][1]")).click();
	
		
		Set<String> list= driver.getWindowHandles();
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			if(parentpage!=(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
			
			
		}
		
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("user");
		driver.findElement(By.id("username")).sendKeys("neetus.sajwan");
		driver.findElement(By.xpath(".//div[@class='Xb9hP']//input[@name='Passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath(".//div[@class='Xb9hP']//input[@name='ConfirmPasswd']")).sendKeys("Test@123");
		driver.findElement(By.xpath(".//span[text()='Next']")).click();
		driver.findElement(By.id("phoneNumberId")).sendKeys("7678176616");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.navigate().refresh();
		
//		driver.get(driver.getCurrentUrl());
		driver.findElement(By.xpath("//content/span[(text()='Next')]")).click();
		
}
	}
