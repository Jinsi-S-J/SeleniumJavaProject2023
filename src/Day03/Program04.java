package Day03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program04 {

	public static void main(String[] args) {
		// How to select drop down values using xpaths
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropdownSkill.selectByIndex(4);	

	}

}