package junit_test_suite;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicsJunit {
	static WebDriver driver = new FirefoxDriver();
	
	
	/**
	 * What this method dose is?
	 * 	1. Launch fire fox browser.
	 * 	2. Navigate to the web link "http://gmail.com".
	 * 	3. Get the title of the page and print it to the console.
	 */
	@Test
	public void LaunchBrowser() {
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println("The Title of the web page is: "+Title);
	}
	/*
	/**
	 * What this method dose is?
	 * 	1. Once Gmail is loaded, will look for the UserName Element and enter the given Email ID into it.
	 * 	2. The look for the Next Button and click it.
	 * 	3. Once the next password TextBox is loaded, it will fetch Password Element and enter the password.
	 * 	4. Then will look for the Next Button and click on it
	 * 	5. The Elements/Locator's are found using FindElement By Xpath, 
	 * 	6. I have used Implicit wait for the page to load and then capture the Locator's.
	 */
	@Test
	public void Login() {
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("naveen.revalino@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("naveen");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
	}

}
