package oranghrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login {
	WebDriver driver = null;
	
	
	@BeforeTest
	public void setup() {
		
		//String Path = System.getProperty("user.dir");
		//System.setProperty("webdriver.driver.chromedriver", Path+ "/folder//Oranghrms/Chrome/chromedriver");
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@Test(priority=1)
	public void matchtitle() throws InterruptedException
	{
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="OrangeHRM";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Actual Result ="+ActualTitle );
		Thread.sleep(15000);
		}
		@Test(priority=2)
		public void imagecapture() throws InterruptedException {
			WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		
		if(image.isDisplayed()) {
				System.out.println("company-branding available");
			}
		else {
			System.out.println("company-branding missing");
			Thread.sleep(5000);
			
			
		}}
		
		@Test(priority=3)
		public void LoginText() throws InterruptedException {
			String  text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
			Thread.sleep(3000);
			String ActualText = "Login";
			String ExpectedText= text;
			Assert.assertEquals(ExpectedText, ActualText);
			if(ExpectedText==text) {
				System.out.println("Your Expected text is correct");

			}
			else {
				System.out.println("Your Expected text is incorrect");

			}
		}
		@Test(priority=4)
		public void userpassword() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		}

		
	@AfterTest
	public void teardown() 
	{
		driver.close();
		
	}
	
	}


