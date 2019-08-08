package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunction {
	
	public static void main(String[] arg) {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "E:\\SEL\\driver\\chromedriver.exe");
		wd= new ChromeDriver();
		wd.get("http://www.globalsqa.com/demo-site/select-dropdown-menu/");
//		Select sel=new Select(wd.findElement(By.xpath("//h2[text()='Select Country']/following-sibling::div/div/following-sibling::p/select")));
		Select sel=new Select(wd.findElement(By.xpath("//div[@rel-title=\"Select Country\"]/div/following-sibling::p/select")));
		sel.selectByIndex(4);
		
		
		
	}

}
