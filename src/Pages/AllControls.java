package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllControls {
	
	public static void main(String arg[])
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\SEL\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.spicejet.com/");
		
		
		
		
		
	}
	
	
}
