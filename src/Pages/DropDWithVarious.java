package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDWithVarious {
	
	public static void main(String[] arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\SEL\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
//		wd.get("https://semantic-ui.com/modules/dropdown.html");
//		wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		
//		WebElement el=wd.findElement(By.xpath("//div[@class='ui selection dropdown active visible']/input[@name='gender']"));
//		Select drop = new Select(el); 
//		drop.selectByIndex(1);
		
//		wd.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//		WebElement t= wd.findElement(By.id("select-demo"));
//		Select sel = new Select(t);
//		sel.selectByVisibleText("Sunday");
//		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		sel.selectByValue("Monday");
//		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		sel.selectByIndex(3);
	
		
		
		wd.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement t= wd.findElement(By.xpath("//div[contains(text(),'Selection dropdowns can be initialized directly on a')]//following-sibling::div"));
		t.click();
		wd.findElement(By.xpath("//div[contains(text(),'Selection dropdowns can be initialized directly on a')]//following-sibling::div//child::div[2]/div[text()='Male']")).click();
		wd.findElement(By.xpath("//i//following-sibling::div[@class='ui dropdown selection']")).click();
		
		
		
		
		
		
	}

}
