import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class WebdriverManager {
	
	public static void main(String[] args) throws InterruptedException {
		
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", Path+ "/folder/Geckdriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//Webdrivermanager for firefoxbrowser
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		//WebDriverManager for IEBrowser
//		WebDriverManager.iedriver().setup();
//		//WebDriverManager for chromeBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	
		
		driver.get("https://www.google.com/");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle="Google";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Actual Result ="+ActualTitle );
		driver.findElement(By.name("q")).sendKeys("Indian Movies");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		driver.close();

	}

}
