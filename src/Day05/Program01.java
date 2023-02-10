package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program01 {

	public static void main(String[] args) {
		// Dragging and Drop in Selenium
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src= driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement desc= driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions x= new Actions(driver);
		x.dragAndDrop(src, desc).build().perform();
		

	}

}
