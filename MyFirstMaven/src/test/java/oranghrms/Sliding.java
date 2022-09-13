package oranghrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;

public class Sliding {

	WebDriver driver= null;
	@BeforeTest
	public void setup() throws InterruptedException {

		//String Path = System.getProperty("user.dir");
		//System.setProperty("webdriver.driver.chromedriver", Path+ "/folder//Oranghrms/Chrome/chromedriver");
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			}
	@Test(priority=11)
	public void login() throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		

		driver.findElement(By.xpath("//button[@type='submit']")).click();



		System.out.println("Login funciton Sucessfully");
	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver.quit();

	}

}
