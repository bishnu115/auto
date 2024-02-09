import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keys_Enumeration {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		driver.get("https://www.google.com");
		WebElement abc=driver.findElement(By.name("q"));
		abc.sendKeys("bishnu");
		abc.sendKeys(Keys.CONTROL,"a");
	}

}
