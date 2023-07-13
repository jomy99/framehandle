package Basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Baseclass {
WebDriver driver;
@BeforeTest
public void ptesting() throws Exception
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	driver=new ChromeDriver(options);
	driver.get("https://mothersparsh.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
}

}
