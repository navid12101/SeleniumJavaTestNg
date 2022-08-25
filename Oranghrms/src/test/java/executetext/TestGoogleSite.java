package executetext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import pom.GoogleLoginPage;



	public class TestGoogleSite {
	public static void main(String[]args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
		if(image.isDisplayed()) {
				System.out.println("company-branding available");
			}
		else {
			System.out.println("company-branding missing");
		}
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		String ActualText = "Login";
		String ExpectedText= text;
		Assert.assertEquals(ExpectedText, ActualText);
		if(ExpectedText==text) {
			System.out.println("Your Expected text is correct");

		}
		else {
			System.out.println("Your Expected text is incorrect");

		}
		
		Thread.sleep(3000);
		GoogleLoginPage LoginPage = new GoogleLoginPage(driver);
		LoginPage.username.sendKeys("Admin");
		LoginPage.password.sendKeys("admin123");
		LoginPage.clickButton.click();
		Thread.sleep(3000);
		driver.close();
		

		
	}

}
