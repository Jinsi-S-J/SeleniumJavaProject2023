package Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program01 {

	public static void main(String[] args) {
		// alert handling in selenium
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 //driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		 driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 //Thread.sleep(2000);
		 driver.switchTo().alert().accept();

	}

}
