package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		// automate Google account creation
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TestGoogle");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("TestGoogle345");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("TestPassword");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("TestPassword");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	}

}
