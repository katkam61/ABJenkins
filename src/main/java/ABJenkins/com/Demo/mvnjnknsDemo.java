package ABJenkins.com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mvnjnknsDemo {

	@Test
	public void google() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Selenium\\\\Drivers\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		System.out.println("title is: "+driver.getTitle());
		
		driver.quit();
		
	}
	
}
