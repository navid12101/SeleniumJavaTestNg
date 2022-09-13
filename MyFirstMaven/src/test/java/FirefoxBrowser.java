import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;

public class FirefoxBrowser {
	 @BeforeTest()
	 public void Setup() {
		
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", Path+ "/folder/Geckdriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String actualTitle = driver.getTitle();
		String expectedTitle  ="Google";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Your ActualTitle is ="+actualTitle);

	 }

}
