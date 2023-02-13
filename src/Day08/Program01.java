package Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program01 {

	public static void main(String[] args) {
		// window handlers
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		dropdown.selectByValue("search-alias=stripbooks");// directly will select the value from the drop down
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium Java"+Keys.ENTER);// list down all the search list
		driver.findElement(By.xpath("//span[text()='Selenium with Java – A Beginner’s Guide: Web Browser Automation for Testing using Selenium with Java']")).click();
	
	}
	
}
