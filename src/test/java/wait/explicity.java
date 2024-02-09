package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicity {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com");
		WebDriverWait wwait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.close();
	}

}
