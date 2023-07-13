package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class websiteloginpage {
	 WebDriver driver;
	 By frameclosebtn=By.xpath("//*[@id=\"survey-close-div\"]/i");
	 By firstname=By.id("RegisterForm-FirstName");
	 By lastname=By.id("RegisterForm-LastName");
	 By email=By.id("RegisterForm-email");
	 By pass=By.id("RegisterForm-password");
	
	public websiteloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void framehandle()
	{
		driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
		driver.findElement(frameclosebtn).click();
		driver.switchTo().defaultContent();	
	}
	public void createaccount()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[2]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/a[2]")).click();
		System.out.println("after");
		driver.findElement(firstname).sendKeys("JOMY");
		driver.findElement(email).sendKeys("jomy.thomas@gmail.com");
		driver.findElement(pass).sendKeys("Jomy@1998098");
		driver.findElement(lastname).sendKeys("Thomas");
		driver.findElement(By.xpath("//*[@id=\"tc-check\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"RegisterForm-dob\"]")).sendKeys("03-07-2002");
		driver.findElement(By.xpath("//*[@id=\"create_customer\"]/button")).click();
	}
}
