package Day08;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Program02 {

	public static void main(String[] args) {
		// Switching the windows will be done by the below code from line 20
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		dropdown.selectByValue("search-alias=stripbooks");// directly will select the value from the drop down
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium Java"+Keys.ENTER);// list down all the search list
		driver.findElement(By.xpath("//span[text()='Selenium with Java – A Beginner’s Guide: Web Browser Automation for Testing using Selenium with Java']")).click();
		//Switching the windows will be done by the below code
		
		Set<String> windowsid= driver.getWindowHandles();
		String parentWindowId = driver.getWindowHandle();
		for(String id:windowsid)
			
		{
		driver.switchTo().window(id);
		if(driver.getTitle().contains("Selenium with Java"))
		{
			Select qty= new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			//Select dropQty= new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			System.out.println("Test");
			qty.selectByValue("6");
			driver.findElement(By.id("add-to-cart-button")).click();// will function same as xpath
		}
	}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//span[text()='Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition']")).click();
	}
}
