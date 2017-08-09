package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2 {
	@Test
	public void testcase1()
	{    System.setProperty("wedriver.chrome.driver","C:\\Users\\Alka\\workspace\\E2ESeleniumJenkins\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.quit();
	}

}
