package Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		// web table in selenium
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>headerList= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println("The row list are as follows//////////");
		
		for(WebElement x:headerList)// list out the headers
		{
			System.out.println(x.getText());
		}
		
		System.out.println("The company list are as follows//////////");
		
		List<WebElement>companyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		
		for(WebElement x:companyList)// list out the headers
		{
			System.out.println(x.getText());
		}
		
System.out.println("The %change list are as follows//////////");
		
		List<WebElement>changeList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[5]"));
		
		for(WebElement x:changeList)// list out the headers
		{
			System.out.println(x.getText());
		}
		
	}

}
