package Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program03 {

	public static void main(String[] args) {
		// Search the appliances
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		dropdown.selectByValue("search-alias=appliances");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prestige IRIS Plus 750 watt mixer grinder"+Keys.ENTER);
	}

}
