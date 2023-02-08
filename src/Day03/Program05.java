package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program05 {

	public static void main(String[] args) {
		// automate linkdln
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/signup/cold-join");
		driver.findElement(By.xpath("//input[@name='email-or-phone']")).sendKeys("jj@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//input[@name='first-name']
		driver.findElement(By.xpath("//input[@name='first-name']")).sendKeys("JinsiTest");
		//input[@name='last-name']
		driver.findElement(By.xpath("//input[@name='last-name']")).sendKeys("JinsiTest");
		
		
	}

}

