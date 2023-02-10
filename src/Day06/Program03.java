package Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {

		public static void main(String[] args) {
// framehandlers we have to tell selenium if the element is under frame
		
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.automationtesting.in/Frames.html");
			 driver.switchTo().frame("SingleFrame");// take the id /name
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");	
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

	}

}
