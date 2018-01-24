package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	/**
	 * 
	 * @param args
	 * This class will have the automated script to launch the Wikipedia web page,
	 * Locate the Drop Down Box in the web page,
	 * Find the number of value's in it, and print it,
	 * Finally will list out all the values of the Drop Down Box to the console.
	 */

	public static void main(String[] args) {
		/**
		 * This method uses the inbuilt functionality of WebDriver to accomplish the task. 
		 */
		
		// This code will initialize the Friefox Web driver, then launch the web site and Print the Title.
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		System.out.println("The Title of the web page is: "+driver.getTitle());
		System.out.println("***************************************************");
		
		// Now we will have to look for the Drop down element in the page and collect the informations in a list.
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		List <WebElement> list = dropdown.getOptions();
		int size = list.size();
		
		// Here we are iterating the values in the drop down box, and printing it to the console.
		System.out.println("The number of value's in the Drop down box is: "+size);
		for(int i=0; i<size; i++) {
			System.out.println(list.get(i).getText());
		}

	}
}
