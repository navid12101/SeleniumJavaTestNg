import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;

public class IEBrowser {
	public static void main(String[] args) {
		
//String Path = System.getProperty("user.dir");
//System.setProperty("webdriver.driver.chromedriver", Path+ "/folder//Oranghrms/Chrome/chromedriver");
//Launch Chrome********************************************** Browser 
//System.setProperty("webdriver.chrome.driver", "F:\\Automation\\MyFirstMaven\\folder\\chromedriver\\chromedriver.exe"); 
			
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path+"\\folder\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle  ="Google";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Your ActualTitle is ="+actualTitle);
	}

}
