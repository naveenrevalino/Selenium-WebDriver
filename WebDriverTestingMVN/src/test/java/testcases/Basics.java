package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		
		// initializing the WebDriver for FireFox, aet for the browser to launch, and then maximize the window.
	    WebDriver driver=new FirefoxDriver();   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    //This will load the web page.
	    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    // look for the next button and click on it without entering the User name/email ID.
	    driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	    
	    // Then look for the element where the error message is displayed, get the value and print it to the Console.
	    WebElement error=driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]"));
	    String actual=error.getText();
	    System.out.println(actual);
	    
	    // Now enter the email id, wait and then click on Next button.
	    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("naveen.revalino@gmail.com");
	    Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		// Enter the password, wait and click on Next again.
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nav");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		// Wait for the error message to show up and the elements of the page to be loaded.
		// Capture the error message from the screen and print it to the Console.
		Thread.sleep(2000);
		WebElement er=driver.findElement(By.xpath("//*[@id='password']/div[2]/div[2]"));
	    String msg=er.getText();
	    System.out.println(msg);
	    
	    // After the test is done, we close the browser, then close all instance of the browser
	    driver.close();
	    driver.quit();
	    System.out.println("Test Completed.......");
	    }
	}
