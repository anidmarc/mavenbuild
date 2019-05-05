package SampleMaven.SMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	static WebDriver driver = null;

	@Test
	public static void Test() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniruddha Dey\\Downloads\\Selenium driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://testng.org/doc/maven.html");
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
