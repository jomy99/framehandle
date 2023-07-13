package Test;
import Pages.websiteloginpage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class websitelogintest  {
	WebDriver driver;
	@BeforeTest
	
	public void ptesting() throws Exception
	{
		
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
		driver.get("https://mothersparsh.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@Test
public void testing()
{
	websiteloginpage ob=new websiteloginpage(driver);
	
	ob.framehandle();
	ob.createaccount();
}
}
