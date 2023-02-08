package Day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program04 {

	 static WebDriver driver;

	public static void main(String[] args)throws Exception {
		// How to take screen shots in selenium
		
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		screenshot("application");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Jinsi");
		screenshot("Fname");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S J");
		screenshot("Lname");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("TVPM");
		screenshot("Address");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		screenshot("Gender");
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		screenshot("Hobbies");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testjinsi@gmail.com");
		screenshot("email");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999912345");
		screenshot("Phone");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		screenshot("language");
		
	}

	public static void screenshot(String fileName) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desc= new File("./screenShot/"+fileName+".jpeg");
		FileUtils.copyFile(src, Desc);
		
	}
}
