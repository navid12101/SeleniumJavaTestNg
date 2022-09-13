import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;




public class Browser {
	

	public static void main(String[] args) {
		
		//System.setProgerty through with user.dir
		
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+ "/folder\\Geckdriver\\geckodriver.exe");
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle  ="Google";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Your ActualTitle is ="+actualTitle);
		
		
		
	}
	
}
