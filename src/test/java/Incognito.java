

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Incognito {

	public static void main(String[] args)
	{
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("incognito");
		WebDriver driver =new FirefoxDriver(option);
		driver.get("www.google.com");


	}

}
