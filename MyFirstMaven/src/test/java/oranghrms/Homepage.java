package oranghrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver = null;
	@BeforeTest
	public void setup() throws InterruptedException {

		//String Path = System.getProperty("user.dir");
		//System.setProperty("webdriver.driver.chromedriver", Path+ "/folder//Oranghrms/Chrome/chromedriver");
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);


	}
	@Test(priority=1)
	public void A_company_bImage() throws InterruptedException {
		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));

		if(image.isDisplayed()) {
			System.out.println("Company-Branding Available");
		}
		else {
			System.out.println("Company-Branding Missing");}
		Thread.sleep(2000);}
	@Test(priority=2)
	public void Label() {
		
		driver.findElement(By.xpath("//label[normalize-space()='Username']"));
		driver.findElement(By.xpath("//label[normalize-space()='Password']"));
		
	}
	@Test(priority=3)
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button[@type='submit']")).click();
		System.out.println("Login funciton Sucessfully");
	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver.quit();

	}



}
