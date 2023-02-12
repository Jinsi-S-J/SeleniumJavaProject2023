package Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {

	public static void main(String[] args) {
		// list down a company details
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>companyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		System.out.println("The row list are as follows//////////");
		int row=1;
		for(WebElement x:companyList )
		{

			if(x.getText().contains("Bata"))
			{
				break;
			}
			row++;
			
}
		System.out.println(row);
List<WebElement> BataCompanyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+row+"]//td"));
		
		
		for (WebElement x : BataCompanyList) {
			System.out.println(x.getText());
		}
}
}